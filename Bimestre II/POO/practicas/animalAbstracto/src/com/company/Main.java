package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Animal animal = new Carpincho("fill", 300.0, "verde");

        Ornitorrinco ornitorrinco1 = new Ornitorrinco("Fal", 400.0,"Azul");

        animal = new Ornitorrinco("Fred", 57.7,"rosa");

        Ornitorrinco ornitorrinco2 = (Ornitorrinco) animal;

        ornitorrinco1.ponerHuevos();
        ornitorrinco1.ponerHuevos();

        ornitorrinco2.ponerHuevos();
        // ornitorrinco2.hacerRuido();



    }
}
