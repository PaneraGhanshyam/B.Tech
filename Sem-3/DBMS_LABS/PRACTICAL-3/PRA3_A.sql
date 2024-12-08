CREATE TABLE STUDENTA(STUID INT, FIRSTNAME VARCHAR(50), LASTNAME VARCHAR(50), WEBSITE VARCHAR(50), CITY VARCHAR(50), DIVISION VARCHAR(50))

SELECT * FROM STUDENTA

INSERT INTO STUDENTA VALUES (1011,'KEYUR','PATEL','TECHONTHENET.COM','RAJKOT','II-BCX')
INSERT INTO STUDENTA VALUES (1022,'Hardik','Shah','digminecraft.COM','Ahmedabad','I-BCY')
INSERT INTO STUDENTA VALUES (1033,'Kajal','Trivedi','bigactivities.COM','Baroda','IV-DCX')
INSERT INTO STUDENTA VALUES (1044,'Bhoomi','Gajera','checkyourmath.COM','Ahmedabad','III-DCW')
INSERT INTO STUDENTA VALUES (1055,'Harmit','Mitel',NULL,'RAJKOT','II-BCY')
INSERT INTO STUDENTA VALUES (1066,'Ashok','Jani',NULL,'Baroda','II-BCZ')

--1. Display the name of students whose name starts with ‘k’.
SELECT FIRSTNAME FROM STUDENTA WHERE FIRSTNAME LIKE 'K%'

--2. Display the name of students whose name consists of five characters.
SELECT FIRSTNAME FROM STUDENTA WHERE FIRSTNAME LIKE '_____'

--3. Retrieve the first name & last name of students whose city name ends with a & contains six characters.
SELECT FIRSTNAME,LASTNAME FROM STUDENTA WHERE CITY LIKE '_____A'

--4. Display all the students whose last name ends with ‘tel’.
SELECT FIRSTNAME FROM STUDENTA WHERE LASTNAME LIKE '%TEL'

--5. Display all the students whose first name starts with ‘ha’ & ends with‘t’.
SELECT FIRSTNAME FROM STUDENTA WHERE FIRSTNAME LIKE 'HA%T'

--6. Display all the students whose first name starts with ‘k’ and third character is ‘y’.
SELECT FIRSTNAME FROM STUDENTA WHERE FIRSTNAME LIKE 'K_Y%'

--7. Display the name of students having no website and name consists of five characters.
SELECT FIRSTNAME FROM STUDENTA WHERE WEBSITE IS NULL AND FIRSTNAME LIKE '_____'

--8. Display all the students whose last name consist of ‘jer’. 
SELECT FIRSTNAME FROM STUDENTA WHERE LASTNAME LIKE '%JER%'

--9. Display all the students whose city name starts with either ‘r’ or ‘b’.
SELECT FIRSTNAME FROM STUDENTA WHERE CITY LIKE 'R%' OR CITY LIKE 'B%'

--10. Display all the name students having websites.
SELECT FIRSTNAME FROM STUDENTA WHERE WEBSITE LIKE '%'

--11. Display all the students whose name starts from alphabet A to H.
SELECT FIRSTNAME FROM STUDENTA WHERE FIRSTNAME LIKE '[A-H]%'

--12. Display all the students whose name’s second character is vowel.
SELECT FIRSTNAME FROM STUDENTA WHERE FIRSTNAME LIKE '_[A,E,I,O,U]%'

--13. Display student’s name whose city name consist of ‘rod’.
SELECT FIRSTNAME FROM STUDENTA WHERE CITY LIKE '%ROD%'

--14. Retrieve the First & Last Name of students whose website name starts with ‘bi’.
SELECT FIRSTNAME,LASTNAME FROM STUDENTA WHERE WEBSITE LIKE 'BI%'

--15. Display student’s city whose last name consists of six characters.
SELECT CITY FROM STUDENTA WHERE LASTNAME LIKE '______'

--16. Display all the students whose city name consist of five characters & not starts with ‘ba’.
SELECT FIRSTNAME FROM STUDENTA WHERE CITY LIKE '_____' AND CITY NOT LIKE 'BA%'

--17. Show all the student’s whose division starts with ‘II’.
SELECT * FROM STUDENTA WHERE DIVISION LIKE 'II%'

--18. Find out student’s first name whose division contains ‘bc’ anywhere in division name.
SELECT * FROM STUDENTA WHERE DIVISION LIKE '%BC%'

--19. Show student id and city name in which division consist of six characters and having website name.
SELECT STUID,CITY FROM STUDENTA WHERE DIVISION LIKE '______' AND WEBSITE LIKE '%'

--20. Display all the students whose name’s third character is consonant.
SELECT * FROM STUDENTA WHERE FIRSTNAME NOT LIKE '__[A,E,I,O,U]%'