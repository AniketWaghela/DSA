# Write your MySQL query statement below

SELECT 
    Person_name
    -- SUM(weight) OVER(ORDER BY Turn) AS cum
FROM
    (
        SELECT 
            Person_name,
            -- Turn,
            SUM(weight) OVER(ORDER BY Turn) AS cum
        FROM
            Queue) AS temp
WHERE 
    cum <= 1000
ORDER BY 
    cum DESC LIMIT 1