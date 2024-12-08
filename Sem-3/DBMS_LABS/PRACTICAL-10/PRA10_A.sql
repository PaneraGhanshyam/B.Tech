SELECT * FROM STUDENT
SELECT * FROM ACADEMIC
SELECT * FROM DEPARTMENT

--1. Display details of students who are from computer department.
SELECT * FROM STUDENT WHERE DID = (SELECT DID FROM DEPARTMENT WHERE DName='COMPUTER');

--2. Displays name of students whose SPI is more than 8.
SELECT NAME FROM STUDENT WHERE RNO IN(SELECT Rno FROM ACADEMIC WHERE SPI>8);

--3. Display details of students of computer department who belongs to Rajkot city.
SELECT * FROM STUDENT WHERE CITY='RAJKOT' AND DID =(SELECT DID FROM DEPARTMENT WHERE DName='COMPUTER');

--4. Find total number of students of electrical department.
SELECT COUNT(RNO) AS [number of students of electrical department] 
FROM STUDENT WHERE DID=(SELECT DID FROM DEPARTMENT WHERE DNAME='ELECTRICAL');

--5. Display name of student who is having maximum SPI.
SELECT NAME FROM STUDENT WHERE RNO IN 
(SELECT RNO FROM ACADEMIC WHERE SPI = (SELECT MAX(SPI) FROM ACADEMIC));

--6. Display details of students having more than 1 backlog.
SELECT * FROM STUDENT WHERE RNO IN (SELECT RNO FROM ACADEMIC WHERE Bklog>1);

--7. Display name of student who is having second highest SPI.
SELECT NAME FROM STUDENT WHERE RNO = 
(SELECT TOP 1 RNO FROM ACADEMIC WHERE SPI < (SELECT MAX(SPI) FROM ACADEMIC) ORDER BY SPI DESC);

--8. Display name of students who are either from computer department or from mechanical department.
SELECT NAME FROM STUDENT WHERE DID IN 
(SELECT DID FROM DEPARTMENT WHERE DNAME='MECHANICAL' OR DNAME='COMPUTER')

--9. Display name of students who are in same department as 102 studying in.
SELECT NAME FROM STUDENT WHERE DID IN (SELECT DID FROM STUDENT WHERE RNO=102);

--10. Display name of students whose SPI is more than 9 and who is from electrical department. 
SELECT NAME FROM STUDENT WHERE 
RNO IN (SELECT RNO FROM ACADEMIC WHERE SPI>9) AND 
DID = (SELECT DID FROM DEPARTMENT WHERE DNAME='ELECTRICAL');