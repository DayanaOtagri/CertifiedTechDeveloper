-- 1. ¿Cuántos clientes existen? 

SELECT count(*) FROM clientes;

-- 2. ¿

SELECT ciudad, COUNT(clienteID) FROM clientes group by ciudad; 

-- 3

SELECT SUM(transporte) FROM facturas;

-- 4

SELECT EnvioVia, SUM(transporte) FROM facturas group by EnvioVia;



SELECT ClienteID, COUNT(facturasID) 
FROM facturas
GROUP BY clienteID
order by cantidad desc; 



SELECT ClienteID, COUNT(facturasID) 
FROM facturas
GROUP BY clienteID
order by cantidad desc 
limit 5;


SELECT EmpleadoID, COUNT(facturaID) as cantidad_ventas
FROM facturas
GROUP BY EmpleadoID
ORDER BY cantidad_ventas DESC 
LIMIT 1; 

SELECT * FROM facturadetalle;

SELECT productoID, COUNT(productoID) as cantidad 
FROM facturadetalle 
GROUP BY productoID 
ORDER BY cantidad DESC
LIMIT 1;


SELECT SUM(precioUnitario*cantidad) as total_facturas