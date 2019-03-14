drop schema if exists bonart;
create schema bonart;
use bonart;

create table if not exists artist (
	document varchar (20) primary key not null,
	name varchar(45) not null,
	address varchar (20) not null,
    phone varchar(10) not null,
    city varchar (15) not null,
    exhibitions varchar (150)
);

create table if not exists artwork {

    inscription_code int () primary key auto_increment not null,
    artworkType varchar(40) not null,
    price float,
    artist_document varchar (10) not null
    key artist_document (artist_document),
    constraint `artist_ibfk_1` foreign key (artist_document) references `artist` (`document`)
}

create table if not exists seller {

    document varchar (20) primary key not null,
    name varchar(45) not null
}

create table if not exists sesion (
	idsesion int (20) primary key auto_increment not null,
    username varchar(50) not null,
    password varchar(50) not null,
    document_seller int (20) not null,
    KEY document_seller (document_seller),
  CONSTRAINT `sesion_ibfk_1` FOREIGN KEY (document_seller) REFERENCES `seller` (`document`)
);

