###### Simple : INSERT, UPDATE, DELETE

###### Simple Select \* From Table type

###### "INNER JOIN, OUTER JOIN, LEFT OUTER JOIN, RIGHT OUTER JOIN, SELF JOIN"

###### Simple subquery, correlated subquery, IN, NOT IN, ANY, EXISTS, NOT EXISTS

###### Arithmetic, Comparison, Logical

###### 5 most commonly used functions such as CONCAT, AVG, MIN, MAX, NULLIF

###### Order By, Group By, Having

### 

### SQL:

Structured Query Language used to create,manipulate and retrieve data from the database. It is a Relational Database that stores data in rows and columns.

Servers -> Databases -> Schema -> Table -> Views: Virtual table that displays data from one or more tables based on a query.



##### DDL:

Used when we need to deal with the schema of the table.



A)CREATE - CREATE TABLE tablename;

B)DROP - DROP TABLE tablename;

C)ALTER :

1. ADD - ALTER TABLE tablename ADD column\_name datatype;
2. MODIFY - ALTER TABLE tablename MODIFY COLUMN column\_name datatype;
3. DROP - ALTER TABLE tablename DROP COLUMN column\_name;
4. RENAME - ALTER TABLE tablename RENAME COLUMN old\_name TO new\_name;

D) TRUNCATE - TRUNCATE TABLE table\_name; Changes definition-level storage



##### DML:

Used when we manipulate data stored in the table.



1. INSERT - INSERT INTO table\_name(column\_name1 ..) VALUES(value1,value2...)
2. UPDATE - UPDATE table\_name SET column\_name = value WHERE condition; **NOTE: CAN BE USED WITHOUT "WHERE" BUT GENERALLY NOT USED.**
3. DELETE - DELETE FROM table\_name WHERE condition;



##### SELECTING FROM MULTIPLE TABLES:(JOINS)

Used to combines rows of two or more tables based on a related column.



1. Inner Join: Select value FROM table1 **join** table2 ON table1.matching\_column = table2.matching\_column (INTERSECTION)
2. Left Join:  Select value FROM table1 **left join** table2 ON table1.matching\_column = table2.matching\_column
3. Right Join: Select value FROM table1 **right join** table2 ON table1.matching\_column = table2.matching\_column
4. Full Join : Select value FROM table1 **full join** table2 ON table1.matching\_column = table2.matching\_column
5. Self Join : Select a.value,a2.value FROM table1 as a JOIN table2 as a2 ON a.common\_field = a2.common\_field

**NOTE : Self join combines based on ALL MATCHING COLUMN NAMES.**

##### 

##### DATABASE DESIGN:

###### **PRIMARY KEY:**

CREATE TABLE students (

&#x20;   id INT PRIMARY KEY,

&#x20;   name VARCHAR(50)

);



CREATE TABLE courses (

&#x20;   id INT PRIMARY KEY,

&#x20;   course\_name VARCHAR(50)

);



###### **FOREIGN KEY:**

CREATE TABLE student\_courses (

&#x20;   student\_id INT,

&#x20;   course\_id INT,

&#x20;   FOREIGN KEY (student\_id) REFERENCES students(id),

&#x20;   FOREIGN KEY (course\_id) REFERENCES courses(id)

);



##### SIMPLE SUBQUERY AND CORRELATED SUBQUERY:

SIMPLE SUBQUERY is a non-correlated query that does not depends on the outer query.

1. Single subquery: returns exactly one row. SELECT MAX(salary) from employees Where salary = (Select MAX(salary) FROM employees);
2. Multi subquery : returns multiple rows. Select \* from employees where departments IN (Select deptID FROM Departments where location ="LUCKNOW");



CORRELATED SUBQUERY depends on the outer query.

SELECT column1, column2 FROM **table1 as outer** WHERE column1 operator

(SELECT column1 FROM table2 WHERE table2.column2 = outer.column2);



##### OPERATORS IN SQL/SUBQUERIES:

###### IN - Matches values from a list. e.g - Select name from employees where deptId IN (1,2,3);

###### NOT IN - Provides values that are NOT in the list.

###### ANY - Compares a value with ANY ONE VALUE. e.g - Select name from employee where salary > ANY(Select salary from employee where deptID =1);

###### EXISTS - Returns true if the subquery return at least one row.

###### NOT EXISTS - Opposite of EXISTS.

###### NULL IF - returns null if the both the values passed are true otherwise returns the first value.

###### e.g - Select name,NULLIF(Bonus,0) as bonus FROM employee;



##### AGGREGATED FUNCTIONS:

CONCAT - concat(string1/col1,string2/col2);

AVG - Returns the average of the values.

MIN- Returns the minimum value from the list.

MAX- Returns the maximum value from the list.

COUNT - Used to count the number of rows/tuples.

