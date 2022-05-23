/* Código de la camada :1021TDIIBD1C1LAED1021FT
 Número de grupo:14
 Nombres: Dayana Otagí, Lorena Pérez, Jacobo Arcila*/



/*Consigna - CheckPoint II
1. Listar todos los clientes cuyo nombre comience con la letra "A". Se debe mostrar
id como "Número de cliente", apellido y nombre.*/
SELECT id as "Número de cliente" ,apellido,nombre FROM cliente WHERE nombre LIKE "A%";
/*	#	Time	Action	Message	Duration / Fetch
3	1	18:21:01	SELECT id as "Número de cliente" ,apellido,nombre FROM cliente WHERE nombre LIKE "A%"
 LIMIT 0, 1000	5 row(s) returned	0.000 sec / 0.000 sec*/
/*2. Mostrar el número de la sucursal con domicilio "Ramón Freire Serrano 7410".*/
SELECT numero FROM sucursal WHERE domicilio LIKE "Ramón Freire Serrano 7410";
/*3	2	18:22:05	SELECT numero FROM sucursal WHERE domicilio LIKE "Ramón Freire Serrano 7410"
 LIMIT 0, 1000	1 row(s) returned	0.000 sec / 0.000 sec*/
/*3. Se requiere saber cuál es el mayor importe prestado*/
SELECT importe FROM pago ORDER BY importe DESC LIMIT 1;
/*3	3	18:22:24	SELECT importe FROM pago ORDER BY importe DESC LIMIT 1	1 row(s) returned	0.000 sec / 0.000 sec*/
/*4. Listar los pagos realizados con números 10, 14, 27, 45.*/
SELECT * FROM pago WHERE id IN(10, 14, 27, 45);
/*3	4	18:22:49	SELECT * FROM pago WHERE id IN(10, 14, 27, 45)
 LIMIT 0, 1000	4 row(s) returned	0.000 sec / 0.000 sec*/
/*5. Calcular el total de los pagos realizados para el préstamo número cuarenta. 
El reporte debe tener dos columnas denominadas "Número de préstamo" y el"Total pagado"
*/
SELECT prestamo_id AS "Número de préstamo", SUM(importe) AS "Total pagado" FROM pago WHERE prestamo_id=40;
/*3	6	18:27:04	SELECT prestamo_id AS "Número de préstamo", SUM(importe) AS "Total pagado" FROM pago WHERE prestamo_id=40
 LIMIT 0, 1000	1 row(s) returned	0.000 sec / 0.000 sec*/
/*6. Listar los empleados que no pertenezcan a la sucursal dos y que la fecha de alta
del contrato sea mayor que 5/09/21 o igual a 25/06/21. Ordenar por alta de
contrato*/
SELECT*FROM empleado WHERE sucursal_numero <>2 AND (alta_contrato_laboral > "2021-09-05" OR alta_contrato_laboral = "2021-06-25") ORDER BY alta_contrato_laboral;
/*3	7	18:28:14	SELECT*FROM empleado WHERE sucursal_numero <>2 AND (alta_contrato_laboral > "2021-09-05" OR alta_contrato_laboral = "2021-06-25") ORDER BY alta_contrato_laboral
 LIMIT 0, 1000	3 row(s) returned	0.000 sec / 0.000 sec*/
/*7. Listar los pagos realizados con importe entre $1030,25 a $1666,66 (ordenarlos
por el importe pagado de mayor a menor).*/
SELECT* FROM pago WHERE importe > 1030.25 AND importe > 1030.25 ORDER BY importe DESC ;
/*3	8	18:28:43	SELECT* FROM pago WHERE importe > 1030.25 AND importe > 1030.25 ORDER BY importe DESC
 LIMIT 0, 1000	70 row(s) returned	0.016 sec / 0.000 sec*/
/*8. Mostrar el quinto pago realizado con menor importe.*/
SELECT* FROM pago WHERE importe ORDER BY importe ASC LIMIT 1 OFFSET 4 ;
/*3	9	18:29:00	SELECT* FROM pago WHERE importe ORDER BY importe ASC LIMIT 1 OFFSET 4	1 row(s) returned	0.000 sec / 0.000 sec*/
/*9. Mostrar el préstamo con mayor importe. Este reporte debe contener el número
del préstamo, la fecha de otorgamiento y el importe.*/
SELECT id AS "número del préstamo",fecha_otorgado, importe FROM prestamo ORDER BY importe DESC LIMIT 1;
/*3	10	18:29:35	SELECT id AS "número del préstamo",fecha_otorgado, importe FROM prestamo ORDER BY importe DESC LIMIT 1	1 row(s) returned	0.000 sec / 0.000 sec*/
/*10. Mostrar las diez cuentas bancarias con menor saldo. Este reporte debe contener
el número de cuenta, saldo y el código del tipo de cuenta.*/
SELECT numero, saldo, cuenta_tipo_id FROM cuenta ORDER BY saldo DESC LIMIT 10 ;
/*3	11	18:30:04	SELECT numero, saldo, cuenta_tipo_id FROM cuenta ORDER BY saldo DESC LIMIT 10	10 row(s) returned	0.000 sec / 0.000 sec*/
/*11. Listar los préstamos otorgados entre 10/07/21 al 10/08/21 (ordenarlos por fecha
de otorgamiento)*/
SELECT * FROM prestamo WHERE fecha_otorgado BETWEEN "2021-07-10" AND "2021-08-10" ORDER BY fecha_otorgado;
/*3	12	18:30:29	SELECT * FROM prestamo WHERE fecha_otorgado BETWEEN "2021-07-10" AND "2021-08-10" ORDER BY fecha_otorgado
 LIMIT 0, 1000	10 row(s) returned	0.000 sec / 0.000 sec*/
/*12. Listar en forma ordenada las cuentas bancarias que tengan un descubierto
otorgado superior o igual a $8999,80.*/
SELECT* FROM cuenta WHERE descubierto_otorgado >= 8999.80 ORDER BY descubierto_otorgado;
/*3	13	18:30:38	SELECT* FROM cuenta WHERE descubierto_otorgado >= 8999.80 ORDER BY descubierto_otorgado
 LIMIT 0, 1000	10 row(s) returned	0.000 sec / 0.000 sec */
/*13. Listar todos los empleados cuyo apellido termine con los caracteres "do". Se
debe mostrar el legajo, apellido, nombre y email.*/
SELECT legajo, apellido, nombre, email FROM empleado WHERE apellido LIKE '%do';
/*3	14	18:30:56	SELECT legajo, apellido, nombre, email FROM empleado WHERE apellido LIKE '%do'
 LIMIT 0, 1000	4 row(s) returned	0.000 sec / 0.000 sec*/
/*14. Se desea conocer cuál es el promedio de los saldos de las cajas de ahorro*/
SELECT cuenta_tipo_id, AVG(saldo) FROM cuenta HAVING cuenta_tipo_id =1 ;
/*3	16	18:32:35	SELECT cuenta_tipo_id, AVG(saldo) FROM cuenta HAVING cuenta_tipo_id =1
 LIMIT 0, 1000	1 row(s) returned	0.000 sec / 0.000 sec*/
/*15. Mostrar el tercer préstamo con mayor importe.*/
SELECT * FROM prestamo ORDER BY importe DESC LIMIT 1 OFFSET 2;
/*3	17	18:32:57	SELECT * FROM prestamo ORDER BY importe DESC LIMIT 1 OFFSET 2	1 row(s) returned	0.000 sec / 0.000 sec*/
/*16. Calcular la cantidad de cuentas que tiene la sucursal número cinco. El reporte
debe tener dos columnas denominadas "Sucursal" y el "Cantidad de Cuentas".*/
SELECT count(numero) AS cantidad_de_cuentas, sucursal_numero AS sucursal FROM cuenta WHERE sucursal_numero = 5;
/*3	18	18:33:13	SELECT count(numero) AS cantidad_de_cuentas, sucursal_numero AS sucursal FROM cuenta WHERE sucursal_numero = 5
 LIMIT 0, 1000	1 row(s) returned	0.000 sec / 0.000 sec*/
/*17. Mostrar todas las ciudades que contengan una palabra de cinco caracteres, pero
el tercer carácter debe ser igual a "n".*/
SELECT* FROM ciudad WHERE nombre LIKE "% __n__ %";
/*3	19	18:33:22	SELECT* FROM ciudad WHERE nombre LIKE "% __n__ %"
 LIMIT 0, 1000	3 row(s) returned	0.000 sec / 0.000 sec*/
/*18. Modificar el tipo de cuenta bancaria "Cuenta Corriente" a "Cuenta Especial"cuenta_tipo*/
UPDATE cuenta_tipo SET tipo="Cuenta Especial" WHERE id=2 ;
/*3	20	18:33:36	UPDATE cuenta_tipo SET tipo="Cuenta Especial" WHERE id=2	0 row(s) affected
 Rows matched: 1  Changed: 0  Warnings: 0	0.000 sec*/
/*19. En la fecha de hoy, agregar en la sucursal número nueve al empleado Quinteros
Arias Raúl Alejandro con domicilio en Av. 25 de mayo 7410 - Pilar - Buenos Aires,
mail: quiteros2021bs@gmail.com, teléfono móvil: '+5491154000745'.*/
INSERT INTO empleado (legajo, sucursal_numero, apellido, nombre, domicilio, ciudad_id, email,telefono_movil, alta_contrato_laboral) VALUES (DEFAULT, 9, "Quinteros
Arias", "Raúl Alejandro", " Av. 25 de mayo 7410", 14 ,"quiteros2021bs@gmail.com", "+5491154000745", "2021-11-15");
/*20. Eliminar el registro del préstamo número cuarenta y cinco*/
/*3	21	18:34:18	INSERT INTO empleado (legajo, sucursal_numero, apellido, nombre, domicilio, ciudad_id, email,telefono_movil, alta_contrato_laboral) VALUES (DEFAULT, 9, "Quinteros
 Arias", "Raúl Alejandro", " Av. 25 de mayo 7410", 14 ,"quiteros2021bs@gmail.com", "+5491154000745", "2021-11-15")	1 row(s) affected	0.000 sec*/
DELETE FROM  prestamo WHERE  id = 45;/*0	22	18:34:48	DELETE FROM  prestamo WHERE  id = 45	Error Code: 1451. Cannot delete or update a parent row: a foreign key constraint fails (`el_descubierto`.`cliente_x_prestamo`, CONSTRAINT `fk_cliente_has_prestamo_prestamo1` FOREIGN KEY (`prestamo_id`) REFERENCES `prestamo` (`id`))	0.016 sec*/


