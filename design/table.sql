use cho_pro;

-- traffic table 생성
create table traffic(tno int primary key, ttype varchar(20) not null, no varchar(10) not null, route varchar(50), coment varchar(1000));
desc traffic;

-- guide table 생성
create table guide(pcode int auto_increment primary key, pname varchar(20) not null, ptype varchar(10) not null, paddr varchar(100) not null, ptel varchar(20), pgps varchar(50), pcoment varchar(1000), premark varchar(1000));
desc guide;

-- notice table 생성
create table notice(no int auto_increment primary key, title varchar(20) not null, content varchar(2000) not null, resdate datetime default current_timestamp, visited int default 0);
desc notice;

-- data table 생성
create table data(no int auto_increment primary key, title varchar(20) not null, datafile varchar(20) not null, content varchar(1000) not null, resdate datetime default current_timestamp, visited int default 0);
desc data;

-- qna table 생성
create table qna(no int auto_increment primary key, plevel varchar(20) not null, parno int not null, title varchar(20) not null, content varchar(1000) not null, resdate datetime default current_timestamp, visited int default 0, aid varchar(20) not null, foreign key(aid) references member(id)) ;
desc qna;

-- member table 생성
create table member(id varchar(20) not null primary key, pw varchar(20) not null, birth date not null, email varchar(20) not null, tel varchar(15) not null);
desc member;

insert into member values ('jdj', 'ac89', '1998-01-04', 'jdj@khacademy.org', '010-1212-3434');
insert into member values('admin', '1212', '1996-12-12', 'cwj@khacademy.org', '010-5656-7878');



select * from member;