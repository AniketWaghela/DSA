# Write your MySQL query statement below

SELECT 
    ROUND(
        (COUNT(*) / (SELECT COUNT(distinct customer_id) FROM Delivery ))*100  
    ,2) immediate_percentage 
FROM Delivery AS de
JOIN (
        SELECT customer_id , MIN(order_date) AS first_order_date
        FROM Delivery
        GROUP BY customer_id
    )   AS first_order
    ON de.customer_id = first_order.customer_id 
    AND first_order_date = customer_pref_delivery_date;