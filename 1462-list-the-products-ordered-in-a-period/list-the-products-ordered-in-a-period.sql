# Write your MySQL query statement below

SELECT 
    p.product_name,
    SUM(o1.unit) unit
FROM
    Orders o1
JOIN 
    Products p
ON 
    o1.product_id = p.product_id
WHERE 
    o1.order_date LIKE '2020-02%'
GROUP BY 
    o1.product_id
HAVING 
    unit >= 100