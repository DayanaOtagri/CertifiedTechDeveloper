package com.company;

public abstract class Animal {
    private String nombre;
    private Double energia;
    private String color;

    public Animal(String nombre, Double energia, String color) {
        this.nombre = nombre;
        this.energia = energia;
        this.color = color;
    }

    public void hacerRuido(){

        System.out.println("Ruido del animal");

    }


    public String getNombre() {
        return nombre;
    }

    public void comer(Double pesoComida){
        this.energia += pesoComida;
    }

}
