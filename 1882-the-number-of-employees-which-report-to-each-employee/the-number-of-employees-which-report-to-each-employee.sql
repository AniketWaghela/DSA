# Write your MySQL query statement below

SELECT emp.employee_id ,
    emp.name,
    emp2.reports_count ,
    emp2.average_age
FROM Employees emp
JOIN (  
        SELECT 
            reports_to,
            count(*) reports_count ,
            ROUND(sum(age)/count(*)) average_age 
        FROM
            Employees
        GROUP BY 
            reports_to
        HAVING 
            reports_to IS NOT NULL
    ) AS emp2
ON emp.employee_id = emp2.reports_to
ORDER BY employee_id;