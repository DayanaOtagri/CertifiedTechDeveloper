package com.company;

public class Perro {
    //Atributos
    private String nombre;
    private String raza;
    private Integer anioNacimiento;
    private Double peso;
    private Boolean chip;
    private Boolean lastimado;

    // Constructor

    public Perro(String nombre, String raza, Integer anioNacimiento, Double peso, Boolean chip, Boolean lastimado) {
        this.nombre = nombre;
        this.raza = raza;
        this.anioNacimiento = anioNacimiento;
        this.peso = peso;
        this.chip = chip;
        this.lastimado = lastimado;
    }

    // metodos

    public Integer calcularEdad(Integer fechaActual) {
        return fechaActual - this.anioNacimiento;
    }

    public Boolean sePuedePerder() {
        return this.chip == !true;
    }

    public Boolean darEnAdopcion() {
        return this.lastimado == false && this.peso > 5.0;
    }

    // getters


    public String getNombre() {
        return nombre;
    }

    public String getRaza() {
        return raza;
    }

    public Boolean getChip(){
        return chip;
    }

    public Integer getAnioNacimiento(){
        return anioNacimiento;
    }

    public Double getPeso(){
        return peso;
    }

    public Boolean getLastimado(){
        return lastimado;
    }
    }


    //Setter




