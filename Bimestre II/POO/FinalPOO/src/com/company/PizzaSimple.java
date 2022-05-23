package com.company;

public class PizzaSimple  extends Pizza{

    //Atributos propios de la clase
    private Double precioBase;
    private Boolean esGrande;

    // Constructor que hereda de clase Pizza y también tiene sus propios atributos
    public PizzaSimple(String nombre, String descripcion, Double precio, Boolean esGrande) {
        super(nombre, descripcion);
        this.precioBase = precio;
        this.esGrande = esGrande;
    }


    //Método que hereda de la clase Pizza (Contrato)
    @Override
    public Double calcularPrecio() {

        // Si el grande su precio se duplica
        if(esGrande) {
            return precioBase += precioBase;
        }
        return precioBase;
    }
}

