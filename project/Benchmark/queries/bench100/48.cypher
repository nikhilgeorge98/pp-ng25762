MATCH (p:Person)-[:DIRECTED]->(m:Movie)<-[:WROTE]-(p)
RETURN DISTINCT p.name as actor_writer, m.title as movie;