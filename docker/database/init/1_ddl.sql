CREATE TABLE user (
  id   int NOT NULL AUTO_INCREMENT,
  user_name varchar(255) not null,
  email varchar(255) not null,
  password varchar(255),
  PRIMARY KEY (id)
);

grant all privileges
on *.* to demo_u@"%"
identified by 'demo_pw' with grant option;