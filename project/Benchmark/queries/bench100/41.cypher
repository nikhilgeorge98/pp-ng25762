MATCH (a:Person)-[:DIRECTED]->(:Movie)
RETURN a.name, COUNT(*) AS movies
ORDER BY movies DESC
LIMIT 10;