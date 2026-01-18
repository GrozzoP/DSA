# Write your MySQL query statement below
WITH ranked_salaries AS (
    SELECT salary,
    DENSE_RANK() OVER (ORDER BY salary DESC) AS ranking 
    FROM Employee 
)
SELECT 
    MAX(salary) AS SecondHighestSalary
FROM ranked_salaries
WHERE ranking = 2