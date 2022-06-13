package com.company;

public abstract class Titulo {
    private Integer cantidadMateria;
    private  String fechaInicio;
    private String fechaFin;
    private Boolean selloMinisterio;
    private Boolean selloInstitulo;
    private Persona persona;

    public Titulo (Integer cantidadMateria, String fechaInicio, String fechaFin, Boolean selloMinisterio, Boolean selloInstitulo, Persona persona) {
        this.cantidadMateria = cantidadMateria;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.selloMinisterio = selloMinisterio;
        this.selloInstitulo = selloInstitulo;
        this.persona = persona;
    }

    public Boolean ejercertitulo(){
        if (selloMinisterio && selloInstitulo) {
            System.out.println("Tiene ambos sellos");
            return true;
        } else {
            System.out.println("No tiene ambos sellos");
            return false;
        }
    }

    public Integer getCantidadMateria() {
        return cantidadMateria;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public Boolean getSelloMinisterio() {
        return selloMinisterio;
    }

    public Boolean getSelloInstitulo() {
        return selloInstitulo;
    }

    public Persona getPersona() {
        return persona;
    }
}
