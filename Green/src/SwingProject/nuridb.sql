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
	bookName varchar(100) not null,
	author varchar(50) not null,
	publish varchar(20) not null,
	category varchar(20) not null,
	bookPosition varchar(50) default '미지정',
	rentalCheck varchar(2) default '대여가능',
	image varchar(100) default '이미지 url없음');
	
insert into books values(default, '9791161571188(1161571183)', '불편한 편의점', '김호연', '나무옆의자', '소설', default, default);
insert into books values(default, '9791197377143(119737714X)', '어서 오세요, 휴남동 서점입니다', '황보름', '클레이하우스', '소설', default, default);
insert into books values(default, '9791191043617(1191043614)', '백광', '렌조 미키히코', '모모', '소설', default, default);
insert into books values(default, '9791191056556(1191056554)', '미드나잇 라이브러리', '매트 헤이그', '인플루엔셜', '소설', default, default);
	
desc books;

alter table books modify column bookName varchar(100);

alter table books add column image varchar(50) default '이미지 url없음';



drop table books;

select * from books;

delete from manage where mIdx = 2;

create table rental(
	rIdx int not null auto_increment primary key,
	cIdx int not null,
	rDate datetime default now()
);

desc rental;

select * from rental;

drop table rental;

create table rentalList(
	rLidx int not null auto_increment primary key,
	rIdx int not null,
	cIdx int not null,
	isbn varchar(100) not null,
	state varchar(20) default '대여중',
	returnDate varchar(50) not null,
	createDate datetime default now()
);

desc rentalList;

delete from rentalList;

drop table rentalList;

create table customer(
	cIdx int not null auto_increment primary key,
	cName varchar(20) not null,
	cMid varchar(20) not null,
	cPwd varchar(50) not null,
	cNumber varchar(50) not null,
	cAddress varchar(50) not null,
	rentalOkDate varchar(50) default '2022-01-01',
	bookCnt int default 5,
	regularCustomer varchar(2) default 'N',
	withDraw varchar(2) default 'N',
	createDate datetime default now()
);

select * from rentalList;

delete from rentalList;

select * from customer;

desc customer;

drop table customer;

alter table customer add column bookCnt int default '5';



insert into customer values(default, '이지수', 'ljs1877', password('1234'), '010-9039-1877', '청주시 흥덕구', default, default, default, default, default);
insert into customer values(default, '홍길동', 'hong123', password('1234'), '010-1111-2222', '청주시 흥덕구', default, default, default, default);
insert into customer values(default, '김말숙', 'kim09', password('1234'), '010-3333-5555', '청주시 서원구', default, default, default, default);
insert into customer values(default, '테스트', 'test', password('1234'), '010-3333-9999', '청주시 상당구', default, default, default, default);


select * from customer;

delete from customer;

select count(*) from rentalList where rIdx = 18 and cIdx = 1;

