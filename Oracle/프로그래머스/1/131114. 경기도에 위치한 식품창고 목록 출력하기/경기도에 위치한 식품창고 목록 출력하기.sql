-- 코드를 입력하세요
SELECT
    warehouse_id,
    warehouse_name,
    address,
    nvl(freezer_yn, 'N') freezer_yn
FROM
    food_warehouse
WHERE 
    address LIKE '경기%'
ORDER BY 
    warehouse_id;