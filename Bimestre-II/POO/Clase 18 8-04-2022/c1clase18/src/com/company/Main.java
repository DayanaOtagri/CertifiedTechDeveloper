package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Equipo equipo = new Equipo("Isotpos de Springfield");

        equipo.agregarJugador(new Jugador("Martinez","ARQUERO",1));
        equipo.agregarJugador(new Jugador("Silva","DEFENSOR",1));
        equipo.agregarJugador(new Jugador("Rojo","DEFENSOR",1));
        equipo.agregarJugador(new Jugador("Mbappe","MEDIOCAMPISTA",1));
        equipo.agregarJugador(new Jugador("Messi","DELANTERO",1));
        equipo.agregarJugador(new Jugador("Silva","DEFENSOR",1));
        equipo.agregarJugador(new Jugador("Rojo","DEFENSOR",1));
        equipo.agregarJugador(new Jugador("Mbappe","MEDIOCAMPISTA",1));
        equipo.agregarJugador(new Jugador("Messi","DELANTERO",1));
        equipo.agregarJugador(new Jugador("Silva","DEFENSOR",1));
        equipo.agregarJugador(new Jugador("Rojo","DEFENSOR",1));
        equipo.agregarJugador(new Jugador("Mbappe","MEDIOCAMPISTA",1));
        equipo.agregarJugador(new Jugador("Messi","DELANTERO",1));
        equipo.agregarJugador(new Jugador("Silva","DEFENSOR",1));
        equipo.agregarJugador(new Jugador("Rojo","DEFENSOR",1));
        equipo.agregarJugador(new Jugador("Mbappe","MEDIOCAMPISTA",1));
        equipo.agregarJugador(new Jugador("Messi","DELANTERO",1));
        equipo.agregarJugador(new Jugador("Messi","DELANTERO",1));
        equipo.agregarJugador(new Jugador("Silva","DEFENSOR",1));
        equipo.agregarJugador(new Jugador("Rojo","DEFENSOR",1));
        equipo.agregarJugador(new Jugador("Mbappe","MEDIOCAMPISTA",1));
        equipo.agregarJugador(new Jugador("Messi","DELANTERO",1));



        try {
            System.out.println(equipo.cantidadJugadores("DEFENSOR"));
        } catch (EquipoException e) {
            e.printStackTrace();
        }

        System.out.println(equipo.obtenerReservas());
    }
}
