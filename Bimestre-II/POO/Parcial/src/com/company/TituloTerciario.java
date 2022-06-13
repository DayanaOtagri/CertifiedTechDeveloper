package com.company;

public class TituloTerciario extends Titulo{
    private Boolean validacionNacional;
    private Boolean validacionProvincial;

    public TituloTerciario(Integer cantidadMateria, String fechaInicio, String fechaFin, Boolean selloMinisterio, Boolean selloInstitulo, Persona persona, Boolean validacionNacional, Boolean validacionProvincial) {
        super(cantidadMateria, fechaInicio, fechaFin, selloMinisterio, selloInstitulo, persona);
        this.validacionNacional = validacionNacional;
        this.validacionProvincial = validacionProvincial;
    }

    public boolean validoNacional(){
        if (validacionNacional){
            System.out.println("Es valido a nivel nacional");
            return true;
        } else {
            System.out.println("No es valido a nivel nacional");
            return false;
        }
    }

    @Override
    public String toString() {
        return "TituloTerciario:" + getPersona() + "fecha inicio, " + getFechaInicio();

    }
}
