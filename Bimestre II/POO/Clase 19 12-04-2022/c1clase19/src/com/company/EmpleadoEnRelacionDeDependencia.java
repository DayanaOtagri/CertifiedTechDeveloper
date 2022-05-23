package com.company;

public class EmpleadoEnRelacionDeDependencia extends Empleado {

    private Double sueldoMensual;

    public EmpleadoEnRelacionDeDependencia(String nombre, String apellido, Integer legajo, Double sueldoMensual) {
        super(nombre, apellido, legajo);
        this.sueldoMensual = sueldoMensual;

    }

    @Override
    public Double calcularSueldo(Integer dias) {

        return sueldoMensual * dias / 30.0;



    }
}
