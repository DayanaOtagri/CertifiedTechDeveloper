package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Camion camion1 = new Camion("Ford", "ASD123");


        Camion.cambiarPrecioCombustible(20.000);

        System.out.println("Gasto " + camion1.gastoCombustible(70));

    }
}
