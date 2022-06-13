package com.company;

public class PizzaSimple  extends Pizza{

    //Atributos propios de la clase
    private Double precioBase;
    private Boolean esGrande;

    public PizzaSimple(String nombre, String descripcion, Double precio, Boolean esGrande) {
        super(nombre, descripcion);
        this.precioBase = precio;
        this.esGrande = esGrande;
    }

    @Override
    public Double calcularPrecio() {

        if(esGrande) {
        return precioBase += precioBase;
    }
        return precioBase;
}
}
