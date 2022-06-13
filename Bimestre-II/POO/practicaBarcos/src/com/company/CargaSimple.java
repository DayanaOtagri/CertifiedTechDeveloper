package com.company;

public class CargaSimple extends Carga {

    //Atributos propios
    private Double pesoCargaSimple;
    private Boolean necesitaRefrigeracion;


    //Constructor, donde también implementa los de la clase padre

    public CargaSimple(String nombre, String descripcion, Double pesoCargaSimple, Boolean necesitaRefrigeracion) {
        super(nombre, descripcion);
        this.pesoCargaSimple = pesoCargaSimple;
        this.necesitaRefrigeracion = necesitaRefrigeracion;
    }

    // Implementa el método del padre
    @Override
    public Double calcularPeso() {
        if(necesitaRefrigeracion){
            pesoCargaSimple += pesoCargaSimple * 0.1;
        }
        return pesoCargaSimple;
    }
}
