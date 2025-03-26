# Master List API  

# Project Overview  
This project implements a **Spring Boot REST API** for managing a `master_list` of financial schemes.  
It allows users to **store and retrieve financial scheme details** using PostgreSQL.

# Technologies Used:
- **Spring Boot** – Backend API  
- **PostgreSQL** – Database  
- **Spring Data JPA** – ORM for database operations  
- **Postman** – API testing  

# How to Run the Project:

1️. Install Dependencies  
- **JDK 17+** installed  
- **PostgreSQL** installed and running  
- **IntelliJ IDEA** with Maven  

2️. Set Up PostgreSQL  
- Create a database: `master_list_db`  
- Run the following query in pgAdmin:  
  ```sql
  CREATE TABLE master_list (
      id SERIAL PRIMARY KEY,
      parent_code VARCHAR(50),
      parent_name VARCHAR(100),
      name VARCHAR(100),
      plan VARCHAR(20),
      option VARCHAR(20),
      option_frequency VARCHAR(20),
      transaction_mode_allowed JSONB,
      sub_category VARCHAR(50),
      sector VARCHAR(50),
      benchmark VARCHAR(10),
      face_value INT
  );
