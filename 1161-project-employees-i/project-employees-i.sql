# Write your MySQL query statement below

SELECT 
    pro.project_id ,
    ROUND(
        SUM(experience_years) /  COUNT(*)
    ,2) AS average_years
FROM 
    project AS pro
JOIN 
    employee AS emp
    ON pro.employee_id = emp.employee_id
GROUP BY 
    pro.project_id;