/*
Crear una vista para poder organizar los envíos de las facturas. Indicar número
de factura, fecha de la factura y fecha de envío, ambas en formato dd/mm/yyyy,
valor del transporte formateado con dos decimales, y la información del
domicilio del destino incluyendo dirección, ciudad, código postal y país, en una
columna llamada Destino.
*/

/*
CREATE VIEW vistaFacturas AS 
SELECT  FacturaID, 
date_format(FechaFactura, '%d/%m/%y') AS FechaFactura,
 date_format(FechaEnvio, '%d/%m/%y') AS FechaEnvio,
 round(Transporte, 2) AS valorTransporte,
 concat(DireccionEnvio, ' ', CiudadEnvio, ' ', CodigoPostalEnvio, ' ', PaisEnvio) AS  Destino,
 FROM facturas;*/
 
 
 CREATE VIEW VistaFacturas AS 
	SELECT FacturaID, 
		DATE_FORMAT(FechaFactura, '%d/%m/%Y') AS FechaFactura, 
        DATE_FORMAT(FechaEnvio, '%d/%m/%Y') AS FechaEnvio, 
        ROUND(Transporte, 2) AS ValorTransporte,
		CONCAT(DireccionEnvio, ' ', CiudadEnvio, ' ', CodigoPostalEnvio, ' ', PaisEnvio) AS Destino
	FROM Facturas;

select * from VistaFacturas;

/*
Realizar una consulta con todos los correos y el detalle de las facturas que
usaron ese correo. Utilizar la vista creada.
*/

SELECT c.CorreoID, vf.* 
from VistaFacturas AS vf 
inner join facturas AS f
on vf.FacturaID = f.FacturaID
inner join correos AS c
on c.CorreoID = f.EnvioVia;

/*
Crear una vista con un detalle de los productos en stock. Indicar id, nombre del
producto, nombre de la categoría y precio unitario.
*/

CREATE VIEW productosEnStock AS 
SELECT p.ProductoID, p.ProductoNombre, c.CategoriaNombre, p.PrecioUnitario 
FROM productos AS p 
left join categorias AS c 
on p.CategoriaID = c.CategoriaID; 

select * From productosEnStock;

/*
Escribir una consulta que liste el nombre y la categoría de todos los productos
vendidos. Utilizar la vista creada.
*/

SELECT DISTINCT ps.ProductoNombre, ps.CategoriaNombre
FROM ProductosEnStock ps
	INNER JOIN FacturaDetalle fd
	ON ps.ProductoID = fd.ProductoID;
