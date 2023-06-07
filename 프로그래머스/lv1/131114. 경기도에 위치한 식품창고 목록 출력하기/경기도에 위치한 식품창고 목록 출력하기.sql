SELECT warehouse_id, warehouse_name, address, 
       CASE WHEN freezer_yn IS NULL THEN 'N' ELSE freezer_yn END AS freezer_yn
FROM food_warehouse
WHERE SUBSTR(warehouse_name,4,2) = '경기'
ORDER BY warehouse_id