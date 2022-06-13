package com.company;

public class RobotLiviano extends SistemaArmas implements Atacable,Defendible,Volable{

    // Constructor
    public RobotLiviano(Integer energia) {
        super(energia);
    }

    @Override
    public void atacar() {
        System.out.println("Soy un Robot Liviano y estoy atacando");
    }

    @Override
    public void defender() {
        System.out.println("Soy un Robot Liviano y estoy defendiendo");
    }

    @Override
    public void volar() {
        System.out.println("Soy un Robot Liviano y estoy volando");
    }
}
