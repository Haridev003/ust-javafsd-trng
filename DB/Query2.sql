use  ustdb;
create table Employee ( Emp_id int not null primary key , Manger_id  int , Firstname varchar(50) not null,
Lastname varchar(50) not null, Emptittile varchar(50) not null , Salary varchar(50) not null,
Joiningdate varchar(50) not null, Dep varchar(50) not null);
desc Employee
insert into Employee values (( 1, Null ,"Monika","Arora","Manager","100000","02/20/14  9:00", "HR"),
( 2, 1 ,"Niharika","Verma","Excutive","8000","06/11/14  9:00", "Admin"),
( 3, 1 ,"Vishal","Singhal","Excutive","30000","02/11/14  9:00", "HR"),
( 4, Null ,"Amitabh","Singh","Manager","50000","02/11/14  9:00", "Admin"),
( 5, 4 ,"Vivek","Bhati","Asst.Manager","50000","06/11/14  9:00", "Admin"),
 ( 6, 5 ,"Vipul","Diwan","Excutive","20000","06/11/14  9:00", "Account"),
( 7, 4 ,"Satish","Kumar","Lead","75000","01/11/14  9:00", "Account"),
( 8, 4 ,"Geetika","Chauhan","Lead","90000","04/11/14  9:00", "Admin"));
 select * from  Employee ;
 select Firstname,Lastname from Employee where Salary between 50000 and 100000;
 select e1.Firstname as employeename , e2.Firstname as managername from Employee  e1, Employee e2 where e2.Emp_id=e1.Manger_id;
 select count(Emp_id) ,Dep from Employee group by Dep  order by Dep desc;
select  * from Employee where Manger_id is Null;
select count( Emp_id) as Count from Employee where Joiningdate  >= "01/01/14" and Joiningdate <= "12/31/14";
