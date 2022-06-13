package com.company;

public class RobotLiviano implements Atacable, Defendible, Volable{

    public RobotLiviano(Integer energia) {
        super(energia);
    }

    @Override
    public void atacar() {
        System.out.println("Soy un robot pesado y estoy atacando");
    }

    @Override
    public void defender() {
        System.out.println("Soy un robot pesado y estoy defendiendo");

    }

    @Override
    public void volar() {
        System.out.println("Soy un robot pesado y estoy volando");

    }
}
