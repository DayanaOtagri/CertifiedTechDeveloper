package com.company;

import java.util.ArrayList;
import java.util.List;

public class Equipo {

    private String nombre;
    private List<Jugador> plantel;

    public Equipo(String nombre) {
        this.nombre = nombre;
        plantel = new ArrayList<>();
    }

    public void agregarJugador(Jugador jugador){
        plantel.add(jugador);
    }

    public Integer cantidadJugadores(String posicion) throws EquipoException{

        if(!getPosicionesValidas().contains(posicion)){
            throw new EquipoException(posicion + " no es una posicion valida");
        }

        Integer cantidadEnPosicion = 0;

        for (Jugador jugador : plantel) {
            if(jugador.getPosicion().equals(posicion)){
                cantidadEnPosicion++;
            }
        }

        return cantidadEnPosicion;


    }


    public List<Jugador> obtenerReservas(){
        List<Jugador> jugadoresDeReserva = new ArrayList<>();

        for (int i = 18; i < plantel.size(); i++) {
            jugadoresDeReserva.add(plantel.get(i));
        }

        return jugadoresDeReserva;

    }

    private List<String> getPosicionesValidas(){
        List<String> posicionesValidas = new ArrayList<>();
        posicionesValidas.add("ARQUERO");
        posicionesValidas.add("MEDIOCAMPISTA");
        posicionesValidas.add("DEFENSOR");
        posicionesValidas.add("DELANTERO");
        return posicionesValidas;
    }




}
