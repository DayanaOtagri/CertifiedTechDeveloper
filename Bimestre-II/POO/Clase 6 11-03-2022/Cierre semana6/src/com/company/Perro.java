package com.company;

public class Perro {
    String raza;
    Integer anioNacimiento;
    Double peso;
    Boolean tieneChip;
    Boolean estaLastimado;
    String nombre;

    public Perro(String nombre, String raza, Integer anioNacimiento ) {
        this.nombre = nombre;
        this.raza = raza;
        this.anioNacimiento = anioNacimiento;
    }

    public Integer calcularEdad(){
        this.anioNacimiento - 2022
    }
}





