SELECT * FROM [dbo].[customers]
SELECT * FROM [dbo].[salesmen]
SELECT * FROM [dbo].[orders]

--1. Write a SQL query to calculate total purchase amount of all orders. Return total purchase amount.
SELECT SUM(PURCH_AMT) [TOTAL_PURCH_AMT]FROM [dbo].[orders]

--2. Write a SQL query to calculate the average purchase amount of all orders. Return average purchase amount. 
SELECT AVG(PURCH_AMT) [AVG_PURCH_AMT]FROM [dbo].[orders]

--3. Write a SQL query that counts the number of unique salespeople. Return number of salespeople. 
SELECT COUNT(DISTINCT NAME) [COUNT_UNIQUE_SALESPEOPLE]FROM [dbo].[salesmen]

--5. Write a SQL query to determine the number of customers who received at least one grade for their activity. 
SELECT COUNT(CUSTOMER_ID) FROM [dbo].[customers] WHERE GRADE>=1

--6. Write a SQL query to find the maximum purchase amount. 
SELECT MAX(PURCH_AMT) [MAX_PURCH_AMT]FROM [dbo].[orders]

--7. Write a SQL query to find the minimum purchase amount. 
SELECT MIN(PURCH_AMT) [MIN_PURCH_AMT]FROM [dbo].[orders]

--8. Write a SQL query to find the highest grade of the customers in each city. Return city, maximum grade. 
SELECT CITY,MAX(GRADE) [MAX_GRADE] FROM CUSTOMERS GROUP BY CITY

--9. Write a SQL query to find the highest purchase amount ordered by each customer. Return customer ID, 
--maximum purchase amount. 
SELECT CUSTOMER_ID,MAX(PURCH_AMT) FROM ORDERS GROUP BY CUSTOMER_ID

--10. Write a SQL query to find the highest purchase amount ordered by each customer on a particular date. 
--Return, order date and highest purchase amount.SELECT ORD_DATE,MAX(PURCH_AMT) FROM ORDERS GROUP BY ORD_DATE ORDER BY ORD_DATE 