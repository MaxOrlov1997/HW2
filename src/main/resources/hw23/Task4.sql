SELECT * FROM customer WHERE firstName LIKE'A%'

SELECT * FROM customer where country = 'Ukraine'

SELECT * FROM customer where sex = 'male'

UPDATE customer SET country = 'USA' WHERE YEAR(dateOfBirth) <2000

Delete FROM customer WHERE country='Russia'

SELECT DISTINCT firstName FROM customer

SELECT * FROM customer ORDER BY dateOfBirth desc