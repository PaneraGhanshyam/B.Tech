CREATE TABLE CITY (
CITY_ID INT PRIMARY KEY,
NAME VARCHAR(50) UNIQUE,
PINCODE INT NOT NULL,
REMARKS VARCHAR(50));

CREATE TABLE VILLAGE(
VID INT PRIMARY KEY,
V_NAME VARCHAR(50) NOT NULL,
CITY_ID INT REFERENCES CITY(CITY_ID));

INSERT INTO CITY (City_ID, Name, Pincode, Remarks) VALUES
(1, 'Rajkot', '360005', 'Good'),
(2, 'Surat', '335009', 'Very Good'),
(3, 'Baroda', '390001', 'Awesome'),
(4, 'Jamnagar', '361003', 'Smart'),
(5, 'Junagadh', '362229', 'Historic'),
(6, 'Morvi', '363641', 'Ceramic');

INSERT INTO VILLAGE (VID, V_Name, City_ID) VALUES
(101, 'Raiya', 1),
(102, 'Madhapar', 1),
(103, 'Dodka', 3),
(104, 'Falla', 4),
(105, 'Bhesan', 5),
(106, 'Dhoraji', 5);

SELECT * FROM VILLAGE
SELECT * FROM CITY

--1. Display all the villages of Rajkot city. 
SELECT V.V_NAME FROM CITY C INNER JOIN VILLAGE V ON C.CITY_ID=V.CITY_ID WHERE C.NAME='RAJKOT'

--2. Display city along with their villages & pin code.
SELECT C.NAME AS [CITY_NAME],V.V_NAME,C.PINCODE FROM CITY C INNER JOIN VILLAGE V ON C.CITY_ID=V.CITY_ID 

--3. Display the city having more than one village.
SELECT C.NAME FROM CITY C INNER JOIN VILLAGE V ON C.CITY_ID=V.CITY_ID
GROUP BY C.NAME HAVING COUNT(V.V_NAME)>1

--4. Display the city having no village.
SELECT C.NAME
FROM CITY C
LEFT JOIN VILLAGE V ON C.CITY_ID = V.CITY_ID
WHERE V.CITY_ID IS NULL;

--5. Count the total number of villages in each city.
SELECT C.NAME,COUNT(V.VID) AS [COUNT_OF_VILLAGE] 
FROM CITY C LEFT JOIN VILLAGE V ON C.CITY_ID=V.CITY_ID 
GROUP BY C.NAME

--6. Count the number of cities having more than one village.
SELECT COUNT(*) AS [COUNT_OF_CITY]
FROM (
    SELECT C.CITY_ID 
    FROM CITY C
    INNER JOIN VILLAGE V ON C.CITY_ID = V.CITY_ID
    GROUP BY C.CITY_ID
    HAVING COUNT(V.VID) > 1
) AS CitiesWithMultipleVillages;

CREATE TABLE STUDENT (
RNO INT PRIMARY KEY,
NAME VARCHAR(50),
BRANCH VARCHAR(50) DEFAULT 'GENERAL',
SPI DECIMAL(4,2) CHECK (SPI>=0 AND SPI<=10),
BKLOG INT CHECK (BKLOG>=0)
)

INSERT INTO Student (Rno, Name, Branch, SPI, Bklog)
VALUES (101, 'Raju', 'CE', 8.80, 0),
       (102, 'Amit', 'CE', 2.20, 3),
       (103, 'Sanjay', 'ME', 1.50, 6),
       (104, 'Neha', 'EC', 7.65, 0),
       (105, 'Meera', 'EE', 5.52, 2),
       (106, 'Mahesh', 'General', 4.50, 3);

SELECT * FROM STUDENT

-- Try to update SPI of Raju from 8.80 to 12.
UPDATE STUDENT SET SPI=12 WHERE NAME='RAJU';

-- Try to update Bklog of Neha from 0 to -1.
UPDATE STUDENT SET BKLOG=-1 WHERE NAME = 'NEHA';
