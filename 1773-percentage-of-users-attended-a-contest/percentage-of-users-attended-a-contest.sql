# Write your MySQL query statement below

SELECT 
    reg.contest_id,
    ROUND((COUNT(*)/ (SELECT count(user_id) FROM Users))*100,2) AS percentage 
FROM 
    register AS reg
JOIN 
    users AS us
    ON reg.user_id = us.user_id
GROUP BY 
    contest_id
ORDER BY 
    percentage DESC , reg.contest_id ASC;