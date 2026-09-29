# Java JDBC MySQL Insert

This project demonstrates how to **insert data into a MySQL database using Java JDBC**.

The application establishes a connection to MySQL, creates a `Statement`, executes an SQL `INSERT` query using `executeUpdate()`, and displays the number of rows inserted.

## Technologies Used

* Java
* JDBC
* MySQL
* MySQL Connector/J
* Maven
* IntelliJ IDEA

## How It Works

### 1. Establish Database Connection

`DriverManager.getConnection()` is used to connect the Java application to the MySQL database.

### 2. Create Statement

A `Statement` object is created using the database connection.

### 3. Execute INSERT Query

The SQL `INSERT` query is executed using:

`executeUpdate()`

This method is used for SQL operations such as:

* `INSERT`
* `UPDATE`
* `DELETE`

### 4. Get Number of Rows

`executeUpdate()` returns an integer representing the number of rows affected by the SQL operation.

For example:

```text
1 Row Inserted
```

This means one row was successfully inserted.

### 5. Close Connection

After completing the database operation, the database connection is closed.

## Expected Output

```text
1 Row Inserted
```

## MySQL Credentials

Before running the application, make sure MySQL is installed and running.

Required configuration:

* **Host:** `localhost`
* **Port:** `3306`
* **Database:** `college`
* **Username:** `root`
* **Password:** Your MySQL password

## Learning Outcomes

This project helps understand:

* JDBC
* `Connection`
* `DriverManager`
* `Statement`
* `executeUpdate()`
* SQL `INSERT`
* MySQL database connection
* Inserting Java application data into MySQL
* Closing a database connection

## Future Improvements

The project can be extended to demonstrate:

* `SELECT` using `ResultSet`
* `UPDATE` using `executeUpdate()`
* `DELETE` using `executeUpdate()`
* `PreparedStatement`
* Complete CRUD operations
* Reading user input and inserting it into MySQL

## Security Note

Do not upload your actual MySQL password to GitHub.

Use a placeholder or environment variable for database credentials when publishing the project.
