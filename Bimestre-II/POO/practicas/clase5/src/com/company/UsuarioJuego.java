package com.company;

public class UsuarioJuego {
    private String nombre;
    private String clave;
    private Double puntaje;
    private int nivel;

    //Constructor
    public UsuarioJuego(String nombre, String clave) {
        this.nombre = nombre;
        this.clave = clave;
        this.puntaje = 0.0;
        this.nivel = 0;
    }

    //Métodos
    public void aumentarPuntaje(){
        puntaje += 2;
    }
    public void subirNivel(){
        nivel +=2;
    }
    public void bonus(int valor){
        this.puntaje += valor;
    }

    //Getters
     public String getNombre(){
        return this.nombre;
     }

     public String getClave(){
        return this.clave;
     }

     public Double getPuntaje(){
        return this.puntaje;
     }

     public int getNivel(){
        return this.nivel;
     }

     //Setters

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setClave(String clave){
        this.clave = clave;
    }

    public void setPuntaje(Double puntaje){
        this.puntaje = puntaje;
    }

    public void setNivel(int nivel){
        this.nivel = nivel;
    }

}
