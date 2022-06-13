package com.company;

import java.util.ArrayList;
import java.util.List;

public class Equipo {
    private String nombre;
    //Lista es el padre, el protocolo de comportamiento(Contrato)
    private List<Jugador> ListaJugadores;


// Constructor de la Clase - Constructor of Class
    public Equipo(String nombre){
        this.nombre = nombre;
        // ArrayList es la hija - para inicializar la Lista
        ListaJugadores = new ArrayList<>();
    }
// Función para agregar un jugador a la Lista - Add "Player" function in the list
    public void addJugador(Jugador jugador){
        ListaJugadores.add(jugador);
    }

    public void mostrarTitulares(){
        ListaJugadores.sort(null); //Confia en mi, los jugadores ya saben ordenarse con un CompareTo que esta en Jugadro
        for (Jugador jugador : ListaJugadores) {
            if(Jugador.getEsTitular()) {
                System.out.println(jugador);

            }
        }
    }

    public Integer getTitularesLesionades(){
        Integer contadorLesionados = 0;
        for(Jugador jugador : ListaJugadores);
    }
}