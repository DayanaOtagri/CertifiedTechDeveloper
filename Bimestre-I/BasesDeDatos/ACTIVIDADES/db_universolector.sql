CREATE SCHEMA UniversoLector;

USE UniversoLector;

CREATE TABLE Socio(
id_socio INT NOT NULL AUTO_INCREMENT,
dni INT NOT NULL,
apellido VARCHAR(100) NULL,
nombres VARCHAR(100) NULL,
direccion VARCHAR(200) NULL,
localidad VARCHAR(100) NULL,
PRIMARY KEY (id_socio)
);

CREATE TABLE Editorial(
id_editorial INT NOT NULL AUTO_INCREMENT,
razon_social VARCHAR(100) NULL,
telefono VARCHAR(100) NULL,
PRIMARY KEY (id_editorial)
);

CREATE TABLE Autor(
id_autor INT NOT NULL AUTO_INCREMENT,
apellido VARCHAR(100) NULL,
nombre VARCHAR(100) NULL,
PRIMARY KEY (id_autor)
);

CREATE TABLE Libro(
id_libro INT NOT NULL AUTO_INCREMENT,
isbn VARCHAR(13) NOT NULL,
titulo VARCHAR(200) NOT NULL,
anio_escritura DATE,
fk_codigo_autor INT NOT NULL,
anio_edicion DATE,
fk_codigo_editorial INT NOT NULL,
PRIMARY KEY (id_libro),
CONSTRAINT fk_codigo_autor
FOREIGN KEY (fk_codigo_autor) REFERENCES Autor (id_autor),
CONSTRAINT fk_codigo_editorial
FOREIGN KEY (fk_codigo_editorial) REFERENCES Editorial (id_editorial)
);

CREATE TABLE TelefonoxSocio(
id_telefonoxsocio INT NOT NULL,
nro_telefono VARCHAR(100) NULL,
fk1_codigo_socio INT NOT NULL,
PRIMARY KEY (id_telefonoxsocio),
CONSTRAINT fk1_codigo_socio
FOREIGN KEY (fk1_codigo_socio) REFERENCES Socio (id_socio)
);

CREATE TABLE Prestamo(
id_prestamo INT NOT NULL AUTO_INCREMENT,
fk2_codigo_socio INT NOT NULL,
fecha DATETIME,
fecha_devolucion DATE,
fecha_tope DATE,
PRIMARY KEY (id_prestamo),
CONSTRAINT fk2_codigo_socio
FOREIGN KEY (fk2_codigo_socio) REFERENCES Socio (id_socio)
);

CREATE TABLE Volumen(
id_volumen INT NOT NULL AUTO_INCREMENT,
fk_codigo_libro INT NOT NULL,
deteriorado BOOL,
PRIMARY KEY (id_volumen),
CONSTRAINT fk_codigo_libro
FOREIGN KEY (fk_codigo_libro) REFERENCES Libro (id_Libro)
);

CREATE TABLE PrestamoxVolumen(
id_prestamoxvolumen INT NOT NULL,
fk_codigo_prestamo INT NOT NULL,
fk_codigo_volumen INT NOT NULL,
PRIMARY KEY (id_prestamoxvolumen),
CONSTRAINT fk_codigo_prestamo
FOREIGN KEY (fk_codigo_prestamo) REFERENCES Prestamo (id_prestamo),
CONSTRAINT fk_codigo_volumen
FOREIGN KEY (fk_codigo_volumen) REFERENCES Volumen (id_volumen)
);













