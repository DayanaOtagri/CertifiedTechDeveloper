package com.company;

public class RobotPesado extends SistemaArmas implements Atacable, Defendible, Volable{


    // Constructor
    public RobotPesado(Integer energia) {
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
