package com.company;

public class UsuarioJuego {

    // Atributos
    private String nombre;
    private String clave;
    private Double puntaje;
    private Integer nivel;

    // Constructor
    public UsuarioJuego (String nombre, String clave){
        this.nombre = nombre;
        this.clave = clave;
        puntaje = 0.0;
        nivel = 0;
    }

    // Métodos

    public void aumentarPuntaje(){
        this.puntaje += 1;
    }
    public void subirNivel(){
        this.nivel += 1;
    }
    public void bonus(Integer valor){
        this.puntaje += valor;
    }

    // Getters
    public String getNombre(){
        return this.nombre;
    }
    public String getClave(){
        return this.clave;
    }
    public Double getPuntaje(){
        return this.puntaje;
    }
    public Integer getNivel(){
        return this.nivel;
    }

    // Setters
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setClave(String clave){
        this.clave = clave;
    }
    public void setPuntaje(Double puntaje){
        this.puntaje = puntaje;
    }
    public void setNivel(Integer nivel){
        this.nivel = nivel;
    }
}
