# Write your MySQL query statement below

SELECT today.id 
FROM weather as today
CROSS JOIN weather as yesterday
WHERE DATEDIFF(today.recordDate , yesterday.recordDate) = 1
    AND today.temperature > yesterday.temperature
; 