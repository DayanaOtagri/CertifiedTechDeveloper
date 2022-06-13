package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        UsuarioJuego jugador1 = new UsuarioJuego("Jime", "asd123");
//        System.out.println(jugador1.getNombre());
//        System.out.println(jugador1.getPuntaje());
//        jugador1.aumentarPuntaje();
//        System.out.println(jugador1.getPuntaje());
//        System.out.println(jugador1.getNivel());
//        jugador1.subirNivel();
//        System.out.println(jugador1.getNivel());
//        jugador1.bonus(2);
//        System.out.println(jugador1.getPuntaje());
        System.out.println(jugador1.getNombre());
        jugador1.setNombre("Daiana");
        System.out.println(jugador1.getNombre());
    }
}
