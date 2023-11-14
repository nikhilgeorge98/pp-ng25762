MATCH (a:Person)-[:ACTED_IN]->(m:Movie)<-[:ACTED_IN]-(b:Person)
WHERE a.born = b.born
RETURN DISTINCT a.name, b.name, a.born as year;