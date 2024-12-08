
--Part - A
-- Create the EMPLOYEE table
CREATE TABLE EMPLOYEE (
    Emp_ID INT PRIMARY KEY,
    Emp_Name VARCHAR(50),
    Emp_Salary DECIMAL(10, 2),
    Emp_Department VARCHAR(50),
    Emp_City VARCHAR(50),
    Emp_JoinDate DATE
);

-- Insert provided data into EMPLOYEE table
INSERT INTO EMPLOYEE (Emp_ID, Emp_Name, Emp_Salary, Emp_Department, Emp_City, Emp_JoinDate) VALUES 
(101, 'Rahul', 56000, 'Admin', 'Rajkot', '1990-01-01'),
(102, 'Hardik', 18000, 'IT', 'Ahmedabad', '1990-09-25'),
(103, 'Bhavin', 25000, 'HR', 'Baroda', '1991-05-14'),
(104, 'Bhoomi', 39000, 'Admin', 'Rajkot', '1991-02-08'),
(105, 'Rohit', 17000, 'IT', 'Jamnagar', '1990-07-23'),
(106, 'Priya', 9000, 'IT', 'Ahmedabad', '1990-10-18'),
(107, 'Neha', 34000, 'HR', 'Rajkot', '1991-12-25');

-- Part - B 

-- Create the COMPANY table
CREATE TABLE COMPANY (
    Title VARCHAR(100),
    Company VARCHAR(100),
    Type VARCHAR(50),
    Production_year INT,
    System VARCHAR(10),
    Production_cost DECIMAL(10, 2),
    Revenue DECIMAL(10, 2),
    Rating INT
);

-- Insert provided data into COMPANY table
INSERT INTO COMPANY (Title, Company, Type, Production_year, System, Production_cost, Revenue, Rating) VALUES
('Blasting Boxes', 'Simone Games', 'action adventure', 1998, 'PC', 100000, 200000, 7),
('Run Run Run!', '13 Mad Bits', 'shooter', 2011, 'PS3', 3500000, 650000, 3),
('Duck n’Go', '13 Mad Bits', 'shooter', 2012, 'Xbox', 3000000, 1500000, 5),
('SQL Wars!', 'Vertabelo', 'wargames', 2017, 'Xbox', 5000000, 25000000, 10),
('Tap Tap Hex!', 'PixelGaming Inc.', 'rhythm', 2006, 'PS2', 2500000, 3500000, 7),
('NoRisk', 'Simone Games', 'action adventure', 2004, 'PS2', 1400000, 3400000, 8);
