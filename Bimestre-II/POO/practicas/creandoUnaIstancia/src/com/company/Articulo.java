package com.company;

public class Articulo {
    //Atributos de la Clase
    private String descripcion;
    private Double precioVenta;
    private Integer stock;

    //Constructor de la Clase
    public Articulo(String descripcion, int cantidad, Double precio) {
        this.descripcion = descripcion;
        this.stock = cantidad;
        this.precioVenta = precio;
    }

    //Métodos de la Clase
    public boolean hayStock(){
        return stock>0;
    }

    public double consultarPrecio(){
        return precioVenta;
    }
}

