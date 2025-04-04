use mbasic;
show tables;
create table board (
bno int not null auto_increment primary key,
btitle varchar(1000) not null,
bcontent text not null,
bname varchar(100) not null,
bhit int default 0,
bdate timestamp not null default current_timestamp,
bip varchar(100) not null
);
select * from board;

desc board;
insert into board (btitle,bcontent,bname, bip) values(?,?,?,?);     #글쓰기
select * from board order by bno desc;                              #최신글읽기
select * from board where bno=?;                                    #해당글읽기
update board set bhit=bhit+1 where bno=?;                           #조회수증가
select * from board where bno=?;                                    #해당글수정폼
update board set btitle=? , bcontent=? where bno=?;                 #해당글 수정기능 
delete from board where bno=?;                                       # 해당글삭제
select * from userinfo;

create table userinfo (
no int not null primary key auto_increment,
name varchar(100) not null,
age int not null
);

insert into userinfo values (1 , 'first'  , 11);
insert into userinfo values (2 , 'second' , 22);
insert into userinfo values (3 , 'third'  , 33);
insert into userinfo values (4 , 'fourth' , 44);

desc userinfo;
insert into userinfo (name,age) values(?,?);
select * from userinfo where no=?;
update userinfo set name=?, age=?  where no=?;
delete from userinfo where no=?;


create table sboard (
    bno int auto_increment primary key,      
    bname varchar(50) not null,              
    btitle varchar(100) not null,            
    bcontent text not null,                  
    bpass varchar(20) not null,              
    bip varchar(45),                         
    bhit int default 0,                     
    bdate timestamp not null default current_timestamp
);