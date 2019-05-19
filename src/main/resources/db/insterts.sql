use galerybonart;

insert into artist values ('1014293634', 'leidyrfART', 'san telmo','3125830084', 'bogota', 'conferias');
insert into artist values ('1234567890', 'Sara fuentes', 'suba','3125256290', 'bogota', 'museo de arte moderno');

insert into seller values ('1014293632', 'David Esteban Rodriguez Fuentes', '3135678435');
insert into seller values ('79289201', 'John Alexander Martinez Pinto', '3124567841');
insert into seller values ('2343567654', 'Harold Esteban Reyes Lancheros', '3125465340');
insert into seller values ('5434544576', 'Claudia Liliana Hernandez', '3124345541');


insert into sesion values ('1','lrodr78', 'Colombia1', '1014293632');
insert into sesion values ('2','jmartinez12', 'Colombia2', '79289201');
insert into sesion values ('3','hreyes34', 'Colombia3', '2343567654');
insert into sesion values ('4','test', 'Colombia4', '5434544576');

insert into room values (1, 'pinturas', '1014293632');
insert into room values (2, 'esculturas', '79289201');
insert into room values (3, 'gravados', '2343567654');

insert into artwork values (1, 'la monalisa sonriente', 800000, '1014293634', 1);
insert into artwork values (2, 'el grito despiadado', 3000000, '1234567890', 1);
insert into artwork values (3, 'micheal jackson en acuarela', 0, '1014293634', 1);

insert into artwork values (4, 'la casa de madera', 400000, '1014293634', 2);
insert into artwork values (5, 'luna de miel marmol', 0, '1234567890', 2);
insert into artwork values (6, 'busto antonio nariño', 10000000, '1234567890', 2);

insert into artwork values (7, 'marilyn monroe en tela', 2800000, '1014293634', 3);
insert into artwork values (8, 'luna llena lana', 3000000, '1234567890', 3);
insert into artwork values (9, 'el hombre hormiga', 0, '1014293634', 3);

insert into typecustomer values (1, 'ADULTO', 20000);
insert into typecustomer values (2, 'MENOR DE EDAD', 10000);


insert into customer values ('1013567894', 'Maria Ramirez Pinilla', '8210334', 'laura@gmail.com', 1, 1);
insert into customer values ('3434214686', 'William Torres Aguirre', '3123456534', 'william@gmail.com', 1, 2);
insert into customer values ('2304565435', 'Santiago Hernandez Mesa', '3007310769', 'santiago@gmail.com', 1, 2);

