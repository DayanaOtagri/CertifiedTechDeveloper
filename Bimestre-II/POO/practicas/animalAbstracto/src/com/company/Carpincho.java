package com.company;

public class Carpincho extends Animal{

    public Carpincho(String nombre, Double energia, String color) {
        super(nombre, energia, color);
    }

    @Override
    public void hacerRuido() {
        System.out.println("ccccc");
    }
}
