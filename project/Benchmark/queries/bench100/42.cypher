MATCH (a:Person)-[:PRODUCED]->(:Movie)
RETURN a.name, COUNT(*) AS movies
ORDER BY movies DESC;