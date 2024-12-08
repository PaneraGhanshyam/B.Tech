SELECT * FROM [dbo].[DEPARTMENT]
SELECT * FROM [dbo].[PERSON]


--1. Find all persons with their department name & code.
SELECT P.PersonName,D.DepartmentName,D.DepartmentCode FROM PERSON P INNER JOIN DEPARTMENT D ON P.DEPARTMENTID = D.DEPARTMENTID

--2. Find the person's name whose department is located in C-Block.
SELECT P.PersonName FROM PERSON P INNER JOIN DEPARTMENT D ON P.DepartmentID=D.DepartmentID WHERE D.Location='C-BLOCK'
