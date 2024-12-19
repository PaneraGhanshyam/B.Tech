--1. Retrieve all data from table DEPOSIT.
SELECT * FROM DEPOSITE

--2. Retrieve all data from table BORROW.
SELECT * FROM BORROW

--3. Retrieve all data from table CUSTOMERS.
SELECT * FROM CUSTOMERS

--4. Insert a record (550,�JAY�,�AJNI�,NULL)in the BORROW table.
INSERT INTO BORROW VALUES(550,'JAY','AJNI',NULL)

--5. Display Account No, Customer Name & Amount from DEPOSIT.
SELECT ACTNO,CNAME,AMOUNT FROM DEPOSITE

--6. Display Loan No, Amount from BORROW
SELECT LOANNO,AMOUNT FROM BORROW

--7. Display loan details of all customers who belongs to �ANDHERI� branch.
SELECT LOANNO,CNAME,AMOUNT FROM BORROW WHERE BNAME='ANDHERI'

--8. Give account no and amount of depositor, whose account no is equals to 106. 
SELECT ACTNO,AMOUNT FROM DEPOSITE WHERE ACTNO='106'

--9. Give name of borrowers having amount greater than 5000.
SELECT CNAME FROM BORROW WHERE AMOUNT>5000

--10. Give name of customers who opened account after date '1-12-96'. 
SELECT CNAME FROM DEPOSITE WHERE ADATE>'1996-12-01'

--11. Display name of customers whose account no is less than 105.
SELECT CNAME FROM DEPOSITE WHERE ACTNO<105

--12. Display name of customer who belongs to either �NAGPUR� Or �DELHI�. (OR & IN)
--�M.G.ROAD� and Account No is less than 104.
SELECT ACTNO,CNAME,AMOUNT FROM DEPOSITE WHERE BNAME='AJNI' OR BNAME='KAROLBAGH' OR BNAME='M.G.ROAD' AND ACTNO<104

--17. Display all the details of first five customers.
UPDATE BORROW SET AMOUNT=NULL WHERE LOANNO=321

--30. Display the name of borrowers whose amount is NULL.
SELECT CNAME FROM BORROW WHERE AMOUNT IS NULL