package com.dh.ventas;

public abstract class Vendedor {
    protected String nombre;
    protected  Integer ventas;
    protected  Integer puntosPorVenta;

    public void vender(Integer cantidadVentas){
        this.ventas += cantidadVentas;
    }

    public abstract  Integer calcularPuntos();

    public String mostranCategoria(){
        Integer puntosDelVendedor = calcularPuntos();
        return this.nombre + " tiene un total de: " + puntosDelVendedor + " El cual se catergoriza como: "getNombreCategoria();
    }

    public String getNombreCategoria(){
        return "";
    }





}
