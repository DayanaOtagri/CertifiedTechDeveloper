package com.company;

public class Ornitorrinco extends Animal{

    private Integer cantidadHijos;

    public Ornitorrinco(String nombre, Double energia, String color) {
        super(nombre, energia, color);
        this.cantidadHijos = 0;
    }

    public void ponerHuevos(){
        cantidadHijos++;
        System.out.println("Soy " + getNombre()+ "  y puse " + cantidadHijos);
    }

    @Override
    public void hacerRuido() {
        System.out.println("pgrrrr");
    }
}
