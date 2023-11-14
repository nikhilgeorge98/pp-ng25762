MATCH (n) WHERE (n.rating) IS NOT NULL 
RETURN DISTINCT "node" as entity, n.rating AS rating LIMIT 25 
UNION ALL 
MATCH ()-[r]-() WHERE (r.rating) IS NOT NULL 
RETURN DISTINCT "relationship" AS entity, r.rating AS rating LIMIT 25;