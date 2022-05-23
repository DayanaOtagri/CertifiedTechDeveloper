package com.company;

public class SistemaArmas {

    //Atributos
    private Integer energia;


    //Constructor
    public  SistemaArmas(Integer energia){
        this.energia = energia;
    }


    // Métodos
    public void mostrar(){
        System.out.println("Mi energía es de: " + this.energia);
    }
}
