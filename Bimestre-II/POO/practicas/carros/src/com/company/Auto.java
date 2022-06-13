package com.company;

public class Auto {
    private String patente;
    private String marca;
    private String modelo;
    private Motor motor;

    public Auto(String patente, String marca, String modelo){
        this.patente =patente;
        this.marca = marca;
        this.modelo = modelo;
        motor = new Motor("2021");
    }

    public String getPatente(){
        return patente;
    }
}
