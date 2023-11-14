MATCH (n) WHERE (n.tagline) IS NOT NULL 
RETURN DISTINCT "node" as entity, n.tagline AS tagline LIMIT 25 
UNION ALL 
MATCH ()-[r]-() WHERE (r.tagline) IS NOT NULL 
RETURN DISTINCT "relationship" AS entity, r.tagline AS tagline LIMIT 25;