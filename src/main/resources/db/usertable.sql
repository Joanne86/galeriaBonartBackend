drop schema users;
create schema users;
use users;



create table if not exists person (
	document int (20) primary key not null,
	name varchar(70) not null,
    phone varchar(10) not null,
    email varchar (70) not null    
);
create table if not exists sesion (
	idsesion int (20) primary key auto_increment not null,
    username varchar(50) not null,
    password varchar(50) not null,
    dperson int (20) not null,
    KEY dperson (dperson),
  CONSTRAINT `sesion_ibfk_1` FOREIGN KEY (dperson) REFERENCES `person` (`document`)
);
create table if not exists user (
	id int(20) primary key auto_increment not null,
    name varchar(70) not null,
    phone varchar(10) not null,
    address varchar(50) not null,
    email varchar (70) not null,
    description varchar (250) not null,
	idsesion int (20) not null,
    KEY idsesion (idsesion),
	CONSTRAINT `user_ibfk_1` FOREIGN KEY (idsesion) REFERENCES `sesion` (`idsesion`)

);

