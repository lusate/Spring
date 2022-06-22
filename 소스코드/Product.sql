create user 'product5'@'localhost' identified by 'product5';
create database product5fs character set=utf8;
grant all privileges on product5fs.* to 'product5'@'localhost';
create table product5fs.PRODUCT (
CODE int auto_increment primary key,
NAME varchar(255),
COST int,
COUNT int,
REGISTERDATE datetime
) engine=InnoDB character set = utf8;
Use product5fs;
insert into PRODUCT (NAME, COST, COUNT, REGISTERDATE) 
values ('ItemName4', 1300, 100, now());
