SELECT first_half.flavor
FROM first_half
     INNER JOIN icecream_info ON first_half.flavor = icecream_info.flavor
WHERE total_order > 3000 AND icecream_info.ingredient_type = 'fruit_based'
ORDER BY first_half.total_order DESC