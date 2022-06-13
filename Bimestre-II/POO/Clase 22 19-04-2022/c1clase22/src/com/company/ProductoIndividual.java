package com.company;

public class ProductoIndividual implements Comprable  {

    private String nombre;
    private Double precio;

    public ProductoIndividual(String nombre, Double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public Double informarPrecio() {
        System.out.println("encontre un " + nombre + " su valor es de " + precio);
        return precio;
    }
}
