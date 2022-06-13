package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Equipo equipo1 = new Equipo("ElCampeón");

        equipo1.addJugador(new Jugador(10,"Samuel",true,false));
        equipo1.addJugador(new Jugador(9,"Sam",false,true));
    }
}
