package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //Se crea la instancia de la clase "Articulo"
        double precio;
        Articulo articulo = new Articulo("Articulo1",0,10.000);

        if (articulo.hayStock()){
                    System.out.println("Hay Stock Disponible");
                }
        else {
            System.out.println("No hay stock");
        }

        {
            System.out.println("El precio de venta es: " + articulo.consultarPrecio());
        }
    }
}
