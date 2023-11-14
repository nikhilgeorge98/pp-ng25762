MATCH (n) WHERE (n.roles) IS NOT NULL 
RETURN DISTINCT "node" as entity, n.roles AS roles LIMIT 25 
UNION ALL 
MATCH ()-[r]-() WHERE (r.roles) IS NOT NULL 
RETURN DISTINCT "relationship" AS entity, r.roles AS roles LIMIT 25;