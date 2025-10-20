# Write your MySQL query statement below

SELECT 
    ROUND(
        COUNT(*) / (SELECT COUNT(DISTINCT player_id) FROM Activity)
    ,2) AS fraction 
FROM 
    Activity AS ac1
JOIN (
        SELECT count(DISTINCT player_id) AS total , player_id , MIN(event_date) AS first_log_in
        FROM Activity
        Group BY player_id
    ) AS ac2
    ON ac1.player_id = ac2.player_id 
        AND DATEDIFF(ac1.event_date , first_log_in) = 1;

