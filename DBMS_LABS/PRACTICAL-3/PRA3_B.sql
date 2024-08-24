CREATE TABLE CUSTOMER(CID INT, CUSTOMERNAME VARCHAR(50), CONTACTNAME VARCHAR(50), ADDRESS VARCHAR(100), CITY VARCHAR(50), POSTALCODE VARCHAR(50), COUNTRY VARCHAR(50))

SELECT * FROM CUSTOMER

INSERT INTO CUSTOMER VALUES(1,'Alfreds Futterkiste','Maria Anders','Obere Str. 57','Berlin','12209','Germany')
INSERT INTO CUSTOMER VALUES(2,'Ana Trujillo Emparedados y helados','Ana Trujillo','Avda. de la Constitucion 2222','Mexico D.F.','05021','Mexico')
INSERT INTO CUSTOMER VALUES(3,'Antonio Moreno Taqueria','Antonio Moreno','Mataderos 2312',' Mexico D.F.','05023','Mexico')
INSERT INTO CUSTOMER VALUES(4,'Around the Horn','Thomas Hardy','120 Hanover Sq.','London','WA1 1DP','UK')
INSERT INTO CUSTOMER VALUES(5,'Berglunds snabbkop','Christina Berglund','Berguvsvagen 8','Lulea','S-958 22','Sweden')

--1. Return all customers from a city that starts with 'L' followed by one wildcard character, then 'nd' and then two wildcard characters.
SELECT * FROM CUSTOMER WHERE CITY LIKE 'L_ND__'

--2. Return all customers from a city that contains the letter 'L'.
SELECT * FROM CUSTOMER WHERE CITY LIKE '%L%'

--3. Return all customers from a city that do not contains the letter 'L'.
SELECT * FROM CUSTOMER WHERE CITY NOT LIKE '%L%'

--4. Return all customers that starts with 'La'.
SELECT * FROM CUSTOMER WHERE CUSTOMERNAME LIKE 'LA%'

--5. Return all customers that do not starts with 'La'.
SELECT * FROM CUSTOMER WHERE CUSTOMERNAME NOT LIKE 'LA%'

--6. Return all customers that starts with 'a' or starts with 'b'.
SELECT * FROM CUSTOMER WHERE CUSTOMERNAME LIKE '[A,B]%'

--7. Return all customers that starts with 'a' or starts with 'c' or starts with ’t’.
SELECT * FROM CUSTOMER WHERE CUSTOMERNAME LIKE '[A,C,T]%'

--8. Return all customers that starts with 'a' to ’d’.
SELECT * FROM CUSTOMER WHERE CUSTOMERNAME LIKE '[A-D]%'

--9. Return all customers that ends with 'a'.
SELECT * FROM CUSTOMER WHERE CUSTOMERNAME LIKE '%A'

--10. Return all customers that do not ends with 'a'.
SELECT * FROM CUSTOMER WHERE CUSTOMERNAME NOT LIKE '%A'

--11. Return all customers that starts with 'b' and ends with ’s’.
SELECT * FROM CUSTOMER WHERE CUSTOMERNAME LIKE 'B%S'

--12. Return all customers that contains the phrase 'or'.
SELECT * FROM CUSTOMER WHERE CUSTOMERNAME LIKE '%OR%'

--13. Return all customers that starts with "a" and are at least 3 characters in length.
SELECT * FROM CUSTOMER WHERE CUSTOMERNAME LIKE 'A___%'

--14. Return all customers that have "r" in the second position.
SELECT * FROM CUSTOMER WHERE CUSTOMERNAME LIKE '_R%'

--15. Return all customers from Spain.
SELECT * FROM CUSTOMER WHERE COUNTRY LIKE 'SPAIN'