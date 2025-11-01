# Write your MySQL query statement below

SELECT
    MAX(salary) SecondHighestSalary 
FROM 
    Employee
WHERE salary <> (
            SELECT max(salary) FROM Employee
        )