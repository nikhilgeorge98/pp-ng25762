MATCH (a:Person)-[:REVIEWED]->(:Movie)
RETURN a.name, COUNT(*) AS movies
ORDER BY movies DESC
LIMIT 10;