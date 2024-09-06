
SELECT * FROM [dbo].[orders]
SELECT * FROM [dbo].[salesmen]
SELECT * FROM [dbo].[customers]

--1. Write a SQL query to find the salesperson and customer who reside in
--the same city. Return Salesman,cust_name and city.
SELECT S.name,C.cust_name,S.city FROM  salesmen S INNER JOIN customers C ON 
S.salesman_id=C.salesman_id WHERE S.city=C.city

--2. Write a SQL query to find those orders where the order amount exists 
--between 500 and 2000. Return ord_no,purch_amt, cust_name, city.
SELECT O.ord_no,O.purch_amt,C.cust_name,C.city FROM orders O INNER JOIN 
customers C ON O.customer_id = C.customer_id WHERE O.purch_amt 
BETWEEN 500 AND 2000

--3. Write a SQL query to find the salesperson(s) and the customer(s) he 
--represents. Return Customer Name, city, Salesman, commission.
SELECT C.cust_name,C.city,S.name AS [SALES_MAN],S.commission FROM 
salesmen S INNER JOIN customers C ON C.salesman_id =S.salesman_id

--4. Write a SQL query to find salespeople who received commissions of 
--more than 12 percent from the company. 
--Return Customer Name, customer city, Salesman, commission. 
SELECT C.cust_name,C.city,S.name AS[SALESMAN_NAME],S.commission FROM 
customers C INNER JOIN salesmen S ON S.salesman_id=C.salesman_id
WHERE S.commission>0.12

--5. Write a SQL query to locate those salespeople who do not live in the same city 
--where their customers live and have received a commission of 
--more than 12% from the company. 
--Return Customer Name, customer city, Salesman, salesman city, commission. 
SELECT C.cust_name,C.city,S.name AS [SALESMAN_NAME],S.city,S.commission 
FROM salesmen S INNER JOIN customers C ON C.salesman_id = S.salesman_id
WHERE C.city != S.city AND S.commission>0.12


--6. Write a SQL query to find the details of an order. 
--Return ord_no, ord_date, purch_amt, Customer Name, grade, Salesman, commission.
SELECT O.ord_no,O.ord_date,O.purch_amt,C.cust_name,C.grade,S.name AS[SALESMAN_NAME],S.commission 
FROM customers C INNER JOIN orders O ON O.customer_id = C.customer_id 
INNER JOIN salesmen S ON S.salesman_id=O.salesman_id

--7. Write a SQL statement to join the tables salesman, customer and orders 
--so that the same column of each table appears once and only the relational rows are returned.
SELECT 
--S.*,C.*,O.* 
S.salesman_id, S.name AS [SALESMAN_NAME], S.commission,S.city AS [SALESMAN_CITY],  
C.customer_id, C.cust_name, C.grade, C.city AS [CUSTOMER_CITY],  
O.ord_no, O.purch_amt, O.ord_date  
FROM salesmen S 
INNER JOIN orders O ON O.salesman_id=S.salesman_id 
INNER JOIN customers C ON C.customer_id=O.customer_id


--8. Write a SQL query to display the customer name, customer city, grade, salesman, salesman city.
--The results should be sorted by ascending customer_id. 
SELECT C.customer_id,C.cust_name,C.city,C.grade,S.name AS [SALESMAN_NAME],S.city 
FROM salesmen S INNER JOIN customers C ON S.salesman_id=C.salesman_id
ORDER BY C.customer_id ASC

--9. Write a SQL query to find those customers with a grade less than 300. 
--Return cust_name, customer city, grade, Salesman, salesmancity. 
--The result should be ordered by ascending customer_id. 
SELECT 
C.customer_id,C.cust_name,C.city AS [CUSTOMER_CITY],C.grade,
S.name AS [SALESMAN_NAME],S.city AS [SALESMAN_CITY] 
FROM customers C INNER JOIN salesmen S ON S.salesman_id=C.salesman_id 
WHERE C.grade<300 ORDER BY C.customer_id ASC

--10. Write a SQL statement to make a report with 
--customer name, city, order number, order date, and order amount in ascending order 
--according to the order date to determine whether any of the existing customers --have placed an order or not.SELECT C.cust_name,C.city,O.ord_no,O.ord_date,O.purch_amt FROM customers C INNER JOIN orders O ON C.customer_id=O.customer_idORDER BY O.ord_date ASC





