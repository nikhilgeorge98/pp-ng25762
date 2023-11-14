MATCH (a:Person)-[:ACTED_IN]->(:Movie)
WHERE a.born = 1985
RETURN DISTINCT a.name;