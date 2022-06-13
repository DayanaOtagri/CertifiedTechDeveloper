package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here


        UsuarioJuego usuario1 = new UsuarioJuego("Estefania", "Zoe123");

        System.out.println("Nombre jugador: " + usuario1.getNombre());
        //System.out.println("Puntaje: " + usuario1.getPuntaje());
        // Aumenta el puntaje
        usuario1.aumentarPuntaje();
        usuario1.aumentarPuntaje();
        usuario1.aumentarPuntaje();
        System.out.println("Nuevo puntaje: " + usuario1.getPuntaje());
        //System.out.println("Nivel: " + usuario1.getNivel());
        //Aumento el nivel
        usuario1.subirNivel();
        usuario1.subirNivel();
        usuario1.subirNivel();
        System.out.println("Nuevo nivel: " + usuario1.getNivel());
    }
}
