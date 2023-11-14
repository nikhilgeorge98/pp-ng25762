MATCH ()-[r:REVIEWED]->(m:Movie)
WHERE r.rating > 90
RETURN m.title, r.rating;