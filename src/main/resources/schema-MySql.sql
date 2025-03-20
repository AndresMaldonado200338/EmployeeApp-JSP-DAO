CREATE DATABASE employee;

USE employee;

DROP TABLE IF EXISTS employee;

CREATE TABLE
    employee (
        id INT PRIMARY KEY,
        name VARCHAR(45) NOT NULL,
        email VARCHAR(45) NOT NULL,
        phone VARCHAR(45) NOT NULL
);