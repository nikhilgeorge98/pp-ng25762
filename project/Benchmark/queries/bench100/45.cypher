MATCH (d1:Person)-[:DIRECTED]->(m:Movie)<-[:DIRECTED]-(d2:Person)
WHERE d1 <> d2
RETURN DISTINCT d1.name, d2.name;