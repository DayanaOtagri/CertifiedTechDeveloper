/* SOLUCIÓN ACTIVIDAD: Consultas queries XL parte I y II - GROUP BY/JOIN

/* 1. ¿Cuántos clientes hay?*/
select COUNT(*) from clientes;
/* 2. ¿Cuántos clientes hay por ciudad?*/
select COUNT(*), ciudad from clientes
GROUP BY Ciudad;
/* 1. ¿Cuál es el total de transporte?*/
select sum(Transporte) as "Total de transporte" from facturas;
/* 2. ¿Cuál es el total de transporte por EnvioVia?*/
select sum(Transporte) as "Total de transporte", EnvioVia from facturas
Group by EnvioVia;
/* 3. Calcular la cantidad de facturas por cliente. Ordenar descendentemente por cantidad de facturas.*/
select count(FacturaID) as "cantidad de facturas", ClienteID from facturas
group by ClienteID order by "cantidad de facturas" desc; /*REVISAR*/
/* 4. Obtener el Top 5 de clientes de acuerdo a su cantidad de facturas.*/
select count(FacturaID) as "cantidad de facturas", ClienteID from facturas
group by ClienteID having count(*) > 5;
/* 5. ¿Cuál es el país de envío menos frecuente de acuerdo a la cantidad de facturas?*/
select count(FacturaID) as "cantidad de facturas", PaisEnvio from facturas
group by PaisEnvio order by count(FacturaID) asc limit 1;
/* 6. Se quiere otorgar un bono al empleado con más venta ¿Qué ID de empleado realizó más operaciones de ventas?*/
select count(FacturaID) as "Ventas", EmpleadoID from facturas
group by EmpleadoID order by count(FacturaID) desc limit 1;

/* FACTURA DETALLE
1. ¿Cuál es el producto que aparece en más líneas de la tabla Factura Detalle?*/
select count(ProductoID) as "Producto más facturado" from facturadetalle
group by ProductoID order by count(ProductoID) desc limit 1;
/* 2. ¿Cuál es el total facturado? considerar que el total facturado esla suma de cantidad por precio unitario*/
select sum(PrecioUnitario * Cantidad) as "Total facturado" from facturadetalle;
/* 3. ¿Cuál es el total facturado para los productos ID entre 30 y 50?*/
select sum(PrecioUnitario * Cantidad) as "Total facturado", ProductoID from facturadetalle
group by ProductoID having ProductoID between 30 and 50;
/* 4. ¿Cuál es el precio unitario promedio de cada producto?*/
select avg(PrecioUnitario) as "Precio unitario promedio", ProductoID from facturadetalle
group by ProductoID;
/* 5. ¿Cuál es el precio unitario máximo?*/
select max(PrecioUnitario) from facturadetalle;

/*PARTE II
1. Generar un listado de todas las facturas del empleado "Buchanan".*/
select facturas.FacturaID, empleados.apellido from empleados
inner join facturas on facturas.EmpleadoID = empleados.EmpleadoID where apellido = "Buchanan";

/* 2. Generar un listado con todos los campos de las facturas del correo "Speedy Express"*/
select * from correos
inner join facturas on correos.correoID = facturas.EnvioVia where compania = "Speedy Express";
/*PREGUNTAR SOBRE ENVIOVIA*/

/* 3. Generar un listado de todas las facturas con el nombre y apellidode los empleados.*/
select empleados.Apellido, empleados.Nombre, facturas.facturaID from empleados
inner join facturas on empleados.EmpleadoID = facturas.EmpleadoID;

/* 4. Mostrar un listado de las facturas de todos los clientes "Owner" y país de envío "USA".*/
select facturas.facturaID, facturas.PaisEnvio, clientes.Titulo from clientes
inner join facturas on clientes.ClienteID = facturas.ClienteID where clientes.Titulo = "Owner" and facturas.PaisEnvio = "USA";  

/* 5. Mostrar todos los campos de las facturas del empleado cuyo apellido sea "Leverling" o que incluyan el producto id= "42".*/
select facturas.FacturaID, empleados.Apellido, productos.ProductoID from empleados
inner join facturas on facturas.EmpleadoID = empleados.EmpleadoID 
inner join facturadetalle on facturas.FacturaID = facturadetalle.FacturaID
inner join productos on facturadetalle.productoID = productos.ProductoID
where empleados.Apellido = "Leverling" and productos.ProductoID = "42";

/* 6. Mostrar todos los campos de las facturas del empleado cuyo apellido sea "Leverling" y que incluya el producto id = "80" o "42"*/
select facturas.FacturaID, empleados.Apellido, productos.ProductoID from empleados
inner join facturas on facturas.EmpleadoID = empleados.EmpleadoID 
inner join facturadetalle on facturas.FacturaID = facturadetalle.FacturaID
inner join productos on facturadetalle.productoID = productos.ProductoID
where empleados.Apellido = "Leverling" and (productos.ProductoID = "42" or productos.ProductoID = "80");

/* 7. Generar un listado con los cinco mejores clientes,según sus importes de compras total (precioUnitario * cantidad)*/
select clientes.Compania, sum(facturadetalle.precioUnitario * facturadetalle.Cantidad) as "Compra total" from clientes
inner join facturas on facturas.ClienteID = clientes.ClienteID
inner join facturadetalle on facturas.FacturaID = facturadetalle.FacturaID
group by Compania limit 5;

/* 8.  Generar un listado de facturas, con los campos id, nombre y apellido del cliente, fecha de factura, país de envío, Total, ordenado de manera descendente por
fecha de factura y limitado a 10 filas.*/

select facturas.FacturaID as "id", clientes.Contacto as "Cliente: Nombre y Apellido", facturas.FechaFactura as "Fecha de factura", facturas.PaisEnvio as "país de envío", sum(facturadetalle.precioUnitario * facturadetalle.Cantidad) as "Total" from clientes
inner join facturas on facturas.ClienteID = clientes.ClienteID
inner join facturadetalle on facturas.facturaID = facturadetalle.FacturaID
group by facturas.FechaFactura
order by FechaFactura desc
limit 10;




