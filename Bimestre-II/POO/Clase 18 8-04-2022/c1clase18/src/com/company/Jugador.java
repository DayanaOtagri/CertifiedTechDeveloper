package com.company;

public class Jugador {

    private String apellido;
    private String posicion;
    private Integer numeroDeCamiseta;

    public Jugador(String apellido, String posicion, Integer numeroDeCamiseta) {
        this.apellido = apellido;
        this.posicion = posicion;
        this.numeroDeCamiseta = numeroDeCamiseta;
    }

    public String getPosicion() {
        return posicion;
    }

    @Override
    public String toString() {
        return numeroDeCamiseta + " " + apellido;
    }
}
