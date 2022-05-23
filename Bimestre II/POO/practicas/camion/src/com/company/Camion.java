package com.company;

public class Camion {
    private String marca;
    private String patente;
    static private Double valorCombustible;

    public Camion(String marca, String patente){
        this.marca = marca;
        this.patente = patente;
    }

    public Double gastoCombustible(Integer litros){
        return litros*Camion.valorCombustible;
    }

    static public void cambiarPrecioCombustible(Double precio){
        Camion.valorCombustible = precio;
    }
}
