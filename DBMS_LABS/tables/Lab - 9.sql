

---------------------------------- Part A ------------------------------------------------------


-- Table Creation for CITY
CREATE TABLE CITY (
    CityID INT PRIMARY KEY,
    Name NVARCHAR(50) UNIQUE NOT NULL,
    Pincode NVARCHAR(6) NOT NULL,
    Remarks NVARCHAR(50)
);

INSERT INTO CITY (CityID, Name, Pincode, Remarks) VALUES
(1, 'Rajkot', '360005', 'Good'),
(2, 'Surat', '335009', 'Very Good'),
(3, 'Baroda', '390001', 'Awesome'),
(4, 'Jamnagar', '361003', 'Smart'),
(5, 'Junagadh', '362229', 'Historic'),
(6, 'Morvi', '363641', 'Ceramic');

-- Table Creation for VILLAGE
CREATE TABLE VILLAGE (
    VID INT PRIMARY KEY,
    Name NVARCHAR(50) NOT NULL,
    CityID INT,
    FOREIGN KEY (CityID) REFERENCES CITY(CityID)
);

INSERT INTO VILLAGE (VID, Name, CityID) VALUES
(101, 'Raiya', 1),
(102, 'Madhapar', 1),
(103, 'Dodka', 3),
(104, 'Falla', 4),
(105, 'Bhesan', 5),
(106, 'Dhoraji', 5);


-- Student Table Creation
CREATE TABLE Student (
    StudentID INT PRIMARY KEY,
    Name NVARCHAR(50),
    SPI FLOAT CHECK (SPI BETWEEN 0 AND 10),
    Bklog INT CHECK (Bklog >= 0),
    Branch NVARCHAR(50) DEFAULT 'General'
);




