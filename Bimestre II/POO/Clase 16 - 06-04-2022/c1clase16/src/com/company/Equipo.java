package com.company;

import java.util.ArrayList;
import java.util.List;

public class Equipo {

    private String nombre;
    private List<Jugador> jugadores;


    public Equipo(String nombre){
        this.nombre = nombre;
        jugadores = new ArrayList<>();
    }

    public void agregarJugador(Jugador jugador){
        jugadores.add(jugador);
    }

    public void mostrarJugadoresTitulares(){
        jugadores.sort(null);
        for (Jugador jugador: jugadores) {
            if(jugador.getEsTitular()){
                System.out.println(jugador);
            }
        }
    }

    public Integer getCantidadTitularesLesionados(){
        Integer contadorLesionados = 0;
        for (Jugador jugador : jugadores) {
            if(jugador.getEsTitular() && jugador.getEstaLesionado()){
                contadorLesionados++;
            }
        }
        return contadorLesionados;
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }
}
