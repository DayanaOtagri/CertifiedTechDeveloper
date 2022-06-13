package com.company;

import java.util.Objects;

public class Socio {
    private String numero;
    private String nombre;
    private Double cuotaMensual;
    private String actividad;

    public Socio(String numero, String nombre, Double cuotaMensual, String actividad){
        this.numero = numero;
        this.nombre = nombre;
        this.cuotaMensual = cuotaMensual;
        this.actividad = actividad;
    }

    public Double calcularCostoMensual(){
        return cuotaMensual;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " actividad " + actividad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Socio socio = (Socio) o;
        return Objects.equals(numero, socio.numero);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numero);
    }
}

