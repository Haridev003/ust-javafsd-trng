show databases
use ustdb;
create table worker(
      Worker_id int not null primary key,
      First_name  char(25),
      Last_name char(25),
      Salary int(15),
      Joining_date datetime,
      Department char(25));
      insert into worker values ( 001, 'Monika','Arora',100000,'14-02-20 09.00.00','HR'),
							     ( 002, 'Niharika','Verma',80000,'14-06-11 09.00.00','Admin'),
                                 ( 003, 'Vishal','Singal',300000,'14-02-20 09.00.00','HR'),
                                 ( 004, 'Amitabh','Singh',500000,'14-02-20 09.00.00','Admin'),
                                 ( 005, 'Vivek','Bhati',500000,'14-06-11 09.00.00','Admin'),
                                 ( 006, 'Vipul','Diwan',200000,'14-06-11 09.00.00','Account'),
                                 ( 007, 'Satish','Kumar',75000,'14-01-20 09.00.00','Account'),
                                 ( 008, 'Geetika','Chauhan',90000,'14-04-11 09.00.00','Admin');
  select * from worker;
  create table bonus( Worker_ref_Id int,
                      Bonus_amount int(10),
                      Bonus_date datetime,
                      foreign key ( Worker_ref_Id) references worker (Worker_id));
insert into bonus  values (001,5000,'16-02-20'),
                           (002,3000,'16-06-11'),
                           (003,4000,'16-02-20'),
                           (001,4500,'16-02-20'),
                           (002,3500,'16-06-11');
 select * from bonus;
 select First_name as Worker_name from worker;
 select upper(First_name) from worker;
 select concat(First_name,'',Last_name) as   worker_name, Salary 
			from worker
             where Worker_id in (Select Worker_id from worker where  Salary  between 50000 and 10000);
select Department , count(Worker_id) No_of_Workers from worker
               group by Department order by  No_of_Workers desc;
select distinct w.First_name , t.Worktittle from worker W inner join Tittle t
     on w.Worker_id = T.Worker_ref_Id and t.Worktittle in ('Manager');
     select * from worker  where Depatment like 'Admin%';
     select * from worker where First_name like '%a%';
     select * from worker where  year(Joining_date) = 2014 and month(Joining_date)=2;
     
     
         
                                 
