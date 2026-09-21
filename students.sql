    -- CREATE DATABASE
CREATE DATABASE school_db;
USE school_db;

CREATE TABLE students (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(300),
    age INT,
    class_name VARCHAR(200),
);


    -- INSERT DATA
insert into students (id,name,age,class_name)
VALUES
(101,'sophal',22,"Mobile Developments"),
(102,'sophea',25,"UX/UI Designer"),
(103,'sopthea',25,"System Administrator"),


