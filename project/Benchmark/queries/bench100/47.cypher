MATCH (p:Person)-[:DIRECTED]->(m:Movie)<-[:PRODUCED]-(p)
RETURN DISTINCT p.name as actor_producer;