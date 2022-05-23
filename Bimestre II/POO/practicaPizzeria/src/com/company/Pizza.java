package com.company;

public abstract class Pizza {

    //Atributos
    private String nombre;
    private String descripcion;

    //Atributos
    public Pizza(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    // Método abstracto, todos sus hijos lo implementan
    public abstract Double calcularPrecio();

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "nombre: " + nombre  + " precio:  " + calcularPrecio();
    }
}
