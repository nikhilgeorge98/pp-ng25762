MATCH (n) WHERE (n.released) IS NOT NULL 
RETURN DISTINCT "node" as entity, n.released AS released LIMIT 25 
UNION ALL 
MATCH ()-[r]-() WHERE (r.released) IS NOT NULL 
RETURN DISTINCT "relationship" AS entity, r.released AS released LIMIT 25;