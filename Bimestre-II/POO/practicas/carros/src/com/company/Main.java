package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //Instancia de auto
        Auto auto1 = new Auto("ASD12223", "Audi","2022");

        //Forma de crear 1
        Chofer chofer1 = new Chofer("Juan", "Otagri", new Auto("ASD123", "Audi", "2022"));

        // Se pone como parametro el auto que se creo en la línea 8
        Chofer chofer2 = new Chofer("Dayana", "Otagri", auto1);

        System.out.println("La patente es: " + chofer2.verPatente());
        System.out.println("Patente asignada: " + chofer1.verPatente());
    }

}

