CREATE TABLE IF NOT EXISTS  products (id bigserial PRIMARY KEY,cost bigserial,  title VARCHAR(255));
INSERT INTO products (title, cost)
VALUES
('apple', 10),
('potato', 5),
('banana', 7),
('milk', 12),
('coffee', 20),
('tea', 17),
('carrot', 10),
('beef', 75),
('chicken', 66),
('onion', 9),
('sugar', 29),
('salt', 15),
('lemon', 18),
('orange', 30),
('pineapple', 85),
('cheese', 90),
('egs', 64),
('cake', 108),
('chocolate', 27),
('yogurt', 27),
('bread', 15);

create table users (
  id                    bigserial,
  username              varchar(30) not null unique,
  password              varchar(80) not null,
  email                 varchar(50) unique,
  primary key (id)
);

create table roles (
  id                    serial,
  name                  varchar(50) not null,
  primary key (id)
);

create table authorities (
  id                    serial,
  name                  varchar(50) not null,
  primary key (id)
);

CREATE TABLE users_authorities (
  user_id               bigint not null,
  authority_id               int not null,
  primary key (user_id, authority_id),
  foreign key (user_id) references users (id),
  foreign key (authority_id) references authorities (id)
);

insert into authorities (name)
values
('AUTHORITY_READ'),('AUTHORITY_UPDATE_PRIVILEGE');

insert into users (username, password, email)
values
('user', '$2a$04$Fx/SX9.BAvtPlMyIIqqFx.hLY2Xp8nnhpzvEEVINvVpwIPbA3v/.i', 'user@gmail.com'),
('admin', '$2a$12$Yxcv4FfKr2BG7/qqf69IGuc2y8vrFqgH8rK5MZvSolBSufEqRkKz6', 'admin@gmail.com');

insert into users_authorities (user_id, authority_id)
values
(1, 1),
(2, 2);