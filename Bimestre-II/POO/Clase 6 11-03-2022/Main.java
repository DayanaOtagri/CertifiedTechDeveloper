package com.company;

public class Main {

    public static void main(String[] args) {
        UsuarioJuego usuario1 = new UsuarioJuego("simon", "12345");

        usuario1.aumentarPuntaje();
        usuario1.aumentarPuntaje();
        usuario1.aumentarPuntaje();

        usuario1.bonus(100);
        usuario1.bonus(-100);
    }
}
