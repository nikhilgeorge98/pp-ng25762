import sys
from antlr4 import *
from antlr4.error.ErrorListener import *
from CypherLexer import CypherLexer
from CypherParser import CypherParser
# from VisitorInterp import VisitorInterp
import json
import requests
import sqlite3
import os

class parseErrorListener(ErrorListener):
    def reportAmbiguity(self, recognizer, dfa, startIndex, stopIndex, exact, ambigAlts, configs):
        print("Query could not be parsed, enter a valid query!")

    def reportAttemptingFullContext(self, recognizer, dfa, startIndex, stopIndex, conflictingAlts, configs):
        print("Query could not be parsed, enter a valid query!")

    def reportContextSensitivity(self, recognizer, dfa, startIndex, stopIndex, prediction, configs):
        print("Query could not be parsed, enter a valid query!")

    def syntaxError(self, recogniser, offendingSymbol, line, charPositionInLine, msg, e):
        print("Query could not be parsed, enter a valid query!")


def discardCache(db):
    conn = sqlite3.connect(db)
    cur = conn.cursor()
    cur.execute("DROP TABLE IF EXISTS cache")
    conn.commit()
    conn.close()


def clearCache(db):
    conn = sqlite3.connect(db)
    cur = conn.cursor()
    cur.execute("DELETE FROM cache")
    conn.commit()
    conn.close()


def writeCache(db, query, result, exec_time):
    conn = sqlite3.connect(db)
    cur = conn.cursor()
    cur.execute("INSERT INTO cache VALUES(?, ?, ?)", (query, result, exec_time, ))
    conn.commit()
    conn.close()


def readCache(db, query):
    conn = sqlite3.connect(db)
    cur = conn.cursor()
    cur.execute("SELECT result FROM cache WHERE query=?", (query, ))
    res = cur.fetchone()
    conn.commit()
    conn.close()
    
    if res:
        return res[0]
    else:
        return None
    

def main(arg):
    if arg.lower().endswith(('.txt', '.cypher')):
        input_stream = FileStream(arg)
    else:
        input_stream = InputStream(arg)

    lexer = CypherLexer(input_stream)
    stream = CommonTokenStream(lexer)
    parser = CypherParser(stream)
    parser.removeErrorListeners()
    parser.addErrorListener(parseErrorListener())
    tree = parser.oC_Cypher()
    
    return parser.getNumberOfSyntaxErrors()


if __name__ == '__main__':

    server_url = "http://localhost:8080/query"
    res_json_file = "/home/nikhil/pp-ng25762/project/Client/data/res.json"
    
    localDB = "local.db"

    discardCache(localDB)
    
    conn = sqlite3.connect(localDB)
    cur = conn.cursor()
    cur.execute("CREATE TABLE IF NOT EXISTS cache(query TEXT PRIMARY KEY, result TEXT, exec_time INT)")
    # cur.execute("CREATE TABLE IF NOT EXISTS benchmark(query TEXT PRIMARY KEY, times_exec INT, total_time INT)")
    conn.commit()
    conn.close()

    write_query_keywords = ["CREATE", "SET", "DELETE", "MERGE", "REMOVE"]

    while(1):
        print()
        query = input('Enter a Cypher Query: ')
        errorCount = main(query)
        
        if errorCount>0:
            continue

        cached = readCache(localDB, query)
        
        if cached is not None:
            print("Found in cache:")
            print(cached)
            result_json = json.dumps(json.loads(resp_json['result']), indent = 2)
            with open(res_json_file, "w") as f:
                f.write(result_json)
        else:
            request = {
                "query": query
            }
            request_json = json.dumps(request)
            print("Sending Request: ", request_json)

            try:
                response = requests.post(server_url, request_json)

                if response.status_code == 200:
                    resp_json = response.json()

                    if resp_json['status']=='success':
                        if any(keyword in query.upper() for keyword in write_query_keywords):
                            print("Write query, clearing cache...")
                            clearCache(localDB)
                        else:
                            print("Read query, caching result: ", resp_json['result'], resp_json['exec_time'])
                            writeCache(localDB, query, resp_json['result'], resp_json['exec_time'])

                        result_json = json.dumps(json.loads(resp_json['result']), indent = 2)
                        with open(res_json_file, "w") as f:
                            f.write(result_json)

                    elif resp_json['status']=='failed':
                        print(resp_json['result'])

                else:
                    print("Error: ", response.status_code)

            except requests.exceptions.RequestException as e:
                print("Error in sending request/no response: ", e)