# Write your MySQL query statement below
SELECT e.name , b.bonus
FROM Employee AS e 
LEFT JOIN Bonus AS b 
ON e.empid = b.empid
WHERE b.bonus IS NULL OR bonus < 1000;
