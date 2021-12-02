--DROP TABLE Products IF EXISTS;
--CREATE TABLE IF NOT EXISTS Products (id bigserial,cost bigserial,  title VARCHAR(255), PRIMARY KEY (id));
--INSERT INTO Products (title, cost) VALUES ('apple', 10), ('potato', 5), ('banana', 7), ('milk', 12), ('bread', 15);
DROP TABLE  IF EXISTS customers CASCADE;
CREATE TABLE   customers (id bigserial PRIMARY KEY, name VARCHAR(255));
INSERT INTO customers (name) VALUES ('Max'),('Alex'),('Harry');

DROP TABLE  IF EXISTS purchases CASCADE;
CREATE TABLE IF NOT EXISTS purchases (id bigserial PRIMARY KEY,customer_id integer REFERENCES customers (id),products VARCHAR(255) )
INSERT INTO purchases (customer_id,products) VALUES (1,'h'),(2,'he'),(3,'hell');
