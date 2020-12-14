DROP DATABASE IF EXISTS project_25;
CREATE DATABASE project_25;
USE  project_25;
CREATE TABLE pilots (
id INT,
first_name VARCHAR(100) NOT NULL,
last_name VARCHAR(100) NOT NULL,
pilot_rank VARCHAR(100) NOT NULL,
pilot_code VARCHAR(100) UNIQUE NOT NULL ,
PRIMARY KEY (id)
);

CREATE TABLE planes (
id INT,
mark VARCHAR(100) NOT NULL,
model VARCHAR(100) NOT NULL,
capacity INT NOT NULL,
board_number VARCHAR(100) UNIQUE NOT NULL,
PRIMARY KEY (id)
);

CREATE TABLE flights (
id INT,
plane_id INT NOT NULL,
pilot_id INT NOT NULL,
date_ DATE NOT NULL,
time_ TIME NOT NULL,
flight_number VARCHAR(100) UNIQUE NOT NULL,
FOREIGN KEY (plane_id) REFERENCES planes(id),
FOREIGN KEY (pilot_id) REFERENCES pilots(id),
PRIMARY KEY (id)
);







