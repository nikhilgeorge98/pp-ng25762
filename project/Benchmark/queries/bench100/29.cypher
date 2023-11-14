MATCH (n) WHERE (n.summary) IS NOT NULL 
RETURN DISTINCT "node" as entity, n.summary AS summary LIMIT 25 
UNION ALL 
MATCH ()-[r]-() WHERE (r.summary) IS NOT NULL 
RETURN DISTINCT "relationship" AS entity, r.summary AS summary LIMIT 25;