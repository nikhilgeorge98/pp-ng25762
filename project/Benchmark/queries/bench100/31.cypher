MATCH (n) WHERE (n.title) IS NOT NULL 
RETURN DISTINCT "node" as entity, n.title AS title LIMIT 25 
UNION ALL 
MATCH ()-[r]-() WHERE (r.title) IS NOT NULL 
RETURN DISTINCT "relationship" AS entity, r.title AS title LIMIT 25;