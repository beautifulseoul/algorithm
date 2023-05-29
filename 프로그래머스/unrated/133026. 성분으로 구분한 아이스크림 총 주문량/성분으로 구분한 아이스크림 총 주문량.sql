SELECT icecream_info.ingredient_type, SUM(first_half.total_order)
FROM first_half
    INNER JOIN icecream_info ON first_half.flavor = icecream_info.flavor
GROUP BY icecream_info.ingredient_type