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
)

type Request struct {
	Query string `json:"query"`
}

func runQuery(ctx context.Context, address string, username string, password string, query string){
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
		panic(err)
	}

	summary := result.Summary
	records := result.Records

	for _, record := range records {
		fmt.Println(record.AsMap())
	}

	fmt.Printf("The query `%v` returned %v records in %+v.\n",
    summary.Query().Text(), len(records),
    summary.ResultAvailableAfter())
}


func run(query string) {
	address := "neo4j://localhost:7687"
	username := "neo4j"
	password := "neo4jubuntu@2023"

	ctx := context.Background()

	runQuery(ctx, address, username, password, query)
}


func Query(w http.ResponseWriter, r *http.Request) {

	var req Request
	jsonErr := json.NewDecoder(r.Body).Decode(&req)
	if jsonErr != nil {
		fmt.Println(jsonErr)
	}
	fmt.Println(req.Query)
	run(req.Query)
}


func main() {

	fmt.Println("Server Part 1...")
	//Part 1
	files, err := os.ReadDir("../Client/cypher-lexer-parser/queries")
    if err != nil {
        return
    }
 
    for _, file := range files {
		if strings.Contains(file.Name(), "test")  || strings.Contains(file.Name(), "fail") {
			continue
		}
		
		fmt.Println(file.Name())
		f, err := os.Open("../Client/cypher-lexer-parser/queries/"+file.Name())
		if err != nil {
			fmt.Println(err)
		}
		
		query:=""
		scanner := bufio.NewScanner(f)
		for scanner.Scan() {
		    line := scanner.Text()
		    // fmt.Println(line) // or do something else with line
			query = query+line
		}
		fmt.Println(query)
		run(query)
    }
	fmt.Println("Finished running preselected queries - Part 1 Complete")

	fmt.Println("Server Part 2...")
	//Part 2
	http.HandleFunc("/query", Query)
	http.ListenAndServe(":8080", nil)
}