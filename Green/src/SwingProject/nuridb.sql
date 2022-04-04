show tables;

create table manage(
	mIdx int not null auto_increment primary key,
	mName varchar(20) not null,
	mMid varchar(20) not null,
	mPwd varchar(50) not null,
	mNumber varchar(50) not null,
	mHint varchar(50) not null,
	mHintAns varchar(50) not null);
	
desc manage;

drop table manage;

alter table manage modify column mPwd varchar(50);

insert into manage values (default, '이지수', 'root', password('1234'), '010-9039-1877', '나의 보물은?', password('가족'));
insert into manage values (default, '테스트', 'test', password('1234'), '010-1234-1234', '나의 보물은?', password('가족'));
insert into manage values (default, '테스트이', 'test2', password('1234'), '010-5678-5678', '가장 좋아하는 음식은?', password('떡볶이'));

select * from manage;

select * from manage where mPwd = password('1234');

select * from manage where mMid = 'sdf';

select * from manage where mMid = ? and mPwd = ? 

delete from manage where mIdx = 2;

create table books(
	bIdx int not null auto_increment primary key,
	isbn varchar(100) not null,
	bookName varchar(50) not null,
	author varchar(50) not null,
	publish varchar(20) not null,
	category varchar(20) not null,
	bookPosition varchar(50) default '미지정',
	rentalCheck varchar(2) default 'N');
	
insert into books values(default, '9791161571188(1161571183)', '불편한 편의점', '김호연', '나무옆의자', '소설', default, default);
insert into books values(default, '9791197377143(119737714X)', '어서 오세요, 휴남동 서점입니다', '황보름', '클레이하우스', '소설', default, default);
insert into books values(default, '9791191043617(1191043614)', '백광', '렌조 미키히코', '모모', '소설', default, default);
insert into books values(default, '9791191056556(1191056554)', '미드나잇 라이브러리', '매트 헤이그', '인플루엔셜', '소설', default, default);
	
desc books;

drop table books;

select * from books;

delete from manage where mIdx = 2;

create table rental(
	rIdx int not null auto_increment primary key,
	cIdx int not null auto_increment primary key,
	rDate varchar(50) not null
);

create table rentalList(
	rLidx int not null auto_increment primary key,
	rIdx int not null auto_increment primary key,
	isbn int not null,
	cIdx int not null auto_increment primary key,
	state varchar(20) default '대여중',
	returnDate varchar(50) not null
);

create table customer(
	cIdx int not null auto_increment primary key,
	cName varchar(20) not null,
	cMid varchar(20) not null,
	cPwd varchar(50) not null,
	cNumber varchar(50) not null,
	cAddress varchar(50) not null,
	createDate varchar(50) not null,
	rentalOkDate varchar(50) not null,
	regularCustomer char(1) default 'N',
	withDraw char(1) default 'N'
);