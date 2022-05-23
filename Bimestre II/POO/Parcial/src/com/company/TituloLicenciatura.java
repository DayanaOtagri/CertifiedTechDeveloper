package com.company;

public class TituloLicenciatura extends Titulo implements Comparable{
    private String temaTesis;
    private String fechaEntrega;
    private Integer cantidadInvestigaciones;

    public TituloLicenciatura(Integer cantidadMateria, String fechaInicio, String fechaFin, Boolean selloMinisterio, Boolean selloInstitulo, Persona persona, String temaTesis, String fechaEntrega, Integer cantidadInvestigaciones) {
        super(cantidadMateria, fechaInicio, fechaFin, selloMinisterio, selloInstitulo, persona);
        this.temaTesis = temaTesis;
        this.fechaEntrega = fechaEntrega;
        this.cantidadInvestigaciones = cantidadInvestigaciones;
    }



    @Override
    public String toString() {
        return "Otorga TITULO A : " + getPersona()
                + "TituloLicenciatura{" +
                "temaTesis='" + temaTesis + '\'' +
                ", fechaEntrega='" + fechaEntrega + '\'' +
                ", cantidadInvestigaciones=" + cantidadInvestigaciones +
                '}';
    }

    @Override
    public int compareTo(Object o) {

        return 0;
    }
}
