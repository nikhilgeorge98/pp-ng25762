MATCH (a:Person)-[:WROTE]->(:Movie)
RETURN a.name, COUNT(*) AS movies
ORDER BY movies DESC
LIMIT 10;