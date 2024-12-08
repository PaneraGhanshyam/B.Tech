
-- Part - A

  CREATE TABLE STUDENT(
	StuID int,
	FirstName varchar(100),
	LastName varchar(100),
	Website varchar(200),
	City varchar(50),
	Division varchar(50)
  )

  INSERT INTO STUDENT VALUES
  (1011,'Keyur', 'Patel', 'techonthenet.com', 'Rajkot', 'II-BCX'),
(1022, 'Hardik', 'Shah', 'digminecraft.com', 'Ahmedabad', 'I-BCY'),
(1033, 'Kajal', 'Trivedi', 'bigactivities.com', 'Baroda', 'IV-DCX'),
(1044, 'Bhoomi', 'Gajera', 'checkyourmath.com', 'AhmedabadV', 'III-DCW'),
(1055, 'Harmit', 'Mitel', NULL, 'Rajkot', 'II-BCY'),
(1066, 'Ashok','Jani', NULL, 'Baroda', 'II-BCZ')

--Part B

CREATE TABLE CUSTOMER(
	CID int,
	CustomerName varchar(100),
	ContactName varchar(100),
	Address varchar(200),
	City varchar(50),
	PostalCode varchar(50),
	Country varchar(50)
)

INSERT INTO CUSTOMER VALUES
(1, 'Alfreds Futterkiste', 'Maria Anders', 'Obere Str. 57', 'Berlin', '12209', 'Germany'),
(2, 'AAna Trujillo Emparedados y helados', 'Ana Trujillo', 'Avda. de la Constit', 'Mexico D.F.', '05021', 'Mexico'),
(3, 'Antonio Moreno Taqueria', 'Antonio Moreno', 'Mataderos 2312 ', 'Mexico D.F.', '05023', 'Mexico'),
(4, 'Around the Horn', 'Thomas Hardy', '120 Hanover Sq.', 'London', 'WA1 1DP', 'UK'),
(5, 'Berglunds snabbkop ', 'Christina Berglund', 'Berguvsvagen 8', 'Lulea', 'S-958 22', 'Sweden')

--Part C

create table Customer_2(
CID int,
Name varchar(50),
Age int,
Address varchar(244),
Salary varchar(12)
)
select * from Customer_2

insert into Customer_2 values 
(1, 'Ramesh', 32, 'Ahmedabad', '2000.00'),
(2, 'Khilan', 25, 'Delhi', '1500.00'),
(3, 'Kaushik', 23, 'Kota', '2000.00'),
(4, 'Chaitali', 25, 'Mumbai', '6500.00'),
(5, 'Hardik', 27, 'Bhopal', '8500.00'),
(6, 'Komal', 22, 'Hyderabad', '4500.00'),
(7, 'Muffy', 24, 'Indore', '10000.00')