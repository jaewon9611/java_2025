create database test;
use test;
create table milk(
	mno int not null primary key auto_increment,
    mname varchar(50) not null,
    mprice int not null
);
insert into milk values (1 , 'white' , 1500);
insert into milk values (2 , 'choco' , 1500);
insert into milk values (3 , 'banana', 2500);
insert into milk values (4 , 'coffee', 1500);
insert into milk values (5 , 'white' , 1500);
select * from milk;