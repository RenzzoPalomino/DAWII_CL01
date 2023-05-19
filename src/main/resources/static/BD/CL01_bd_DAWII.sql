drop database cl01_dawii_palomino_renzzo;
create database CL01_DAWII_Palomino_Renzzo;
use CL01_DAWII_Palomino_Renzzo;

create table Alumno(
id_alumno int primary key auto_increment,
nombre_alumno varchar(30),
apellido_alumno varchar(40),
fecha_nacimiento date,
email_alumno varchar(50),
id_Curso int
);

create table Curso(
id_Curso int primary key auto_increment,
nombre_curso varchar(70),
creditos_curso int,
fecha_inicio date
);
alter table Alumno add constraint FK01 foreign key(id_Curso) references Curso(id_Curso);



insert into Curso values(null,"Desarrollo de Aplicaciones Moviles II",4,'2023-08-22');
insert into Curso values(null,"Desarrollo de Aplicaciones Web II",5,'2023-08-22');
insert into Curso values(null,"Pruebas de Software",3,'2023-08-22');
insert into Curso values(null,"Pruebas de Software II",3,'2023-08-22');

	select*from Curso;

insert into Alumno values(null,"Renzzo Omar","Palomino de la Vega",'2001-11-14','renzzoomar@gmail.com',1);
insert into Alumno values(null,"Juan Andres","Benitez Romero",'2002-05-03',"jabr@gmail.com",2);
insert into Alumno values(null,"Nancy Victoria","Tueros Perez",'2001-01-11',"nvtp@gmail.com",2);
	select*from Alumno;




