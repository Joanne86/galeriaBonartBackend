drop schema if exists galerybonart;
create schema galerybonart;
use galerybonart;

create table if not exists artist (
	document varchar (10) primary key not null,
	name varchar(45) not null,
	address varchar (20) not null,
    cellphone varchar(10) not null,
    city varchar (15) not null,
    exhibitions varchar (150)
);

create table if not exists seller (

    document varchar(10) primary key not null,
    name varchar(45) not null,
    cellphone varchar(10) not null
);

create table if not exists sesion (
	id int (20) primary key auto_increment not null,
    username varchar(50) not null,
    password varchar(50) not null,
    document_seller varchar (10) not null,
    KEY document_seller (document_seller),
    CONSTRAINT `session_ibfk_1` FOREIGN KEY (document_seller) REFERENCES `seller` (`document`)
);

create table if not exists room (
    code int(3) primary key not null,
    name varchar (50) not null,
    document_seller varchar (10) not null,
    KEY document_seller (document_seller),
    CONSTRAINT `room_ibfk_1` FOREIGN KEY (document_seller) REFERENCES `seller` (`document`)
);

create table if not exists artwork (
    inscription_code int(3) primary key auto_increment not null,
    name varchar(40) not null,
    price float,
    document_artist varchar (10) not null,
    number_room int (3) not null,
    key document_artist (document_artist),
    constraint `artwork_ibfk_1` foreign key (document_artist) references `artist` (`document`),
    key number_room (number_room),
    constraint `artwork_ibfk_2` foreign key (number_room) references `room` (`code`)
);

create table if not exists customer (
    document varchar(10) primary key not null,
    name varchar(45) not null,
    cellphone varchar(10) not null ,
    email varchar(45) not null,
    entry_price float not null,
    flag boolean not null
);

create table if not exists sale (
    id int(3) primary key auto_increment not null,
    document_customer varchar(10) not null,
    artwork_code int(3) not null,
    key document_customer (document_customer),
    constraint `sale_ibfk_1` foreign key (document_customer) references `customer` (`document`),
    key artwork_code (artwork_code),
    constraint `sale_ibfk_2` foreign key (artwork_code) references `artwork` (`inscription_code`)
);



