package com.company;

public class Circulo extends Area{


    // Constructor
    public Circulo(Double unidades) {
        super(unidades);
    }

    // Método

    @Override
    public String calcularArea(Double unidades) {
        Double areaCirculo = Math.PI * Math.pow(unidades,2);
        return "El área del circulo es " + areaCirculo + " unidades";
    }

}
