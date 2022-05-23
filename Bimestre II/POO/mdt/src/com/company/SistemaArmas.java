package com.company;

public abstract class SistemaArmas {

    // Atributos:
    private Integer energia;

    // Constructor
    public SistemaArmas(Integer energia){
        this.energia = energia;
    }

    // Métodos:
    public void mostrar(){
        System.out.println("Tengo una energía de: " + this.energia);
    }
}
