MATCH (n) WHERE (n.born) IS NOT NULL 
RETURN DISTINCT "node" as entity, n.born AS born LIMIT 25 
UNION ALL 
MATCH ()-[r]-() WHERE (r.born) IS NOT NULL 
RETURN DISTINCT "relationship" AS entity, r.born AS born LIMIT 25;