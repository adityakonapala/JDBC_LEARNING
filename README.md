# JDBC Learning – Java & MySQL

A beginner-friendly Java project to learn **JDBC (Java Database Connectivity)** and perform CRUD operations using Java and MySQL.

This project contains practical examples of connecting a Java application to a MySQL database, executing SQL queries, and managing database records using JDBC.

## 📚 Concepts Covered

- JDBC architecture and database connectivity
- JDBC Driver and `DriverManager`
- `Connection`
- `Statement`
- `PreparedStatement`
- `ResultSet`
- CRUD operations (Create, Read, Update, Delete)
- `executeQuery()` vs `executeUpdate()`
- `SQLException` handling
- SQL injection prevention using parameterized queries
- Database transactions
- `commit()` and `rollback()`
- Try-with-resources for resource management

## 🛠️ Technologies Used

- **Java** – Programming language
- **JDBC** – Database connectivity
- **MySQL** – Relational database
- **MySQL Connector/J** – JDBC driver
- **Visual Studio Code** – Development environment
- **Git & GitHub** – Version control

## 📂 Project Structure

```text
JDBC-Learning/
│
├── src/
│   ├── Insert.java
│   ├── Select.java
│   ├── Update.java
│   ├── Delete.java
│   ├── PrepStmtInsert.java
│   ├── PrepStmtSelect.java
│   ├── PrepStmtUpdate.java
│   ├── PrepStmtDelet.java
│   └── jdbcInterview.java
│
├── lib/
│   └── mysql-connector-j-26.7.0.jar
│
├── .gitignore
└── README.md
```

*Note: The structure above represents the main files from my learning project. The JDBC driver JAR is kept locally and excluded from GitHub.*

## ⚙️ Prerequisites

Before running the examples, install:

1. Java JDK
2. MySQL Server
3. Visual Studio Code or another Java IDE
4. MySQL Connector/J JDBC driver

## 🗄️ Database Setup

Create a database in MySQL:

```sql
CREATE DATABASE college;
```

Select the database:

```sql
USE college;
```

Create a sample table:

```sql
CREATE TABLE students (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL
);
```

The table structure may need to be adjusted if individual Java examples use different columns.

## 🔌 Database Connection

The JDBC connection URL follows this format:

```text
jdbc:mysql://localhost:3306/college
```

The connection requires:

- Database URL
- MySQL username
- MySQL password

Configure the correct credentials on your local machine before running the programs.

**Security:** Actual database passwords and private credentials should never be committed to GitHub.

## 🚀 CRUD Operations

This project demonstrates the four fundamental database operations.

### 1. Create – INSERT

Insert new student records into the database.

```sql
INSERT INTO students (name, email)
VALUES ('Rahul', 'rahul@example.com');
```

### 2. Read – SELECT

Retrieve student records from the database.

```sql
SELECT * FROM students;
```

### 3. Update – UPDATE

Modify existing student information.

```sql
UPDATE students
SET email = 'newemail@example.com'
WHERE id = 1;
```

### 4. Delete – DELETE

Remove a student record.

```sql
DELETE FROM students
WHERE id = 1;
```

The Java examples demonstrate executing these operations through JDBC.

## 🆚 Statement vs PreparedStatement

The project includes examples using both `Statement` and `PreparedStatement`.

- **Statement:** Executes SQL statements directly.
- **PreparedStatement:** Uses parameterized queries with `?` placeholders and helps prevent SQL injection.

`PreparedStatement` is generally preferred when working with user input.

## ▶️ How to Run

1. Clone or download this repository.
2. Install Java JDK and MySQL Server.
3. Create the `college` database and the required tables.
4. Download MySQL Connector/J and configure it in your local Java project.
5. Configure your database connection URL, username, and password.
6. Open the project in Visual Studio Code.
7. Run the required Java file, such as `Select.java` or `PrepStmtInsert.java`.

The JDBC driver JAR is not included in the repository, so it must be configured locally before running the examples.

## 🔐 Security and Git

The `.gitignore` file excludes compiled Java files, JAR files, IDE settings, and local credential/configuration files.

Database credentials should be stored locally and must not be hardcoded with real passwords in source files.

## 🎯 Project Goal

The goal of this project is to build a strong foundation in JDBC, understand how Java applications interact with relational databases, and practice writing SQL queries through Java.

This project is part of my journey toward becoming a Java Developer.

## 👨‍💻 Author

**Aditya Konapala**

