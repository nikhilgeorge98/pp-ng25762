package main

import (
	"fmt"
	"net/http"
	"encoding/json"
	"github.com/neo4j/neo4j-go-driver/v5/neo4j"
	"context"
	"os"
	"bufio"
	"strings"
	"time"
)

type Request struct {
	Query string `json:"query"`
}

type Response struct {
	Status string `json:"status"`
	Result string `json:"result"`
	Exec_time time.Duration `json:"exec_time"`
}

func runQuery(ctx context.Context, address string, username string, password string, query string) (res Response){
	driver, err := neo4j.NewDriverWithContext(address, neo4j.BasicAuth(username, password, ""))
	if err != nil {
		panic(err)
	}
	defer driver.Close(ctx)

	err = driver.VerifyConnectivity(ctx)
	if err!= nil {
		panic(err)
	}

	result, err := neo4j.ExecuteQuery(ctx, driver,
		query,
		nil,
		neo4j.EagerResultTransformer,
		neo4j.ExecuteQueryWithDatabase("neo4j"))
	if err!= nil {
		// panic(err)
		fmt.Println("Error in query execution: ", err)
		return Response{Status: "failed", Result: "Error in query execution", Exec_time: -1*time.Second}
		// return Response{Status: "failed", Result: append(respRes, "Error in query execution"), Exec_time: -1*time.Second}
	}

	summary := result.Summary
	records := result.Records

	var respRes []string

	for _, record := range records {
		jsonStr, _ := json.Marshal(record)
		fmt.Println(string(jsonStr))
		respRes = append(respRes, string(jsonStr), ",")
	}

	// resJson, _ := json.Marshal(respRes)
	// fmt.Println("ResultsJSON: ", string(resJson))
	if len(respRes) > 1{
		respRes = respRes[:len(respRes) - 1]
	}
	fmt.Println("Results: ", respRes)

	fmt.Printf("The query `%v` returned %v records in %+v.\n",
    summary.Query().Text(), len(records),
    summary.ResultAvailableAfter())

	return Response{Status: "success", Result: fmt.Sprintf("%v", respRes), Exec_time: summary.ResultAvailableAfter()}
	// return Response{Status: "success", Result: respRes, Exec_time: summary.ResultAvailableAfter()}
}


func run(query string) (res Response){
	address := "neo4j://localhost:7687"
	username := "neo4j"
	password := "neo4jubuntu@2023"

	ctx := context.Background()

	res = runQuery(ctx, address, username, password, query)

	return
}


func Query(w http.ResponseWriter, r *http.Request) {

	var req Request
	jsonErr := json.NewDecoder(r.Body).Decode(&req)
	if jsonErr != nil {
		fmt.Println(jsonErr)
	}
	fmt.Println("Received: ", req.Query)
	res := run(req.Query)

	w.Header().Set("Content-Type", "json")
	json.NewEncoder(w).Encode(res)
}


func main() {

	fmt.Println("Server Part 1...")
	//Part 1
	query_dir := "../Client/cypher-lexer-parser/queries/example/"
	files, err := os.ReadDir(query_dir)
    if err != nil {
        return
    }
 
    for _, file := range files {
		if strings.Contains(file.Name(), "test")  || strings.Contains(file.Name(), "fail") || strings.Contains(file.Name(), "trial" ) {
			continue
		}
		
		fmt.Println()
		fmt.Println("Filename: ", file.Name())
		f, err := os.Open(query_dir+file.Name())
		if err != nil {
			fmt.Println(err)
		}
		
		query:=""
		scanner := bufio.NewScanner(f)
		for scanner.Scan() {
		    line := scanner.Text()
		    // fmt.Println(line)
			query = query+line
		}
		fmt.Println("Query: ", query)
		run(query)
    }
	fmt.Println("Finished running preselected queries - Part 1 Complete")
	fmt.Println()

	fmt.Println("Server Part 2...")
	//Part 2
	http.HandleFunc("/query", Query)
	http.ListenAndServe(":8080", nil)
}