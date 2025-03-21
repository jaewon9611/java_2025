# ■ 복습문제 (집계함수)

/*
Q1.  emp 테이블에서  급여가 3000이하인 직원에서  
-- [각 부서의 직책별] 평균급여가 2000이상인 그룹을 조회하시오.
+--------+---------+-----------+
| deptno | job     | 평균급여  |
+--------+---------+-----------+
|     10 | MANAGER | 2450.0000 |
|     20 | ANALYST | 3000.0000 |
|     20 | MANAGER | 2975.0000 |
|     30 | MANAGER | 2850.0000 |
+--------+---------+-----------+
4 rows in set (0.00 sec)
*/
use mbasic;
select * from emp;

select  deptno, job, avg(sal) `평균급여` 
from    emp
where   sal <= 3000
group   by  deptno, job
having  avg(sal)  >=2000
order by  deptno asc, job;



/* 
Q2. emp 테이블에서 GROUP BY절만  사용하여  
-- 각부서의 직책별 사원수, 가장높은 급여, 급여합, 평균급여를  다음과 같이  사원데이터를  조회하시오.
+--------+-----------+--------+----------+--------+-----------+
| deptno | job       | 사원수   | 최고급여   | 급여합   | 평균급여   |
+--------+-----------+--------+----------+--------+-----------+
|     10 | CLERK     |      1 |     1300 |   1300 | 1300.0000 |
|     10 | MANAGER   |      1 |     2450 |   2450 | 2450.0000 |
|     10 | PRESIDENT |      1 |     5000 |   5000 | 5000.0000 |
|     20 | ANALYST   |      2 |     3000 |   6000 | 3000.0000 |
|     20 | CLERK     |      2 |     1100 |   1900 |  950.0000 |
|     20 | MANAGER   |      1 |     2975 |   2975 | 2975.0000 |
|     30 | CLERK     |      1 |      950 |    950 |  950.0000 |
|     30 | MANAGER   |      1 |     2850 |   2850 | 2850.0000 |
|     30 | SALESMAN  |      4 |     1600 |   5600 | 1400.0000 |
+--------+-----------+--------+----------+--------+-----------+
9 rows in set (0.00 sec) 
*/

select  @@sql_mode;
set    SESSION sql_mode='STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

select  deptno , job 
	    , count(*) `사원수` , max(sal)  `최고급여` , sum(sal) `급여합`, avg(sal) `평균급여`
from    emp
group   by    deptno , job 
order   by    deptno , job  ;   


# ■ 진도 - function
#1. Number
#2. String
#3. Date
#4. if / case


#1. Number ( ceil 올림, floor 내림, round 반올림, mod 나머지)
--             2               1           2
select   ceil(1.1) `올림`, floor(1.9) `내림`, round(1.5) `반올림`, mod(10,3) `나머지`;
# https://www.w3schools.com/sql/func_mysql_round.asp
/*
1-2 CRUD (SELECT Function-Number 연습문제)
EX1    123.4578을 ROUND를 이용하여 다음과 같이 출력하시오.
+----------+--------+--------+--------+--------+
| 123.4578 | ROUND1 | ROUND2 | ROUND3 | ROUND4 |
+----------+--------+--------+--------+--------+
| 123.4578 |    123 |    120 |  123.5 | 123.46 |
+----------+--------+--------+--------+--------+
1 row in set (0.00 sec)
*/
select  round(123.4567 , 0);
select  round(123.4567 , 2);
select  round(123.4567 , -1);
/*


EX2
+----------+------+-------+
| 123.4578 | CEIL | FLOOR |
+----------+------+-------+
| 123.4578 |  124 |   123 |
+----------+------+-------+
1 row in set (0.00 sec)
*/
select 1234578 , round(123.4578 , 0) , round(123.4578 , -1) , round(123.4578 ,1), round(123.4578 ,2);

select 123.4578 , ceil(123.4578) , 'ceil' , floor(123.4578) 'floor';

---------------------------------------------------------------------
#1. string
---------------------------------------------------------------------

-- 2-1. basic
-- 1) length(문자열) 갯수구하기
select length('abc');

-- 2) upper/lower
select 'abc' , upper('abc') , lower('abc');

-- 3) instr 위치             2
select instr('abc' , 'b') 'b의 위치' , instr('abc' , 'ab') 'ab의 위치' , instr('abc' , 'ac') 'ac의 위치';

-- 4) left(문자열, 몇개) , right , substr(문자열, 시작 , 몇개) 문자열 일부분
select left('abc',1) , left('abc' ,2) , right('abc' ,1) , right('abc',2); -- a ,ab , c ,bc
select substr('abcde' ,2,2) 'bc' , substr('abcde',2,3) 'bcd' , substr('abcde',1,3) 'abc';

-- 5) 문자열연결 concat(문자열1, 문자열2)
select concat('hello  ' , 'mysql') 'hello mysql';

-- 6) trim 좌우공백빼기
select trim(' a b c ');

select concat('#' , trim(' a b c ') , '#') '#a b c#'
	,  concat('#' , ltrim(' a b c ') , '#') '#a b c #'
    ,  concat('#' , rtrim(' a b c ') , '#') '# a b c#' ;
    
-- 7) replace(문자열에서,찾아서,바꾸기)
select replace("hello sally", "sally" , "alpha") 'hello alpha';
    
-- 8) repeat(뭐를,몇개반복)
select repeat('*' ,5) '*****';

-- 9) 빈칸채우기 lpad , rpad
select lpad('abc' , 10 , '#')
     , rpad('abc' , 10 , '#'); 

create table userinfo2(
	no int	not null default 0,
    name varchar(20) not null,
    age int not null,
    email varchar(20) not null
);
desc userinfo2;
select * from userinfo2;
insert into userinfo2 values (1 , 'aaa' ,11, 'aaa@gmail.com');
insert into userinfo2 values (2 , 'bbb' ,22, 'bbb@gmail.com');
insert into userinfo2 values (3 , 'ccc' ,33, 'ccc@gmail.com');
insert into userinfo2 values (4 , 'ddd' ,44, 'ddd@gmail.com');
insert into userinfo2 values (5 , 'abc' ,55, 'abc@gmail.com');
insert into userinfo2 values (6 , 'bca' ,66, 'bca@gmail.com');

select name '이름',length(name) '갯수' from userinfo2;
select name , left(name,1) '첫번째 글자' ,right(name,1) '마지막글자'from userinfo2;
select name , replace(name , 'aaa' ,'aaa 1등')from userinfo2;
select concat(name,'는 개발자입니다.') '직업' from userinfo2;
select upper(name) from userinfo2;
select lower(name) from userinfo2;
select name , instr(name , 'b') from userinfo2 where age>40;
select name , instr(name , 'b') from userinfo2 where age>40 order by age desc limit 2;
select name, concat(left(name,1) , '*' , right(name,1) ) 'test' from userinfo2;
select name, concat(left(name,1) , repeat('*', length(name)-2) , right(name,1) ) 'test' from userinfo2;

-- 1) length(문자열) 갯수
-- 2) upper 대문자 / lower 소문자
-- 3) instr(문자열, 찾을문자열) 위치 , 못찾으면 0
-- 4) left(문자열, 몇개) , right , substr(문자열, 시작 , 몇개) 문자열 일부분
-- 5) 문자열연결 concat(문자열1, 문자열2)
-- 6) trim 좌우공백빼기
-- 7) replace(문자열에서,찾아서,바꾸기)
-- 8) repeat(뭐를,몇개반복)
-- 9) 빈칸채우기 lpad , rpad


---------------------------------------------------------------------
#3. date
---------------------------------------------------------------------

-- 1) 시스템 현재 시각조회
select now(); -- '2025-03-21 11:58:57'
select current_time(); -- '11:59:22'

-- 2) 요일 ( 0 = mon , 1=tue , 6=sun
select weekday(now()); -- 4 금
select weekday("2025-03-21"); -- 4 금

-- 3) 날짜형식 date_format( 날짜지정, '%Y-%m-%d')
select date_format("2025-03-21" , '%Y-%m-%d');
select date_format(now() , '%Y-%m-%d %H:%i:%s');

-- 4) 100일전/ 후 date_add
select date_add(now() , interval - 10 day); -- 2025-03-11 12:05:59
select date_add(now() , interval   10 day); -- 2025-03-31 12:06:02
select date_add(now() , interval - 3 hour); -- 2025-03-21 09:06:12

-- 5) datediff(날짜1,날짜2) 날짜차이
select datediff( '2025-03-22', '2025-03-21'); 
select timestampdiff( hour , '2025-03-22', '2025-03-21'); -- -24


-- 1) 시스템의 현재 시각조회 now / current_time
-- 2) 요일 ( 0 = mon , 1=tue , 6=sun
-- 3) 날짜형식 date_format( 날짜지정, '%Y-%m-%d')
-- 4) 100일전/ 후 date_add
-- 5) datediff(날짜1,날짜2) 날짜차이

create table date_userinfo(
	no int not null default 0,
    name varchar(100) not null,
    age int not null,
    date datetime default current_timestamp
);
desc date_userinfo;
select * from date_userinfo;
insert into date_userinfo values(1 , 'aaa' , 11 , '2022-12-30 00:00:00');
insert into date_userinfo values(1 , 'bbb' , 22 , '2022-11-30 00:00:00');
insert into date_userinfo values(1 , 'ccc' , 33 , '2022-10-30 00:00:00');
insert into date_userinfo values(1 , 'ddd' , 44 , '2022-09-30 00:00:00');

select name, date from date_userinfo where date < '2022-11-01';
select name, date, date_add(date, interval 30 day)'event' from date_userinfo
where date>='2022-12-1' and date <='2022-12-31';
select name,date_format(date ,'%Y년%m월%d일') '가입날짜' from date_userinfo;

---------------------------------------------------------------------
#4. if / case
---------------------------------------------------------------------
-- if(조건, 참, 거짓)
-- 다형식
/* case
   when     조건1    then   상태1
   when     조건2    then   상태2
   else     모든조건에 해당하지 않을때, 생략가능
   end
*/
create table control (no int);
insert into control values (1), (2), (3);
select * from control;

-- 1-1
select no , if(no=1, '1이다' , '1이 아니다') '상태' from control;

-- 1-2
select no , if(no>1, '1보다 크다' , '1보다 작다') '상태' from control;

-- 1-3 case     when/then     end
select no, case
			   when no=1 then '1이다'
               when no=2 then '2이다'
               when no=3 then '3이다'
               else '1,2,3이 아니다'
		   end 'state'
from control;

-- 1-4    2이다 , 크다 , 작다
select no, case 
		   when no>2 then '크다'
           when no=2 then '2이다'
           when no<3 then '작다'
           end 'state'
from control;

create table if_userinfo (
	no int not null primary key auto_increment,
    name varchar(100) not null,
    age int default 0,
    sex char(1),
    sns char(1)
);
desc if_userinfo;
select * from if_userinfo;
insert into if_userinfo values(1 , 'first'  , 11  , NULL   , 'n');
insert into if_userinfo values(2 , 'second' , 122 , 'm'    , 'y');
insert into if_userinfo values(3 , 'third'  , 33  , 'm'    , 'y');
insert into if_userinfo values(4 , 'fourth' , 44  , 'f'    , 'n');
insert into if_userinfo values(5 , 'fifth'  , 55  , 'f'    , 'y');
insert into if_userinfo values(6 , 'sixth'  , 66  , 'm'    , 'n');

select no,name,age,sex,sns, if(sns='n' , '수신거부' , '수신유지') '수신여부상태' from if_userinfo;
select no,name,age,sex,sns, if(age<19 , '미성년자' , '성인')'성인여부' from if_userinfo;
select sum( if(sns='n' , 1 , 0)) '수신거부수'  from if_userinfo;

select ename, deptno, case 
				when deptno=10 then 'ACCOUNTING'
				when deptno=20 then 'RESEARCH'
				when deptno=30 then 'SALES'
                                  end '부서이름'
from emp;

select ename, deptno, case deptno
				when 10 then 'ACCOUNTING'
				when 20 then 'RESEARCH'
				when 30 then 'SALES'
                                  end '부서이름'
from emp;



select ename, job, case job
				when 'clerk' then '판매원'
				when 'salesman' then '영업사원'
				else '사원'
                end 'job2'
from emp;
