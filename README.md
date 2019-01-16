# HIBERNATE USED TO PERFORM CRUD METHODS ON MYSQL DATABASE

This application uses Spring Hibernate framework to interact with a MySql database to perform CRUD operations. The runQuery() method can be used to run custom SQL queries. Results are displayed in the console.

Following image shows results of createEmployee(Employee emp) method. Mark is successfully added to the database.
![alt text](https://kashif-ahmed.com/wp-content/uploads/2019/01/DB-1.png)


Following image shows results of readEmployee(int id) method. Employee with ID of 2 was retrieved and their information displayed.
![alt text](https://kashif-ahmed.com/wp-content/uploads/2019/01/r-2.png)

Following image shows results of deleteEmp(int id) and runQuery() methods. Employee with ID of 7 is deleted and then the query "from Employee s where company='UTIL'" is ran to get all Employees working for company ‘UTIL’. Two Employees are returned from the database called Fredrick and John.
![alt text](https://kashif-ahmed.com/wp-content/uploads/2019/01/ud.png)
