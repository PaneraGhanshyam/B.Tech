--1. Retrieve all data from table DEPOSIT.
SELECT * FROM DEPOSITE

--2. Retrieve all data from table BORROW.
SELECT * FROM BORROW

--3. Retrieve all data from table CUSTOMERS.
SELECT * FROM CUSTOMERS

--4. Insert a record (550,’JAY’,’AJNI’,NULL)in the BORROW table.
INSERT INTO BORROW VALUES(550,'JAY','AJNI',NULL)

--5. Display Account No, Customer Name & Amount from DEPOSIT.
SELECT ACTNO,CNAME,AMOUNT FROM DEPOSITE

--6. Display Loan No, Amount from BORROW
SELECT LOANNO,AMOUNT FROM BORROW

--7. Display loan details of all customers who belongs to ‘ANDHERI’ branch.
SELECT LOANNO,CNAME,AMOUNT FROM BORROW WHERE BNAME='ANDHERI'

--8. Give account no and amount of depositor, whose account no is equals to 106. 
SELECT ACTNO,AMOUNT FROM DEPOSITE WHERE ACTNO='106'

--9. Give name of borrowers having amount greater than 5000.
SELECT CNAME FROM BORROW WHERE AMOUNT>5000

--10. Give name of customers who opened account after date '1-12-96'. 
SELECT CNAME FROM DEPOSITE WHERE ADATE>'1996-12-01'

--11. Display name of customers whose account no is less than 105.
SELECT CNAME FROM DEPOSITE WHERE ACTNO<105

--12. Display name of customer who belongs to either ‘NAGPUR’ Or ‘DELHI’. (OR & IN)SELECT CNAME FROM CUSTOMERS WHERE CITY='NAGPUR' OR CITY='DELHI'--13. Display name of customers with branch whose amount is greater than 4000 and account no is less than 105.SELECT CNAME,BNAME FROM DEPOSITE WHERE AMOUNT>4000 AND ACTNO<105 --14. Find all borrowers whose amount is greater than equals to 3000 & less than equals to 8000.SELECT CNAME FROM BORROW WHERE AMOUNT BETWEEN 3000 AND 8000--15. Find all depositors who do not belongs to ‘ANDHERI’ branch.SELECT CNAME FROM DEPOSITE WHERE BNAME != 'ANDHERI'--16. Display Account No, Customer Name & Amount of such customers who belongs to ‘AJNI’, ‘KAROLBAGH’ Or
--‘M.G.ROAD’ and Account No is less than 104.
SELECT ACTNO,CNAME,AMOUNT FROM DEPOSITE WHERE BNAME='AJNI' OR BNAME='KAROLBAGH' OR BNAME='M.G.ROAD' AND ACTNO<104

--17. Display all the details of first five customers.SELECT TOP 5* FROM DEPOSITE--18. Display all the details of first three depositors whose amount is greater than 1000.SELECT TOP 3* FROM DEPOSITE WHERE AMOUNT>1000--19. Display Loan No, Customer Name of first five borrowers whose branch name does not belongs to ‘ANDHERI’.SELECT TOP 5 LOANNO,CNAME FROM BORROW WHERE BNAME != 'ANDHERI'--20. Retrieve all unique cities using DISTINCT. (Use Customers Table)SELECT DISTINCT CITY FROM --21. Retrieve all unique branches using DISTINCT. (Use Branch Table)SELECT DISTINCT BNAME FROM BRANCH--22. Retrieve all the records of customer table as per their city name in ascending order.SELECT * FROM CUSTOMERS ORDER BY CITY ASC--23. Retrieve all the records of deposit table as per their amount column in descending order.SELECT * FROM DEPOSITE ORDER BY AMOUNT DESC--24. Update deposit amount of all customers from 3000 to 5000.UPDATE DEPOSITE SET AMOUNT=5000 WHERE AMOUNT=3000--25. Change branch name of ANIL from VRCE to C.G. ROAD. (Use Borrow Table)UPDATE BORROW SET BNAME='C.G. ROAD' WHERE CNAME='ANIL'--26. Update Account No of SANDIP to 111 & Amount to 5000. UPDATE DEPOSITE SET ACTNO=111,AMOUNT=5000 WHERE CNAME='SANDIP'--27. Give 10% Increment in Loan AmountUPDATE BORROW SET AMOUNT=AMOUNT+AMOUNT*0.1--28. Update deposit amount of all depositors to 5000 whose account no between 103 & 107UPDATE DEPOSITE SET AMOUNT=5000 WHERE ACTNO BETWEEN 103 AND 107--29. Update amount of loan no 321 to NULL.
UPDATE BORROW SET AMOUNT=NULL WHERE LOANNO=321

--30. Display the name of borrowers whose amount is NULL.
SELECT CNAME FROM BORROW WHERE AMOUNT IS NULL