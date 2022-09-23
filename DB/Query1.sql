create database ustdb;
show databases;
use ustdb;
create table ust_table(id int not null primary key , name varchar(20),
state varchar(30),
age int);
show tables
desc ust_table;
insert into ust_table values
(1,"abc","kerala",22),
(2,"abd","kerala",22),
(3,"abf","kerala",22);
 



update ust_table  set age= 24 where id = 2;
select * from ust_table;

create table table2 (id int not null primary key,dpt_name varchar(30),city varchar(20));
insert into table2(1,"pkd","cs","kerala"),


select city,dpt_name,state from ust_table join table2 on ust_table.id = table2.id;