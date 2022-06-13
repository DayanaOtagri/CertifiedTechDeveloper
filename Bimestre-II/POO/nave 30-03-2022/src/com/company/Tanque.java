package com.company;

public class Tanque extends SistemaArmas implements Atacable, Defendible{
    //Constructor

    public Tanque(Integer energia) {
        super(energia);
    }

    @Override
    public void atacar() {
        System.out.println("Soy un tanque y estoy atacando");

    }

    @Override
    public void defender() {

        System.out.println("Soy un tanque y estoy defendiendo");

    }
}
