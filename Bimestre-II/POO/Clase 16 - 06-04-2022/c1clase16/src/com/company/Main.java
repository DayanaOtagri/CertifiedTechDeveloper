package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Equipo equipo = new Equipo("Saca Chispas");

        equipo.agregarJugador(new Jugador(30,"Messi",false,true));
        equipo.agregarJugador(new Jugador(1,"Dibu",false,true));
        equipo.agregarJugador(new Jugador(10,"Schweinsteiger",false,false));
        equipo.agregarJugador(new Jugador(5,"Masche",true,true));
        equipo.agregarJugador(new Jugador(8,"Di Maria",true,true));

        equipo.mostrarJugadoresTitulares();

        System.out.println(equipo.getCantidadTitularesLesionados());



    }
}
