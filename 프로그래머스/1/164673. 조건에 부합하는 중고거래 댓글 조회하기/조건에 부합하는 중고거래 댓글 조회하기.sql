SELECT A.TITLE, B.BOARD_ID, B.REPLY_ID, B.WRITER_ID, B.CONTENTS, DATE_FORMAT(B.CREATED_DATE, "%Y-%m-%d")
FROM USED_GOODS_BOARD as A, USED_GOODS_REPLY as B
WHERE A.BOARD_ID = B.BOARD_ID and DATE_FORMAT(A.CREATED_DATE, "%Y-%m") = '2022-10'
ORDER BY B.CREATED_DATE, TITLE