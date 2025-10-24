# Write your MySQL query statement below

SELECT 
    product_id,
    new_price price
FROM 
    Products
WHERE 
    (product_id,change_date ) IN (
        SELECT 
            product_id  ,
            MAX(change_date) AS date
        FROM 
            Products
        WHERE 
            change_date < '2019-08-17'
        GROUP BY 
            product_id
    )

UNION

SELECT 
    product_id ,
    10 price
FROM 
    Products
GROUP BY 
    product_id
HAVING 
    MIN(change_date) > '2019-08-16'

