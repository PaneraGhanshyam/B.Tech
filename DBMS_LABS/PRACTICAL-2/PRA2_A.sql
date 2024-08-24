CREATE TABLE EMPLOYEE(EMPNO INT, EMPNAME VARCHAR(50), JOININGDATE DATE, SALARY DECIMAL(7,2), CITY VARCHAR(50))

SELECT * FROM EMPLOYEE

INSERT INTO EMPLOYEE VALUES(101,'KEYUR','2002-01-05',12000.00,'RAJKOT')
INSERT INTO EMPLOYEE VALUES(102,'HARDIK','2004-02-15',14000.00,'AHMEDABAD')
INSERT INTO EMPLOYEE VALUES(103,'KAJAL','2006-03-14',15000.00,'BARODA')
INSERT INTO EMPLOYEE VALUES(104,'BHOOMI','2005-06-23',12500.00,'AHMEDABAD')
INSERT INTO EMPLOYEE VALUES(102,'HARMIT','2004-02-15',14000.00,'RAJKOT')

--1. Display the name of employee whose salary is greater than 13000 and city is either Rajkot or Baroda.
SELECT EMPNAME FROM EMPLOYEE WHERE SALARY>13000 AND CITY='RAJKOT' OR CITY='BARODA'

--2. Display the name of employee in ascending order by their name.
SELECT EMPNAME FROM EMPLOYEE ORDER BY EMPNAME ASC

--3. Retrieve all unique cities.
SELECT DISTINCT CITY FROM EMPLOYEE

--4. Update the city of Keyur and Bhoomi to NULL.UPDATE EMPLOYEE SET CITY=NULL WHERE EMPNAME='KEYUR' OR EMPNAME='BHOOMI'--5. Display the name of employee whose city is NULL.SELECT EMPNAME FROM EMPLOYEE WHERE CITY IS NULL--6. Delete all the records of Employee table having salary greater than and equals to 14000. DELETE FROM EMPLOYEE WHERE SALARY>=14000	--7. Delete all the Employees who belongs to ‘RAJKOT’ city.DELETE FROM EMPLOYEE WHERE CITY='RAJKOT'--8. Delete all the Employees who joined after 1-1-2007.DELETE FROM EMPLOYEE WHERE JOININGDATE>'2007-1-1'--9. Delete all the records of Employee table. (Use Truncate)TRUNCATE TABLE EMPLOYEE--10. Remove Employee table. (Use Drop)DROP TABLE EMPLOYEE--11. Delete all the records of DEPOSIT table. (Use Truncate)TRUNCATE TABLE DEPOSITE--12. Remove DEPOSIT table. (Use Drop)DROP TABLE DEPOSITE--13. Remove BRANCH table. (Use Drop)DROP TABLE BRANCH--14. Remove CUSTOMERS table. (Use Drop)DROP TABLE CUSTOMERS--15. Remove BORROW table. (Use Drop)DROP TABLE BORROW