package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa tu nombre: ");

        String nombre = scanner.nextLine();

        System.out.println("Hola " + nombre);

        System.out.println("Ingresa tu edad: ");
        Integer edad = scanner.nextInt();

        if(edad >= 18){
            System.out.println("Eres mayor, puedes ingresar");
        }else {
            System.out.println("No eres mayor, vuleve en " + (18 -  edad) + " años");
        }

        // for(Integer i = 0; i < edad;  i++){
        //     System.out.println(i);
        // }
    }
    public Boolean esPar(Integer numero){
        return numero % 2 == 0;

    }
}
