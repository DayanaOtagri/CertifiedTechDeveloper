package com.company;

public class Jugador implements Comparable <Jugador>{
    private Integer nroCamiseta;
    private String nombre;
    private Boolean estaLesonado;
    private Boolean esTitular;

    public Jugador(Integer nroCamiseta, String nombre, Boolean estaLesonado, Boolean esTitular) {
        this.nroCamiseta = nroCamiseta;
        this.nombre = nombre;
        this.estaLesonado = estaLesonado;
        this.esTitular = esTitular;
    }

    @Override
    public int compareTo(Jugador Jugador) {

        return  this.nroCamiseta
       // if(this.nroCamiseta > Jugador.nroCamiseta){
        //    return 1;
        // }
        // if(this.nroCamiseta < Jugador.nroCamiseta){
           //  return -1;
        //}
        //return 0;
    }

    public static Boolean getEsTitular() {
        return getEsTitular();
    }

    @Override
    public String toString() {
        return "nroCamiseta=  " + nroCamiseta +
                ", nombre: '" + nombre;
    }
}
