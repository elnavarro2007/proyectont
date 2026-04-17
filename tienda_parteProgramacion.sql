-- Base de datos de tienda de juegos parte de programaciob




-- CREO LA BASE SI NO EXISTE
CREATE DATABASE if not EXISTS tiendaDeVideojuegos;

USE tiendaDeVideojuegos;


CREATE TABLE tienda (
	id int PRIMARY key Auto_increment,
	nombre_tienda VARCHAR(30) NOT NULL,
	telefono int(9) not NULL,
	stock INT,
	ubicacion VARCHAR(40)
	
	
);

CREATE table cliente (

	dni CHAR(9) PRIMARY KEY,
	nombre VARCHAR(30) not NULL,
	apellidos VARCHAR(50) not NULL,
	telefono INT(9),
	correo VARCHAR(50) UNIQUE




);


create table videojuego (

	numero_serie CHAR(9)  PRIMARY KEY UNIQUE,
	nombre VARCHAR(30) not null UNIQUE,
	genero VARCHAR(20),
	precio DECIMAL(4,2)
	
	


);

CREATE TABLE TIENDA_VIDEOJUEGO (
    id_tienda INT,
    num_serie CHAR(9),    
    PRIMARY KEY (id_tienda, num_serie),
	
	CONSTRAINT FK_ID_TIENDA FOREIGN KEY (id_tienda) REFERENCES tienda (id),
	CONSTRAINT FK_NUM_TIENDA FOREIGN KEY (num_serie) REFERENCES videojuego (numero_serie)
	
	

);


create table cliente_videojuego (

	dni_cliente CHAR(9) ,
    numero_serie CHAR(9) ,
    
    PRIMARY KEY (dni_cliente, numero_serie),
	
	CONSTRAINT FK_DNI_CLIENTE FOREIGN KEY (dni_cliente) REFERENCES cliente (dni),
	CONSTRAINT FK_NUMERO_SERIE FOREIGN KEY (numero_serie) REFERENCES videojuego (numero_serie)
	
	
  


);