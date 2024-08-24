SELECT * FROM EMPLOYEE;

--1. Display the Highest, Lowest, Total, and Average salary of all employees. Label the columns Maximum, 
--Minimum, Total_Sal and Average_Sal, respectively.
SELECT MAX(EMP_SALARY) AS 'MAXIMUM',MIN(EMP_SALARY) [MINIMUM], SUM(EMP_SALARY) [TOTAL_SALARY], 
AVG(EMP_SALARY) [AVERAGE SALARY] FROM EMPLOYEE

--2. Find total number of employees of EMPLOYEE table.
SELECT COUNT(Emp_ID) [TOTAL_EMPLOYES] FROM EMPLOYEE

--3. Give maximum salary from IT department.
SELECT MAX(EMP_SALARY) [MAX_SAL_OF_IT_DEPT] FROM EMPLOYEE WHERE Emp_Department='IT'

--4. Count total number of cities of employee without duplication.
SELECT COUNT(DISTINCT EMP_CITY) [COUNT_OF_CITY]FROM EMPLOYEE

--5. Display city with the total number of employees belonging to each city.
SELECT EMP_CITY,COUNT(Emp_ID) [TOTAL_EMPLOYEE]FROM EMPLOYEE GROUP BY EMP_CITY

--6. Display city having more than one employee.
SELECT EMP_CITY,COUNT(EMP_ID) [TOTAL_EMPLOYEE]FROM EMPLOYEE GROUP BY EMP_CITY HAVING COUNT(EMP_ID)>1

--7. Give total salary of each department of EMPLOYEE table.
SELECT Emp_Department,SUM(EMP_SALARY) [TOTAL_SALARY] FROM EMPLOYEE GROUP BY Emp_Department

--8. Give average salary of each department of EMPLOYEE table without displaying the respective department 
--name.SELECT AVG(EMP_SALARY) FROM EMPLOYEE GROUP BY EMP_DEPARTMENT--9. Give minimum salary of employee who belongs to Ahmedabad.SELECT MIN(EMP_SALARY) [MIN_SAL_EMP_AHMEDABAD] FROM EMPLOYEE WHERE EMP_CITY='AHMEDABAD' --10. List the departments having total salaries more than 50000 and located in city Rajkot.SELECT EMP_DEPARTMENT FROM EMPLOYEE WHERE EMP_CITY='RAJKOT' GROUP BY EMP_DEPARTMENT HAVING SUM(EMP_SALARY)>50000 --11. Count the number of employees living in Rajkot.
SELECT COUNT(*) [COUNT_OF_EMP_RAJKOT] FROM EMPLOYEE WHERE EMP_CITY='RAJKOT'

--12. Display the difference between the highest and lowest salaries. Label the column DIFFERENCE.
SELECT MAX(EMP_SALARY)-MIN(EMP_SALARY) [DIFFERENCE] FROM EMPLOYEE

--13. Display the total number of employees hired before 1st January, 1991.
SELECT COUNT(*) FROM EMPLOYEE WHERE Emp_JoinDate < '1991-01-01'

--14. Display total salary of each department with total salary exceeding 35000 and sort the 
--list by total salary.
SELECT EMP_DEPARTMENT,SUM(EMP_SALARY) AS 'TOTAL_SALARY' FROM EMPLOYEE 
GROUP BY EMP_DEPARTMENT HAVING SUM(EMP_SALARY)>35000 ORDER BY SUM(EMP_SALARY) 

--15. List out department names in which more than two employees.
SELECT EMP_DEPARTMENT,COUNT(*) [COUNT_EMP] FROM EMPLOYEE GROUP BY EMP_DEPARTMENT HAVING COUNT(*)>2