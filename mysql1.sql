
    -- STORE PROCEDURE IN MYSQL Database
CREATE DATABASE school_db;

USE school_db;
CREATE PROCEDURE GetEmployeeSalary(
  IN emp_id INT,
  OUT emp_salary DECIMAL(10,2),
);

    
        -- SELECT salary INTO emp_salary FROM employees
   BEGIN
    SELECT salary INTO emp_salary FROM employees WHERE id = emp_id;
   END;



