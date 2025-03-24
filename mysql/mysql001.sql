## ■001. DB

create database test;   -- 만드세요 데이터베이스 데이터베이스명
show databases;        -- 데이터베이스 목록들확인
drop database test;    -- 데이터베이스 삭제
show databases;        -- 데이터베이스 목록들확인

## database  mbasic , test 만들기
create database mbasic;
create database test;
create database coffee;
create database milk;
create database score;
create database emp;
create database dept;
create database salagrade;
show databases;



## ■002. Table 
# 1. rdb : 관계형데이터베이스  - 테이블(Entity)들의 관계(Relationship) 외래키(Attribute)
# 2. 데이터베이스 언어 
#   정의어  DDL - create, alter, drop - cad
#   조작어  DML - insert, select, update, delete  -   crud 
#   제어어  DCL - grant, revoke
/* 
- 저장소안에 분류표
----------------------------------
create table 테이블명(
   필드1   자료형  속성,
   필드2  자료형  속성
);
----------------------------------
자료형
   1) 숫자 - int, double
   2) 문자 - char  고정문자열- y/n   / varchar 가변형문자열   / text 
   3) 날짜 - date, datetime, timestamp
속성
    필수입력       - not null   ( 아니오,  값없음 ) 
    숫자자동증가 - auto_increment 
    기본키          - primary key
*/
use mbasic;
create table t1(
	no int,
    name varchar(100),
    age int
);
desc t1;


create table t2(
	no int   not null auto_increment primary key,
    name varchar(50)  not null,
    age int
);
desc t2;
show tables;

insert into t2 (name, age) values ('first' , 1);
insert into t2 ( age) values ( 1);
select * from t2;

create table coffee(
	cno int not null auto_increment primary key, 
    cname varchar(50) not null,
	cprice int not null
);
desc coffee;
show tables;
select * from emp;

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

create table score(
	sno int not null auto_increment primary key,
    sname varchar(20) not null,
    sjava int not null,
    sjsp int not null,
    sspring int not null,
    sproject int not null,
    sstotal int,
    ssavg int,
    semail varchar(50)
);
desc score;
show tables;

create table emp(
	empno int not null auto_increment primary key,
    ename varchar(20),
    job varchar(20),
    mgr int,
    hiredate date,
    sal int,
    comm int,
    deptno int
);
desc emp;

create table dept(
	deptno int not null auto_increment primary key,
    dname varchar(20) not null,
    loc varchar(20) not null
);
desc dept;

create table salagrade (
	grade int not null auto_increment primary key,
    losal int,
    hisal int
);
desc salagrade;

## ■003. crud
create table userinfo(
	no int not null auto_increment primary key,
    name varchar(100) not null,
    age int not null
);

insert into userinfo values (1,'aaa',11);
insert into userinfo values ('aaa',1,11);  -- error
select * from userinfo;


insert into userinfo  (name,age) values ('aaa',11);
insert into userinfo (age,name) values(30,'gold');
select * from userinfo;

create table emp(
	empno int not null auto_increment primary key,
    ename varchar(20),
    job varchar(20),
    mgr int,
    hiredate date,
    sal int,
    comm int,
    dept int
);

insert into emp values (7369 , 'SMITH'  , 'CLERK'     , 7902 , '1980-12-17', 800  , NULL , 20);
insert into emp values (7499 , 'ALLEN'  , 'SALESMAN'  , 7698 , '1981-02-20', 1600 , 300  , 30);
insert into emp values (7521 , 'WARD'   , 'SALESMAN'  , 7698 , '1981-02-22', 1250 , 500  , 30);
insert into emp values (7566 , 'JONES'  , 'MANAGER'   , 7839 , '1981-04-02', 2975 , NULL , 20);
insert into emp values (7654 , 'MARTIN' , 'SALESMAN'  , 7698 , '1981-09-28', 1250 , 1400 , 30);
insert into emp values (7698 , 'BLAKE'  , 'MANAGER'   , 7839 , '1981-05-01', 2850 , NULL , 30);
insert into emp values (7782 , 'CLARK'  , 'MANAGER'   , 7839 , '1981-06-09', 2450 , NULL , 10);
insert into emp values (7788 , 'SCOTT'  , 'ANALYST'   , 7566 , '1987-04-19', 3000 , NULL , 20);
insert into emp values (7839 , 'KING'   , 'PRESIDENT' , NULL , '1981-11-17', 5000 , NULL , 10);
insert into emp values (7844 , 'TURNER' , 'SALESMAN'  , 7698 , '1981-09-08', 1500 , 0    , 30);
insert into emp values (7876 , 'ADAMS'  , 'CLERK'     , 7788 , '1987-05-23', 1100 , NULL , 20);
insert into emp values (7900 , 'JAMES'  , 'CLERK'     , 7698 , '1981-12-03', 950  , NULL , 30);
insert into emp values (7902 , 'FORD'   , 'ANALYST'   , 7566 , '1981-12-03', 3000 , NULL , 20);
insert into emp values (7934 , 'MILLER' , 'CLERK'     , 7782 , '1982-01-23', 1300 , NULL , 10);
select * from emp;

create table dept1(
	dept int not null auto_increment primary key,
    dname varchar(20) not null,
    loc varchar(20) not null
);
insert into dept1 values(10 , 'ACCOUNTING', 'NEW YORK');
insert into dept1 values(20 , 'RESEARCH'  , 'DALLAS');
insert into dept1 values(30 , 'SALES'     , 'CHICAGO');
insert into dept1 values(40 , 'OPERATIONS', 'BOSTON');
select * from dept1;

create table salgrade1 (
	grade int not null primary key auto_increment,
    losal int,
    hisal int
);
insert into salgrade1 values(1 , 700  , 1200);
insert into salgrade1 values(2 , 1201 , 1400);
insert into salgrade1 values(3 , 1401 , 2000);
insert into salgrade1 values(4 , 2001 , 3000);
insert into salgrade1 values(5 , 3001 , 9999);
select * from salgrade1;

create table userinfo1 (
	no int not null auto_increment primary key,
    name varchar(100) not null,
    age int not null
);
insert into userinfo1 values(1 , 'first'  , 11);
insert into userinfo1 values(2 , 'second' , 22);
insert into userinfo1 values(3 , 'third'  , 33);
insert into userinfo1 values(4 , 'fourth' , 44);
select * from userinfo1;

set sql_safe_updates=0;

update userinfo1 set age=0;
update userinfo1 set name='first', age=10;

update userinfo1 set age=11 where no=1;
update userinfo1 set age=22, name='second' where no=2;
update userinfo1 set age=10 where no=3;
update userinfo1 set age=33, name='third' where no=3;
update userinfo1 set name='first' where no=4;
update userinfo1 set name='fourth', age=44 where no=4;
select * from userinfo1;

create table score1(
	sno int not null primary key auto_increment,
    sname varchar(20) not null,
    sjava int not null,
    sjsp int not null,
    sspring int not null,
    sproject int not null,
    sstotal int,
    ssavg int,
    semail varchar(50)
);
insert into score1 values(1 , 'aaa' , 100 , 100 , 100 , 100 , NULL , NULL , NULL);
insert into score1 values(2 , 'bbb' ,  90 ,  98 ,  88 , 100 , NULL , NULL , NULL);
insert into score1 values(3 , 'ccc' ,  70 ,  20 ,  78 ,  80 , NULL , NULL , NULL);
insert into score1 values(4 , 'ddd' ,  78 ,  89 ,  68 ,  98 , NULL , NULL , NULL);
insert into score1 values(5 , 'abc' ,  89 ,  98 ,  69 ,  77 , NULL , NULL , NULL);
select * from score1;

update score1 set sjava=100, sjsp=100, sspring=100 where sno=1;
update score1 set sjava=90,  sjsp=98,  sspring=88  where sno=2;
update score1 set sjava=90,  sjsp=90,  sspring=90  where sname='ccc';
update score1 set sjava=78,  sjsp=89,  sspring=68  where sno=4;
update score1 set sjava=89,  sjsp=98,  sspring=69  where sno=5;

update score1 set semail='admin@gmail.com';
update score1 set sstotal=sjava+sjsp+sspring+sproject;
update score1 set ssavg=sstotal/4;
update score1 set semail='first@gmail.com' where ssavg=100;
update score1 set sjava=92, sjsp=78, sstotal=sjava+sjsp+sspring+sproject, ssavg=sstotal/4 where sname='bbb';
update score1 set semail='second@gmail.com' where ssavg=89.5;
update score1 set semail='ccc@gmail.com' where sname='ccc';
update score1 set semail='blackstdudent@gmail.com' where sproject<80;
update score1 set semail='hello@gmail.com' where ssavg=89.5 and sproject=98;


select * from userinfo;

delete from userinfo where no=1;
select * from userinfo;
delete from userinfo;

drop table userinfo_del;
create table userinfo_del  select * from userinfo;

drop table emp;

drop table emp;
create table emp  (
	empno    int   not null  auto_increment primary key,
 	ename     varchar(20) not null ,
 	job       varchar(20) ,
 	mgr       int,
 	hiredate  date,
	sal       int,
	comm      int,
	deptno    int
);
insert into emp values (7369, 'SMITH' , 'CLERK'    , 7902, '1980-12-17', 800 , null, 20);
insert into emp values (7499, 'ALLEN' , 'SALESMAN' , 7698, '1981-02-20', 1600, 300 , 30);
insert into emp values (7521, 'WARD'  , 'SALESMAN' , 7698, '1981-02-22', 1250, 500 , 30);
insert into emp values (7566, 'JONES' , 'MANAGER'  , 7839, '1981-04-02', 2975, null, 20);
insert into emp values (7654, 'MARTIN', 'SALESMAN' , 7698, '1981-09-28', 1250, 1400, 30);
insert into emp values (7698, 'BLAKE' , 'MANAGER'  , 7839, '1981-05-01', 2850, null, 30);
insert into emp values (7782, 'CLARK' , 'MANAGER'  , 7839, '1981-06-09', 2450, null, 10);
insert into emp values (7788, 'SCOTT' , 'ANALYST'  , 7566, '1987-04-19', 3000, null, 20);
insert into emp values (7839, 'KING'  , 'PRESIDENT', null, '1981-11-17', 5000, null, 10);
insert into emp values (7844, 'TURNER', 'SALESMAN' , 7698, '1981-09-08', 1500, 0   , 30);
insert into emp values (7876, 'ADAMS' , 'CLERK'    , 7788, '1987-05-23', 1100, null, 20);
insert into emp values (7900, 'JAMES' , 'CLERK'    , 7698, '1981-12-03', 950 , null, 30);
insert into emp values (7902, 'FORD'  , 'ANALYST'  , 7566, '1981-12-03', 3000, null, 20);
insert into emp values (7934, 'MILLER', 'CLERK'    , 7782, '1982-01-23', 1300, null, 10);
select * from emp;

create table emp_del select * from emp;
select * from emp_del;

delete from emp_del where job = 'SALESMAN';
delete from emp_del where job = 'MANAGER' and ename='JONES';
delete from emp_del;
