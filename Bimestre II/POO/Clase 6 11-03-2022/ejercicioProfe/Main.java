package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Impresora impresora = new Impresora("HP","USB","20/1/1990");

        Impresora impresora1 = new Impresora("Epson","Inalambrica");

        impresora.setHojasDisponibles(3);
        impresora.imprimir("hola mundo ");
        impresora.imprimir(" chau mundo");
        impresora.imprimir(" mundo");
        impresora.imprimir("algo");
    }
}
