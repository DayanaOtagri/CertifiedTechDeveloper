package com.company;

import java.util.Objects;

public class Jugador implements Comparable<Jugador> {

    private Integer numeroDeCamiseta;
    private String nombre;
    private Boolean estaLesionado;
    private Boolean esTitular;

    public Jugador(Integer numeroDeCamiseta, String nombre, Boolean estaLesionado, Boolean esTitular) {
        this.numeroDeCamiseta = numeroDeCamiseta;
        this.nombre = nombre;
        this.estaLesionado = estaLesionado;
        this.esTitular = esTitular;
    }


    @Override
    public int compareTo(Jugador jugador) {

        //    return this.numeroDeCamiseta.compareTo(jugador.numeroDeCamiseta);
        if(this.numeroDeCamiseta > jugador.numeroDeCamiseta){
            return 1;
        }
        if(this.numeroDeCamiseta < jugador.numeroDeCamiseta){
            return -1;
        }
        return 0;
    }

    public Boolean getEsTitular() {
        return esTitular;
    }

    public Boolean getEstaLesionado() {
        return estaLesionado;
    }

    @Override
    public String toString() {
        return "numero: " + numeroDeCamiseta + " nombre: " + nombre;
    }



    @Override
    public int hashCode() {
        return Objects.hash(numeroDeCamiseta, nombre);
    }
}
