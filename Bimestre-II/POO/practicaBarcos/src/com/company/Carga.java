package com.company;

public abstract class Carga {

    //Atributos clase abstracta
    private String nombre;
    private String descripcion;

    //Constructor


    public Carga(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public abstract Double calcularPeso();

    @Override
    public String toString() {
        return "nombre: " + nombre + " Peso: " + calcularPeso();
    }
}
