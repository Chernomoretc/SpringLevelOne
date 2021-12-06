CREATE TABLE IF NOT EXISTS  products (id bigserial PRIMARY KEY,cost bigserial,  title VARCHAR(255));
INSERT INTO products (title, cost)
VALUES
('apple', 10),
('potato', 5),
('banana', 7),
('milk', 12),
('coffee', 20),
('tea', 17),
--('carrot', 10),
--('beef', 75),
--('chicken', 66),
--('onion', 9),
--('sugar', 29),
--('salt', 15),
--('lemon', 18),
--('orange', 30),
--('pineapple', 85),
--('cheese', 90),
--('egs', 64),
--('cake', 108),
--('chocolate', 27),
--('yogurt', 27),
('bread', 15);