package com.company;

public class SocioHabilitado extends  Socio{
    private Double costoPileta;
    private Boolean estaHabilitado;

    public SocioHabilitado(String numero, String nombre, Double cuotaMensual, String actividad, Double costoPileta) {

        super(numero, nombre, cuotaMensual, actividad);
        this.costoPileta = costoPileta;
        this.estaHabilitado = false;
    }


    //Forma especifica de como lo hace el hijo


    @Override
    public Double calcularCostoMensual(){
        if(estaHabilitado){
            return super.calcularCostoMensual() + costoPileta;
        } else {
            return super.calcularCostoMensual();
        }
    }



    public void setEstaHabilitado(Boolean estaHabilitado) {
        this.estaHabilitado = estaHabilitado;
    }
}
