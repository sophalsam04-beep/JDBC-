CREATE DATABASE employees;

USE employees;

CREATE TABLE employees (
    id INT,
    name VARCHAR(255),
    salary INT,
    address VARCHAR(300)
);

insert into employees (id,name,salary,address)
values 
(101,"sophal",500,"phnom penh"),
(103,"dara",400,"phnom penh"),
(101,"naroth",300,"phnom penh"),
(101,"kongkea",700,"phnom penh"),

UPDATE employees
SET id = 101
WHERE salary >=300
ORDER BY salary DESC;

