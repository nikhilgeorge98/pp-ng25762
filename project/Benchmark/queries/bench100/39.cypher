MATCH (d:Person)-[:DIRECTED]->(m:Movie)<-[s:REVIEWED]-(r:Person)
RETURN d.name, AVG(s.rating) AS avgRating;