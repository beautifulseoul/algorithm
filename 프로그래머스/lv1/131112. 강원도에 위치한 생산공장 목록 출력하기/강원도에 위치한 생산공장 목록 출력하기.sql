SELECT factory_id, factory_name, address
FROM food_factory
WHERE ADDRESS LIKE '강원도%' 
ORDER BY factory_id