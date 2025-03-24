use mbasic;

drop table emp;
create table emp  (
   empno    int   not null  auto_increment primary key,
    ename     varchar(20) not null ,
    job       varchar(20) ,
    mgr       int,
    hiredate  date,
   sal       int,
   comm      int,
   deptno      int
);
insert into emp  values (7369 , 'SMITH' , 'CLERK'    , 7902 , '1980-12-17' , 800 , null, 20);
insert into emp  values (7499 , 'ALLEN' , 'SALESMAN' , 7698 , '1981-02-20' , 1600 , 300, 30);
insert into emp values (  7521 , 'WARD' ,  'SALESMAN',7698, '1981-02-22',1250   ,     500 , 30);
insert into emp values (  7566 , 'JONES','MANAGER',7839 ,'1981-04-02',2975,    null,20);
insert into emp values (  7654 , 'MARTIN','SALESMAN',7698 ,'1981-09-28',1250,    1400,30);
insert into emp values (  7698  , 'BLAKE','MANAGER',7839 ,'1981-05-01',2850,    null,30);
insert into emp values (  7782  , 'CLARK','MANAGER',7839 ,'1981-06-09',2450,    null,10);
insert into emp values (  7788  , 'SCOTT','ANALYST',7566 ,'1987-04-19',3000,    null,20);
insert into emp values (  7839  , 'KING','PRESIDENT',null ,'1981-11-17',5000,    null,10);
insert into emp values (  7844  , 'TURNER','SALESMAN',7698 ,'1981-09-08',1500,       0, 30);
insert into emp values (  7876  , 'ADAMS','CLERK',7788 ,'1987-05-23',1100,    null, 20);
insert into emp values (  7900  , 'JAMES','CLERK',7698 ,'1981-12-03',950,    null, 30);
insert into emp values (  7902  , 'FORD','ANALYST',7566 ,'1981-12-03',3000,    null, 20);
insert into emp values (  7934  , 'MILLER','CLERK',7782 ,'1982-01-23',1300,    null, 10);
select * from emp;

drop table dept;
create table dept (
   deptno int not null  auto_increment primary key,
   dname varchar(20) not null,
   loc varchar(20) not null
);

insert into dept values (10 , 'ACCOUNTING' , 'NEW YORK');
insert into dept values (20 , 'RESEARCH' , 'DALLAS');
insert into dept values (30 , 'SALES' , 'CHICAGO');
insert into dept values (40 , 'OPERATIONS' , 'BOSTON');
select * from dept;

create table join_userban (
	no int not null primary key auto_increment,
    name varchar(20) not null,
    ban char(2) default null
);
desc join_userban;
insert into join_userban values(1 , 'first'  , 'A' );
insert into join_userban values(2 , 'second' , 'B' );
insert into join_userban values(3 , 'third'  , 'A' );
insert into join_userban values(4 , 'fourth' , 'C' );
insert into join_userban values(5 , 'fifth'  , 'B' );
insert into join_userban values(6 , 'sixth'  , 'C' );
insert into join_userban values(7 , 'fifth'  , 'B' );
insert into join_userban values(8 , 'sixth'  , 'C' );

update join_userban set ban = 'D' where no >= 7;
delete from join_userban where no >= 7;
select * from join_userban;

select count(*) A반학생수 from join_userban where ban = 'A';
select count(*) B반학생수 from join_userban where ban = 'B';
select count(*) C반학생수 from join_userban where ban = 'C';
select ban, count(*) '학생수' from join_userban group by ban;

#데이터베이스언어 면접문제
# DDL - create,alter,drop
# DML - insert, select,update,delete
# DCL - grant,revoke

# e(entity:테이블)r(relation:관계) 속성:pk,fk
# join
-- 두개이상의 테이블들을 연결하여 데이터를 조회
-- 테이블간의 연결고리 (pk,fk)

#종류 : inner join , outer join

create table join_userinfo(
no int default 0 ,
name varchar(100) not null,
age int(11) not null
);
desc join_userinfo;
insert into join_userinfo values(1 , 'first'  , 11 );
insert into join_userinfo values(2 , 'second' , 22 );
insert into join_userinfo values(3 , 'third'  , 33 );
insert into join_userinfo values(4 , 'fourth' , 44 );
select * from join_userinfo;

select a.no, a.name, a.age, b.ban
from join_userinfo a , join_userban b
where a.no= b.no;

#>>> join on
select a.no, a.name, a.age, b.ban
from join_userinfo a join join_userban b on (a.no= b.no);
#>>> join using
select a.no, a.name, a.age, b.ban
from join_userinfo a join join_userban b using(no);
#>>> natural join
select no, name, age, ban
from join_userinfo natural join join_userban;

select a.no,a.name,a.age,b.ban
from join_userinfo a, join_userban b
where a.no=b.no and age>=20 and age<=40;

select a.no,a.name,a.age,b.ban
from join_userinfo a, join_userban b
where a.no=b.no and age between 20 and 40;

select a.no, a.name, a.age, b.ban
from join_userinfo a join join_userban b on (a.no = b.no)
where a.age >= 20 and a.age <= 40; # 또는  where age between 20 and 40;

select a.no,a.name,a.age,b.ban
from join_userinfo a join join_userban b using(no)
where a.age >= 20 and a.age <= 40;

select no,name,age,ban
from join_userinfo a natural join join_userban b
where age between 20 and 40;


## right join은 오른쪽값 보장
select a.no, a.name, b.ban , a.age
from join_userinfo a right join join_userban b on a.no = b.no;

## left join은 오른쪽값 보장
select a.no, a.name, b.ban , a.age
from join_userban b left join join_userinfo a on a.no = b.no;

select b.no, b.name,b.ban,a.age
from join_userinfo a right join join_userban b on a.no=b.no;

select b.no, b.name,b.ban,a.age
from join_userban b  left join join_userinfo a on a.no=b.no;

-- join 할때는 연결부위가 필요하다
##실습 1
select * from emp, dept order by empno;

##실습 2
select *
where emp.deptno=dept.deptno
order by empno;

##실습 3
select *
from emp e, dept d
where e.deptno=d.deptno
order by empno;

##실습4
## Error Code: 1052. Column 'deptno' in field list is ambiguous	0.000 sec
select empno , ename,deptno,dname,loc
from emp e, dept d
where e.deptno = d.detpno;

##실습5
select empno , ename,e.deptno,dname,loc
from emp e, dept d
where e.deptno = d.detpno;

##실습6
select empno,ename,sal,deptno,dname,loc
from emp e natural join dept d
where sal>=3000;

##실습7
select empno,ename,job,mgr,hiredate,sal,comm,deptno,grade,losal,hisal
from emp e,salgrade1 s
where e.sal between s.losal and s.hisal
order  by s.grade asc,e.sal asc;

##실습8
select e1.empno , e1.ename , e1.mgr , e2.empno 'MGR_EMPNO' , e2.ename 'MGR_ENAME'
from emp e1, emp e2, salgrade1 s
where e1.mgr = e2.empno and e1.sal between s.losal and s.hisal
order by e2.empno asc;

##실습9
select e1.empno , e1.ename , e1.mgr , e2.empno 'MGR_EMPNO' , e2.ename 'MGR_ENAME'
from emp e1 left join emp e2 on(e1.mgr = e2.empno)
order by e1.empno asc;

##실습10
select e1.empno , e1.ename , e1.mgr , e2.empno 'MGR_EMPNO' , e2.ename 'MGR_ENAME'
from emp e1 right join emp e2 on(e1.mgr = e2.empno);

##실습11
select empno, ename, job, mgr, hiredate, sal, comm, deptno, dname, loc
from emp e natural join dept d
order by deptno,empno ;

##실습12
select empno, ename, job, mgr, hiredate, sal, comm, e.deptno, dname, loc
from emp e  join dept d using(deptno)
where sal >=3000
order by deptno,empno;

##실습13
select empno, ename, job, mgr, hiredate, sal, comm, e.deptno, dname, loc
from emp e  join dept d on(e.deptno = d.deptno)
where sal<=3000
order by deptno,empno;

##실습14
select d.deptno, dname, empno, ename , sal
from emp e, dept d
where e.deptno = d.deptno and sal> 2000;

##실습15
select deptno, dname, empno, ename , sal
from emp e natural join dept d
where  sal> 2000;

##실습16
select d.deptno, d.dname, avg(sal) as 'AVG_SAL'
						, max(sal) as 'MAX_SAL'
						, min(sal) as 'MIN_SAL'
						, count(*) as 'CNT'
from emp e,dept d
where e.deptno = d.deptno
group by  d.deptno,d.dname
order by  d.deptno,d.dname;

##실습17
select d.deptno, d.dname, avg(sal) as 'AVG_SAL'
						, max(sal) as 'MAX_SAL'
						, min(sal) as 'MIN_SAL'
						, count(*) as 'CNT'
from emp e join dept d using(deptno)
where e.deptno = d.deptno
group by  d.deptno,d.dname
order by  d.deptno,d.dname;

##실습18
select d.deptno, d.dname, empno,ename,job,sal
from dept d left join emp e using(deptno)
order by d.deptno,ename; 

##실습19
select d.deptno, d.dname, empno,ename,job,sal
from emp e right join dept d using(deptno)
order by d.deptno,ename; 

##실습20
select d.deptno, dname, e.empno
    , e.ename, e.mgr, e.sal, e.deptno
    , s.losal, s.hisal, s.grade
	, e2.empno 'MGR_EMPNO' , e2.ename 'MGR_ENAME'
from emp e right join dept d      on(e.deptno=d.deptno) 
		    left join salgrade1 s on(e.sal between s.losal and s.hisal) 
			left join emp e2      on (e.mgr=e2.empno)
order by d.deptno, e.empno;