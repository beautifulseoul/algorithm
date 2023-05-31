SELECT car_type, COUNT(*) AS CARS
FROM car_rental_company_car
WHERE OPTIONS LIKE '%통풍시트%'
OR OPTIONS LIKE '%열선시트%'
OR OPTIONS LIKE '%가죽시트%'
GROUP BY car_type
ORDER BY car_type