SET sql_mode="ONLY_FULL_GROUP_BY";

SELECT * FROM canciones WHERE milisegundos > 120000;

select * FROM canciones WHERE nombre in ("A%", "E%", "I%", "O%", "U%");

SELECT * FROM canciones WHERE compositor is not null order by compositor desc, nombre;

SELECT compositor, count(id) FROM canciones group by compositor;

SELECT compositor, count(id) cantidad FROM canciones group by compositor having cantidad > 10;

SELECT SUM(total) total, ciudad_de_facturacion FROM facturas group by ciudad_de_facturacion;

SELECT SUM(total) total, ciudad_de_facturacion, pais_de_facturacion FROM facturas group by ciudad_de_facturacion, pais_de_facturacion having pais_de_facturacion = "Canada";

SELECT SUM(total) total, ciudad_de_facturacion FROM facturas group by ciudad_de_facturacion having total > 38;

SELECT SUM(total) total, pais_de_facturacion, ciudad_de_facturacion FROM facturas group by pais_de_facturacion, ciudad_de_facturacion;

SELECT max(milisegundos), min(milisegundos), avg(milisegundos) FROM canciones;

SELECT max(c.milisegundos), min(c.milisegundos), avg(c.milisegundos), g.nombre FROM canciones c inner join generos g on g.id = c.id_genero group by g.nombre;
