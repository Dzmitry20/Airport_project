DROP DATABASE project_25;
CREATE DATABASE project_25;
USE  project_25;
CREATE TABLE pilots (
id INT UNIQUE,
first_name VARCHAR(100),
last_name VARCHAR(100),
rank VARCHAR(100),
pilot_code VARCHAR(100) UNIQUE ,
PRIMARY KEY (id)
);

CREATE TABLE planes (
id INT UNIQUE,
mark VARCHAR(100),
model VARCHAR(100),
capacity INT,
board_number VARCHAR(100) UNIQUE,
PRIMARY KEY (id)
);

CREATE TABLE flights (
id INT UNIQUE,
plane_id INT,
pilot_id INT,
date_ DATE,
time_ TIME,
flight_number VARCHAR(100) UNIQUE,
FOREIGN KEY (plane_id) REFERENCES planes(id),
FOREIGN KEY (pilot_id) REFERENCES pilots(id),
PRIMARY KEY (id)
);







