INSERT INTO socio VALUES
(1, 3000000, "PATRICIA", "JOHNSON", "28 MySQL Boulevard", "QLD"),
(2, 2988800, "LINDA", "WILLIAMS", "23 Workhaven Lane", "Alberta"),
(3, 2500000, "BARBARA", "JONES", "1411 Lillydale Drive", "QLD"),
(4, 32980002, "LOIS", "BUTLER", "1688 Okara Way", "Nothwest Border Prov"),
(5, 2313909, "ROBIN", "HAYES", "262 A Corua (La Corua) Parkway", "Dhaka");

INSERT INTO telefonoxsocio VALUES
(1, 102100019806, 1),
(2, 1101290803, 2),
(3, 6001833044, 3),
(4, 553577787, 4),
(5, 100808424538, 5);

INSERT INTO autor VALUES
(1, "García Márquez", "Gabriel"),
(2, "Kafka", "Franz"),
(3, "Austen", "Jane"),
(4, "Alighieri", "Dante"),
(5, "Vargas Llosa", "Mario");

INSERT INTO editorial VALUES
(1, "DEBOLSILLO", 9056573178),
(2, "ALIANZA EDITORIAL", 9422200526),
(3, "EDITORIAL ALMA", "9474041624"),
(4, "ESPASA LIBROS", "4759739782"),
(5, "PUNTO DE LECTURA", 4063677292);

INSERT INTO libro VALUES
(1, "9788497592208", "Cien Años de Soledad", '1967-01-01', 1, '2021-01-01', 1),
(2, "9788420651361", "La Metamorfosis", '1915-01-01', 2, '2011-01-01', 2),
(3, "9788415618782", "Orgullo y Prejuicio", '1813-01-01', 3, '2021-01-01', 3),
(4, "9788467033489", "La Divina Comedia", '1472-01-01', 4, '2010-01-01', 4),
(5, "9788466309158", "La Ciudad y los Perros", '1963-01-01', 5, '2006-01-01', 5);

INSERT INTO volumen VALUES
(1, 1, 0),
(2, 2, 1),
(3, 3, 1),
(4, 4, 1),
(5, 5, 0);

INSERT INTO prestamo VALUES
(1, 2, '2021-11-03 14:00:00', '2021-11-05', '2021-11-06'),
(2, 3, '2021-11-04 10:00:00', '2021-11-05', '2021-11-06'),
(3, 1, '2021-11-04 16:30:00', '2021-11-05', '2021-11-06'),
(4, 5, '2021-11-05 08:00:00', '2021-11-06', '2021-11-06'),
(5, 4, '2021-11-05 09:30:00', '2021-11-06', '2021-11-06');

INSERT INTO prestamoxvolumen VALUES
(1, 2, 3),
(2, 3, 4),
(3, 1, 5),
(4, 5, 2),
(5, 4, 1);

DELETE FROM socio
WHERE localidad = "Nothwest Border Prov";
-- Al ejecutar el anterior comando, retorna este mensaje:
-- Error Code: 1451. Cannot delete or update a parent row: a foreign key constraint fails (`universolector`.`telefonoxsocio`, CONSTRAINT `fk1_codigo_socio` FOREIGN KEY (`fk1_codigo_socio`) REFERENCES `socio` (`id_socio`))

DELETE FROM libro
WHERE volumen = 1;
-- Al ejecutar el anterior comando, retorna este mensaje:
-- Error Code: 1054. Unknown column 'volumen' in 'where clause'

UPDATE socio
SET direccion = "Monroe 860"
WHERE id_socio = 3
