

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';


CREATE SCHEMA IF NOT EXISTS el_descubierto DEFAULT CHARACTER SET utf8 ;
USE el_descubierto ;


CREATE TABLE IF NOT EXISTS el_descubierto.sucursal (
  idsucursal INT NOT NULL AUTO_INCREMENT,
  ciudad VARCHAR(30) NOT NULL,
  codigo_postal MEDIUMINT(6) NOT NULL,
  pais VARCHAR(55) NOT NULL,
  PRIMARY KEY (idsucursal));


CREATE TABLE IF NOT EXISTS el_descubierto.prestamo (
  idprestamo INT NOT NULL AUTO_INCREMENT,
  fecha_otorgamiento DATE NOT NULL,
  importe INT NOT NULL,
  cuotas SMALLINT NOT NULL,
  sucursal_idsucursal INT NOT NULL,
  PRIMARY KEY (idprestamo),
  INDEX fk_prestamo_sucursal1_idx (sucursal_idsucursal ASC) VISIBLE,
  CONSTRAINT fk_prestamo_sucursal1
    FOREIGN KEY (sucursal_idsucursal)
    REFERENCES el_descubierto.sucursal (idsucursal)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);


CREATE TABLE IF NOT EXISTS el_descubierto.clientes (
  idclientes INT NOT NULL AUTO_INCREMENT,
  apellido VARCHAR(25) NOT NULL,
  nombre VARCHAR(25) NOT NULL,
  domicilio VARCHAR(50) NOT NULL,
  email VARCHAR(60) NOT NULL,
  telefono CHAR(15) NOT NULL,
  prestamo_idprestamo INT NOT NULL,
  PRIMARY KEY (idclientes),
  INDEX fk_clientes_prestamo1_idx (prestamo_idprestamo ASC) VISIBLE,
  CONSTRAINT fk_clientes_prestamo1
    FOREIGN KEY (prestamo_idprestamo)
    REFERENCES el_descubierto.prestamo (idprestamo)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);
    
CREATE TABLE IF NOT EXISTS el_descubierto.pagos (
  idpagos INT NOT NULL AUTO_INCREMENT,
  numero_cuota SMALLINT NOT NULL,
  fecha DATE NOT NULL,
  importe INT NOT NULL,
  pagoscol VARCHAR(45) NULL,
  prestamo_idprestamo INT NOT NULL,
  PRIMARY KEY (idpagos),
  INDEX fk_pagos_prestamo1_idx (prestamo_idprestamo ASC) VISIBLE,
  CONSTRAINT fk_pagos_prestamo1
    FOREIGN KEY (prestamo_idprestamo)
    REFERENCES el_descubierto.prestamo (idprestamo)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);

CREATE TABLE IF NOT EXISTS el_descubierto.historial (
  idhistorial INT NOT NULL AUTO_INCREMENT,
  fecha_hora DATETIME NOT NULL,
  saldo INT NOT NULL,
  PRIMARY KEY (idhistorial));


CREATE TABLE IF NOT EXISTS el_descubierto.empleados (
  idempleados INT NOT NULL AUTO_INCREMENT,
  apellido VARCHAR(25) NOT NULL,
  nombre VARCHAR(25) NOT NULL,
  domicilio VARCHAR(50) NOT NULL,
  email VARCHAR(50) NOT NULL,
  telefono CHAR(15) NOT NULL,
  fecha_contrato DATE NOT NULL,
  sucursal_idsucursal INT NOT NULL,
  PRIMARY KEY (idempleados),
  INDEX fk_empleados_sucursal1_idx (sucursal_idsucursal ASC) VISIBLE,
  CONSTRAINT fk_empleados_sucursal1
    FOREIGN KEY (sucursal_idsucursal)
    REFERENCES el_descubierto.sucursal (idsucursal)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);


CREATE TABLE IF NOT EXISTS el_descubierto.tipo_intereses (
  idintereses INT NOT NULL AUTO_INCREMENT,
  nombre VARCHAR(45) NULL,
  PRIMARY KEY (idintereses));


CREATE TABLE IF NOT EXISTS el_descubierto.tipo_cuenta (
  idtipo_cuenta INT NOT NULL AUTO_INCREMENT,
  nombre VARCHAR(45) NOT NULL,
  tipo_intereses_idintereses INT NOT NULL,
  PRIMARY KEY (idtipo_cuenta),
  INDEX fk_tipo_cuenta_tipo_intereses1_idx (tipo_intereses_idintereses ASC) VISIBLE,
  CONSTRAINT fk_tipo_cuenta_tipo_intereses1
    FOREIGN KEY (tipo_intereses_idintereses)
    REFERENCES el_descubierto.tipo_intereses (idintereses)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);


CREATE TABLE IF NOT EXISTS el_descubierto.cuenta (
  idcuenta INT NOT NULL AUTO_INCREMENT,
  asociado_ejecutivo TINYINT(1) NOT NULL,
  estado CHAR(10) NOT NULL,
  sucursal_idsucursal INT NOT NULL,
  tipo_cuenta_idtipo_cuenta INT NOT NULL,
  historial_idhistorial INT NOT NULL,
  PRIMARY KEY (idcuenta),
  INDEX fk_cuenta_sucursal1_idx (sucursal_idsucursal ASC) VISIBLE,
  INDEX fk_cuenta_tipo_cuenta1_idx (tipo_cuenta_idtipo_cuenta ASC) VISIBLE,
  INDEX fk_cuenta_historial1_idx (historial_idhistorial ASC) VISIBLE,
  CONSTRAINT fk_cuenta_sucursal1
    FOREIGN KEY (sucursal_idsucursal)
    REFERENCES el_descubierto.sucursal (idsucursal)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT fk_cuenta_tipo_cuenta1
    FOREIGN KEY (tipo_cuenta_idtipo_cuenta)
    REFERENCES el_descubierto.tipo_cuenta (idtipo_cuenta)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT fk_cuenta_historial1
    FOREIGN KEY (historial_idhistorial)
    REFERENCES el_descubierto.historial (idhistorial)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);


CREATE TABLE IF NOT EXISTS el_descubierto.clientes_x_cuenta (
  clientes_idclientes INT NOT NULL,
  cuenta_idcuenta INT NOT NULL,
  PRIMARY KEY (clientes_idclientes, cuenta_idcuenta),
  INDEX fk_clientes_has_cuenta_cuenta1_idx (cuenta_idcuenta ASC) VISIBLE,
  INDEX fk_clientes_has_cuenta_clientes_idx (clientes_idclientes ASC) VISIBLE,
  CONSTRAINT fk_clientes_has_cuenta_clientes
    FOREIGN KEY (clientes_idclientes)
    REFERENCES el_descubierto.clientes (idclientes)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT fk_clientes_has_cuenta_cuenta1
    FOREIGN KEY (cuenta_idcuenta)
    REFERENCES el_descubierto.cuenta (idcuenta)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
