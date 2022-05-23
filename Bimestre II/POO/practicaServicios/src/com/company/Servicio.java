package com.company;

public abstract class Servicio {

    //Atributos
    private String nombre;
    private String descripcion;

    //Constructor
    public Servicio(String nombre, String descripcion){
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    //Método abstracto
    public abstract Double calcularPrecio();

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Servicio: " + nombre + " Precio: " + calcularPrecio();
    }

}
