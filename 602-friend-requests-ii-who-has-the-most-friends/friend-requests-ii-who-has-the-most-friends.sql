# Write your MySQL query statement below

SELECT id , COUNT(*) AS num
FROM(
    SELECT requester_id id FROM RequestAccepted 
    UNION ALL
    SELECT accepter_id id FROM RequestAccepted 
) AS all_ids
GROUP BY id
ORDER BY num DESC
LIMIT 0,1;