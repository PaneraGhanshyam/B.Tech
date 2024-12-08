SELECT * FROM [dbo].[EMPLOYEE]

--1. Display the Highest, Lowest, Total, and Average salary of all employees. 
--Label the columns Maximum, Minimum, Total_Sal and Average_Sal, respectively.
SELECT 
MAX(Emp_Salary) AS [max],
MIN(Emp_Salary) AS [MIN],
SUM(Emp_Salary) AS [TOTAL],
AVG(Emp_Salary) AS [AVRAGE]
FROM EMPLOYEE

