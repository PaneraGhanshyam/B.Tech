SELECT * FROM [dbo].[EMPLOYEE2]
SELECT * FROM [dbo].[RESULT]
SELECT * FROM [dbo].[STUDENT2]

--1. Combine information from student and result table using cross join or Cartesian product.
SELECT * FROM STUDENT2 S CROSS JOIN RESULT R

--2. Display Rno, Name, Branch and SPI of all students.
SELECT S.RNO,S.NAME,S.BRANCH,R.SPI FROM STUDENT2 S INNER JOIN RESULT R ON S.RNO = R.RNO

--3. Display Rno, Name, Branch and SPI of CE branch’s student only.
SELECT S.RNO,S.NAME,S.BRANCH,R.SPI FROM STUDENT2 S INNER JOIN RESULT R ON S.RNO = R.RNO WHERE S.BRANCH='CE'

--4. Display Rno, Name, Branch and SPI of other than EC branch’s student only.
SELECT R.RNO,S.NAME,S.BRANCH,R.SPI FROM STUDENT2 S INNER JOIN RESULT R ON S.RNO = R.RNO WHERE S.BRANCH != 'EC'

--5. Display average result of each branch.
SELECT S.BRANCH,AVG(R.SPI) FROM STUDENT2 S INNER JOIN RESULT R ON S.RNO=R.RNO GROUP BY S.BRANCH

--6. Display average result of each branch and sort them in ascending order by SPI.
SELECT S.BRANCH,AVG(R.SPI) [AVRAGE] FROM STUDENT2 S INNER JOIN RESULT R ON S.RNO = R.RNO 
GROUP BY S.BRANCH ORDER BY AVG(R.SPI) ASC

--7. Display average result of CE and ME branch.
SELECT S.BRANCH,AVG(R.SPI) [AVRAGE] FROM STUDENT2 S INNER JOIN RESULT R ON S.RNO =R.RNO  GROUP BY S.BRANCH HAVING S.BRANCH='CE' OR S.BRANCH='ME'

--8. Perform the left outer join on Student and Result tables.
SELECT * FROM STUDENT2 S LEFT JOIN RESULT R ON S.RNO = R.RNO

--9. Perform the right outer join on Student and Result tables.
SELECT * FROM STUDENT2 S RIGHT JOIN RESULT R ON S.RNO = R.RNO

--10. Perform the full outer join on Student and Result tables. 
SELECT * FROM STUDENT2 S FULL JOIN RESULT R ON S.RNO = R.RNO

--11. Retrieve the names of employee along with their manager name from the Employee table.
SELECT E.NAME,M.NAME [MANAGER] FROM EMPLOYEE2 E INNER JOIN EMPLOYEE2 M ON E.MANAGERNO=M.EMPLOYEENO
