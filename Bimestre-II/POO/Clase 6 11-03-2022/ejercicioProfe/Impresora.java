package com.company;

public class Impresora {

    private String modelo;
    private String tipoDeConexion;
    private String fechaDefabricacion;
    private Integer hojasDisponibles;


    public Impresora(String modelo, String tipoDeConexion, String fechaDefabricacion) {
        this.modelo = modelo;
        this.tipoDeConexion = tipoDeConexion;
        this.fechaDefabricacion = fechaDefabricacion;
        this.hojasDisponibles = 0;
    }

    public Impresora(String modelo, String tipoDeConexion) {
        this.modelo = modelo;
        this.tipoDeConexion = tipoDeConexion;
        this.fechaDefabricacion = "1/1/2000";
        this.hojasDisponibles = 0;
    }

    private Boolean tienePapel(){
//        if(this.hojasDisponibles > 0){
//            return true;
//        }else{
//            return false;
//        }
        return this.hojasDisponibles > 0;
    }

    public void imprimir(String texto) {

        if(tienePapel()){
            System.out.println(texto);
            hojasDisponibles--;
        }else{
            System.out.println("no hay hojas disponibles");
        }
    }

    public void setHojasDisponibles(Integer hojasDisponibles) {
        this.hojasDisponibles = hojasDisponibles;
    }
}
