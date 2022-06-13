package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Almacen almacen = new Almacen();
        ProductoFactory productoFactory = ProductoFactory.getInstance();

        almacen.agregarProducto(ProductoFactory.CODIGO_CAJA10);
        almacen.agregarProducto(ProductoFactory.CODIGO_CAJA10);
        almacen.agregarProducto(ProductoFactory.CODIGO_CAJA10);
        almacen.agregarProducto(ProductoFactory.CODIGO_CAJA10);
        almacen.agregarProducto("codigo no valido");
        almacen.agregarProducto("codigo no valido");
        almacen.agregarProducto("codigo no valido");
        almacen.agregarProducto("codigo no valido");
        almacen.agregarProducto(ProductoFactory.CODIGO_PELOTA_FUTBOL);
        almacen.agregarProducto(ProductoFactory.CODIGO_PELOTA_FUTBOL);
        almacen.agregarProducto(ProductoFactory.CODIGO_PELOTA_FUTBOL);

        System.out.println(almacen.calcularEspacioNecesario());

    }
}
