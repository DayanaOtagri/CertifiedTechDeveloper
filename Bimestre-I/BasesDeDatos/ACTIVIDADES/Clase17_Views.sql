/* 1. Crear una vista con los siguientes datos de los clientes: ID, contacto, y el
Fax. En caso de que no tenga Fax, colocar el teléfono, pero aclarándolo. Por
ejemplo: “TEL: (01) 123-4567”. */

CREATE VIEW v_clientes AS
    SELECT 
        ClienteID, Contacto, COALESCE(Fax, 'TEL:' + telefono) AS Fax
    FROM
        clientes;
SELECT 
    *
FROM
    v_clientes;

/*2. Se necesita listar los números de teléfono de los clientes que no tengan
fax. Hacerlo de dos formas distintas:
a. Consultando la tabla de clientes.
b. Consultando la vista de clientes.*/

-- a
SELECT 
    ClienteID, Contacto, telefono
FROM
    clientes
WHERE
    fax = ''
ORDER BY ClienteID;
        
-- b
SELECT 
    *
FROM
    v_clientes
WHERE
    fax = ''
ORDER BY ClienteID;

/*1. Crear una vista con los siguientes datos de los proveedores: ID,
contacto, compañía y dirección. Para la dirección tomar la dirección,
ciudad, código postal y país.*/

CREATE VIEW v_proveedores AS
    SELECT 
        ProveedorId,
        Contacto,
        Compania,
        CONCAT(Direccion,' ', Ciudad,' ', CodigoPostal,' ', pais) AS Direccion
    FROM
        proveedores;
        
select * from v_proveedores;

/*2. Listar los proveedores que vivan en la calle Americanas en Brasil. Hacerlo
de dos formas distintas:
a. Consultando la tabla de proveedores.
b. Consultando la vista de proveedores.*/

-- a

select Compania, Contacto, Pais, Direccion from proveedores where pais LIKE 'Br%' and direccion LIKE '%Americ%';

-- b
select contacto, Direccion from v_proveedores where direccion LIKE '%Americ%';

/*1. Crear una vista de productos que se usará para control de stock. Incluir el ID
y nombre del producto, el precio unitario redondeado sin decimales, las
unidades en stock y las unidades pedidas. Incluir además una nueva
columna PRIORIDAD con los siguientes valores: 
BAJA: si las unidades pedidas son cero.
■ MEDIA: si las unidades pedidas son menores que las unidades
en stock.
■ URGENTE: si las unidades pedidas no duplican el número de
unidades.
■ SUPER URGENTE: si las unidades pedidas duplican el número
de unidades en caso contrario.*/

create view v_stock as
select ProductoID, ProductoNombre, round(PrecioUnitario), UnidadesStock, UnidadesPedidas from productos;

alter table productos add prioridad VARCHAR(15);

select *,
case
when UnidadesPedidas = 0 Then 'BAJA'
when UnidadesPedidas < UnidadesStock Then 'MEDIA'
when UnidadesPedidas < UnidadesStock*2 Then 'URGENTE'
when UnidadesPedidas >= UnidadesStock*2 Then 'SUPER URGENTE'
end as PRIORIDAD
 from v_stock;