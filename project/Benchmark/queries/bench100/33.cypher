MATCH (d:Person)-[:DIRECTED]->(m:Movie)
RETURN d.name, COLLECT(m.title) AS directedMovies;