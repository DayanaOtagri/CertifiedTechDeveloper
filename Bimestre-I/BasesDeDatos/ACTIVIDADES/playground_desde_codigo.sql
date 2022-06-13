-- Clase: 08
-- Crear base de datos
CREATE DATABASE playground_desde_codigo DEFAULT CHARACTER SET utf8; 

-- Marcar base de datos por defecto
USE playground_desde_codigo;


-- Definición de tablas: Se recomienda empezar por las tablas secundarias
-- Crear tabla categoria
CREATE TABLE categoria (
	id INT NOT NULL AUTO_INCREMENT,
	nombre VARCHAR(15) NOT NULL,
		PRIMARY KEY (id));
        
        
-- Crear tabla usuario
CREATE TABLE usuario (
	id INT NOT NULL AUTO_INCREMENT,
	apellido VARCHAR(25) NOT NULL,
	nombre VARCHAR(30) NOT NULL,
	email VARCHAR(70) NOT NULL,
	categoria_id INT NOT NULL,
		PRIMARY KEY (id),
		CONSTRAINT fk_usuario_categoria FOREIGN KEY (categoria_id) REFERENCES categoria (id));


-- Crear tabla carrera
CREATE TABLE carrera (
	id INT NOT NULL AUTO_INCREMENT,
	titulo VARCHAR(50) NOT NULL,
	descripcion VARCHAR(250),
		PRIMARY KEY (id));


-- Crear relación N:M (tabla usuario_x_carrera)
CREATE TABLE usuario_x_carrera (
	usuario_id INT NOT NULL,
	carrera_id INT NOT NULL,
	fecha_inscripcion DATE NOT NULL,
		PRIMARY KEY (usuario_id, carrera_id),
        CONSTRAINT fk_usuario_usuario_x_carrera FOREIGN KEY (usuario_id) REFERENCES usuario (id),
        CONSTRAINT fk_carrera_usuario_x_carrera FOREIGN KEY (carrera_id) REFERENCES carrera (id));


-- INSERT ----------------------------------------------------------------------------------------
INSERT INTO categoria (id, nombre) VALUES (1, 'Estudiante'); -- Modo 1: Completo.

INSERT INTO categoria (id, nombre) VALUES (DEFAULT, 'Estudiante'); -- Modo 2: DEFAULT depende de que el campo ID esté seteado como auto-incremental.

INSERT INTO categoria (nombre) VALUES ('Estudiante'); -- Modo 3: No se declara ID pero este campo debe estar seteado como auto-incremental.

INSERT INTO categoria VALUES (DEFAULT, 'Estudiante'); -- Modo 4: Se deben definir los valores de todos los campos. Además, DEFAULT depende de que el campo ID esté seteado como auto-incremental.

-- UPDATE ----------------------------------------------------------------------------------------
UPDATE categoria SET nombre = 'Docente' WHERE ID = 1;

-- DELETE ----------------------------------------------------------------------------------------
DELETE FROM categoria WHERE ID = 1; -- Importante: Para eliminar este registro, el mismo no puede ser estar siendo referenciado por un registro de otra tabla (usuario).

-- ALTER TABLE -----------------------------------------------------------------------------------
-- Agregar la columna documento en la tabla usuario
ALTER TABLE usuario
	ADD COLUMN documento CHAR(8) NOT NULL;

-- Agregar la columna fecha_nacimiento en la tabla usuario
ALTER TABLE usuario
	ADD COLUMN fecha_nacimiento DATETIME NOT NULL AFTER nombre;
    
-- Cambiar el nombre y tipo de datos de la columna documento en la tabla usuario
ALTER TABLE usuario
	CHANGE COLUMN documento documento_identidad INT NOT NULL;

-- Eliminar la columna documento_identidad en la tabla usuario
ALTER TABLE usuario
	DROP COLUMN documento_identidad;


-- DROP TABLE -----------------------------------------------------------------------------------
-- Para eliminar la tabla categoria, primero se debe eliminar la FK en la tabla usuario
ALTER TABLE usuario
	DROP FOREIGN KEY fk_usuario_categoria,
	DROP COLUMN categoria_id;
    
DROP TABLE categoria;

