package com.dh.liquidacionsueldo.main.model;

public class EmpleadoEfectivo extends Empleado{

    private double sueldoBase;
    private double descuentos;
    private double premios;

    // Constructor

    public EmpleadoEfectivo(String nombre, String apellido, String numeroDeCuenta, double sueldoBase, double descuentos, double premios) {
        super(nombre, apellido, numeroDeCuenta);
        this.sueldoBase = sueldoBase;
        this.descuentos = descuentos;
        this.premios = premios;
    }


    // Getters


    public double getSueldoBase() {
        return sueldoBase;
    }

    public double getDescuentos() {
        return descuentos;
    }

    public double getPremios() {
        return premios;
    }
}
