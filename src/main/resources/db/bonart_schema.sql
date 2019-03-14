drop schema if exists bonart;
create schema bonart;
use bonart;

create table if not exists artist (
	document varchar (20) primary key not null,
	name varchar(45) not null,
	address varchar (20) not null,
    cellphone varchar(10) not null,
    city varchar (15) not null,
    exhibitions varchar (150)
);

create table if not exists seller {

    document varchar(20) primary key not null,
    name varchar(45) not null
};

create table if not exists session (
	id int (20) primary key auto_increment not null,
    username varchar(50) not null,
    password varchar(50) not null,
    document_seller int (20) not null,
    KEY document_seller (document_seller),
    CONSTRAINT `session_ibfk_1` FOREIGN KEY (document_seller) REFERENCES `seller` (`document`)
);

create table if not exists room {
    code int(3) primary key not null,
    name varchar (15) not null,
    document_seller int (20) not null,
    KEY document_seller (document_seller),
    CONSTRAINT `room_ibfk_1` FOREIGN KEY (document_seller) REFERENCES `seller` (`document`)
};

create table if not exists artwork {

    inscription_code int (3) primary key auto_increment not null,
    artwork_type varchar(40) not null,
    price float,
    artist_document varchar (10) not null,
    number_room int (3) not null,
    key artist_document (artist_document),
    constraint `artist_ibfk_1` foreign key (artist_document) references `artist` (`document`),
    key number_room (number_room),
    constraint `artist_ibfk_2` foreign key (number_room) references `room` (`number`)
};

create table if not exists customer {

    document varchar (20) primary key not null,
    name varchar(45) not null,
    cellphone varchar(10) not null,
    email varchar(45) not null,
    entry_cost float not null
}

create table if not exists sales {

    code_artwork int (3) not null,
    document_seller int (20) not null,
    KEY document_seller (document_seller),
    CONSTRAINT `sales_ibfk_1` FOREIGN KEY (document_seller) REFERENCES `seller` (`document`),
    KEY code_artwork (code_artwork),
    CONSTRAINT `sales_ibfk_2` FOREIGN KEY (code_artwork) REFERENCES `artwork` (`inscription_code`)
}

