import sys
from antlr4 import *
from antlr4.error.ErrorListener import *
from CypherLexer import CypherLexer
from CypherParser import CypherParser
# from VisitorInterp import VisitorInterp
import json
import requests

class parseErrorListener(ErrorListener):
    def reportAmbiguity(self, recognizer, dfa, startIndex, stopIndex, exact, ambigAlts, configs):
        print("Query could not be parsed, enter a valid query!")

    def reportAttemptingFullContext(self, recognizer, dfa, startIndex, stopIndex, conflictingAlts, configs):
        print("Query could not be parsed, enter a valid query!")

    def reportContextSensitivity(self, recognizer, dfa, startIndex, stopIndex, prediction, configs):
        print("Query could not be parsed, enter a valid query!")

    def syntaxError(self, recogniser, offendingSymbol, line, charPositionInLine, msg, e):
        print("Query could not be parsed, enter a valid query!")


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

    while(1):
        query = input('Enter a Cypher Query: ')
        print("Input Query is: ", query)
        errorCount = main(query)
        
        if errorCount>0:
            continue
        
        request = {
            "query": query
        }
        request_json = json.dumps(request)
        print("Request: ", request_json)

        try:
            response = requests.post(server_url, request_json)
            result = response.json()
            print(json.dumps(result))
        except requests.exceptions.RequestException as e:
            print("Error is sending request/no response: ", e)
        
        # main(sys.argv)