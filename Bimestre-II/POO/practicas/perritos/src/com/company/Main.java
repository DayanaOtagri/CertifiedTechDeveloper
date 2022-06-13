package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Perro mascota1 = new Perro("Firu", "Criolla", 2001, 4.0, true, false);
        Perro mascota2 = new Perro("Zoe", "Criolla",2020, 4.0, false, false);


        System.out.println("Nombre: " + mascota1.getNombre());
        System.out.println("La edad de la mascota es: " + mascota1.calcularEdad(2022));
        System.out.println("Se puede dar en adopción: " + mascota1.darEnAdopcion());
        System.out.println("Se puede perder: " + mascota1.sePuedePerder());

        System.out.println("Nombre: " + mascota2.getNombre());
        System.out.println("La edad de la mascota es: " + mascota2.calcularEdad(2022));
        System.out.println("Se puede dar en adopción: " + mascota2.darEnAdopcion());
        System.out.println("Se puede perder: " + mascota2.sePuedePerder());
    }
}
