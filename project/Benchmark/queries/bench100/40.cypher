MATCH (a:Person)-[:ACTED_IN]->(:Movie)
RETURN a.name, COUNT(*) AS movieRoles
ORDER BY movieRoles DESC
LIMIT 10;