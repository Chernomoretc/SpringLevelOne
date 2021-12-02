DROP TABLE  IF EXISTS products CASCADE;
CREATE TABLE  products (id bigserial,cost bigserial,  title VARCHAR(255), PRIMARY KEY (id));
INSERT INTO products (title, cost) VALUES ('apple', 10), ('potato', 5), ('banana', 7), ('milk', 12), ('bread', 15);

DROP TABLE  IF EXISTS customers CASCADE;
CREATE TABLE   customers (id bigserial PRIMARY KEY, name VARCHAR(255));
INSERT INTO customers (name) VALUES ('Max'),('Alex'),('Harry');

DROP TABLE  IF EXISTS purchases CASCADE;
CREATE TABLE  purchases (id bigserial PRIMARY KEY,purchase_id bigserial ,customer_id bigint REFERENCES customers (id),product bigint  REFERENCES products (id) )
INSERT INTO purchases (purchase_id,customer_id,product) VALUES (1,1,1),(2,2,1),(3,3,3),(1,1,1),(4,2,2),(3,3,3),(5,2,3);
