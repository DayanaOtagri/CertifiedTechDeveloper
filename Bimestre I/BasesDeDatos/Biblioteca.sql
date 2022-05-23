CREATE SCHEMA universoLector; 

USE universoLector;

CREATE TABLE socio(
id_socio INT NOT NULL AUTO_INCREMENT, 
dni INT NOT NULL,
apellido VARCHAR(100) NULL,
nombres VARCHAR(100) NULL, 
direccion VARCHAR(200) NULL, 
localidad VARCHAR(100) NULL, 
PRIMARY KEY (id_socio)
);

CREATE TABLE editorial(
id_socio INT NOT NULL AUTO_INCREMENT,
razon_social VARCHAR(100) NULL, 
telefono VARCHAR(100) NULL,
PRIMARY KEY (id_editorial)
);

CREATE TABLE autor(
id_autor INT NOT NULL AUTO_INCREMENT,
apellido VARCHAR(100) NULL,
nombre VARCHAR(100) NULL,
PRIMARY KEY (id_autor)
);

CREATE TABLE libro(
id_libro INT NOT NULL,
isbn VARCHAR(100) NOT NULL, 
titulo VARCHAR(200) NOT NULL,
anio_escritura DATE, 
fk_codigo_autor INT NOT NULL, 
anio_edicion DATE,
fk_codigo_editorial INT NOT NULL,
PRIMARY KEY (id_libro),
CONSTRAINT fk_codigo_autor
FOREIGN KEY (fk_codigo_autor) REFERENCES autor (id_autor),
CONSTRAINT fk_codigo_editorial
FOREIGN KEY (fk_codigo_editorial) REFERENCES editorial (id_editorial)
);

CREATE TABLE telefonosxSocio(
id_telefonosxSocio INT NOT NULL, 
nro_telefono VARCHAR(100) NULL,
fk_codigo_socio INT NOT NULL, 
PRIMARY KEY (id_telefonosxSocio),


