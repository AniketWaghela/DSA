# Write your MySQL query statement below

SELECT 
    USER_ID,
    COUNT(*) AS followers_count 
FROM 
    Followers
GROUP BY 
    user_id
ORDER BY 
    user_id ASC;