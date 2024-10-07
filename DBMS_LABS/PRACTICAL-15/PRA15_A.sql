--1. Write a function to print "hello world".
ALTER FUNCTION FN_DISPLAY()
RETURNS VARCHAR(250)
AS
BEGIN 
	RETURN 'Hello World!!!';
END;

SELECT DBO.FN_DISPLAY()	AS message;

--2. Write a function which returns addition of two numbers.

CREATE FUNCTION FN_ADDITION(@A INT,@B INT)
RETURNS INT
AS 
BEGIN
	RETURN @A+@B;
END;

SELECT DBO.FN_ADDITION(10,20) [SUM];

--3. Write a function to print a cube of a given number.
CREATE FUNCTION FN_CUBE(@PARA INT)
RETURNS INT 
AS 
BEGIN
	DECLARE @CUBE INT;
	SET @CUBE=@PARA*@PARA*@PARA;
	RETURN @CUBE;
END;

SELECT DBO.FN_CUBE(5) AS CUBE;

--4. Write a function to check whether the given number is ODD or EVEN.
CREATE OR ALTER FUNCTION FN_ODD_EVEN(@PARA INT)
RETURNS VARCHAR(10)
AS
BEGIN
	IF(@PARA % 2 = 0 )
		RETURN 'EVEN';
	ELSE
		RETURN 'ODD';	
END;

SELECT DBO.FN_ODD_EVEN(10) AS RESULT;
SELECT DBO.FN_ODD_EVEN(11) AS RESULT;

--5. Write a function which returns a table with details of a person whose first name starts with B.
CREATE FUNCTION FUN_TABLE_DATA()
RETURNS @FIRST_NM TABLE(FIRSTNAME VARCHAR(250))
AS
BEGIN
	INSERT INTO @FIRST_NM SELECT  FIRSTNAME FROM PERSON WHERE FIRSTNAME LIKE 'B%';
	RETURN;
END;

SELECT * FROM dbo.FUN_TABLE_DATA() AS RESULT;

--6. Write a function which returns a table with unique first names from the person table.
CREATE FUNCTION FUN_UNIQUE_FIRST_NAMES()
RETURNS @UNIQUE_FIRST_NAMES TABLE (FIRSTNAME VARCHAR(250))
AS
BEGIN
    INSERT INTO @UNIQUE_FIRST_NAMES 
    SELECT DISTINCT FIRSTNAME 
    FROM PERSON;
    
    RETURN;
END;

SELECT * FROM dbo.FUN_UNIQUE_FIRST_NAMES();





