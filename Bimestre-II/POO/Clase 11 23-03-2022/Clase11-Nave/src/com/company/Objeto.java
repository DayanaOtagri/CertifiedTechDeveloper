package com.company;

public class Objeto {
    private Integer posX;
    private Integer posY;
    private String direccion;
}

    public Objeto (Integer posX, Integer posY, String direccion){
        this.posX = posX;
        this.posY = posY;
        this.direccion = direccion;
    }

    public String irA (Integer posX, Integer posY, String direccion){
    return "Posicion x = " posX + "Posicion y" + posY
    }