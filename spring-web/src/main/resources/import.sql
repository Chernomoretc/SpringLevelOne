DROP TABLE Products IF EXISTS;
CREATE TABLE IF NOT EXISTS Products (id bigserial,cost bigserial,  title VARCHAR(255), PRIMARY KEY (id));
INSERT INTO Products (title, cost) VALUES ('apple', 10), ('potato', 5), ('banana', 7), ('milk', 12), ('bread', 15);
