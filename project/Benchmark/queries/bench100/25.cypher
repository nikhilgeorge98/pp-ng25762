MATCH (n) WHERE (n.name) IS NOT NULL 
RETURN DISTINCT "node" as entity, n.name AS name LIMIT 25 
UNION ALL 
MATCH ()-[r]-() WHERE (r.name) IS NOT NULL 
RETURN DISTINCT "relationship" AS entity, r.name AS name LIMIT 25;