SELECT BOOK_ID, SUBSTR(PUBLISHED_DATE, 1, 10) AS PUBLISHED_DATE FROM book
WHERE SUBSTR(published_date, 1, 4) = '2021'
AND category = '인문'
ORDER BY published_date