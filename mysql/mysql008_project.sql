use mbasic;
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