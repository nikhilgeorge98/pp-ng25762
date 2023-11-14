MATCH (a1:Person)-[:ACTED_IN]->(m:Movie)<-[:ACTED_IN]-(a2:Person)
WHERE a1 <> a2
RETURN DISTINCT a1.name as first, a2.name as second;