use ustdb;
show tables;
desc Employee ;
create view tb_view as select name,state from ust_table;
select * from tb_view;
select * from ust_table;
create index i_name on ust_table (name);
show indexes from ust_table;

