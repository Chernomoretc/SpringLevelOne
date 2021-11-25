DROP TABLE products IF EXISTS;
CREATE TABLE IF NOT EXISTS products (id bigserial,  title VARCHAR(255),cost int, PRIMARY KEY (id));
INSERT INTO products (title, cost) VALUES ('apple', 10), ('potato', 5), ('banana', 7), ('milk', 12), ('bread', 15);
