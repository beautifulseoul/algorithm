SELECT b.TITLE
	, b.BOARD_ID
	, r.REPLY_ID
	, r.WRITER_ID
	, r.CONTENTS
    , SUBSTR(r.created_date, 1, 10) AS CREATED_DATE
FROM used_goods_board AS b
	INNER JOIN used_goods_reply AS r on b.board_id = r.board_id
WHERE SUBSTR(b.created_date, 6, 2) = 10
ORDER BY r.created_date, b.title