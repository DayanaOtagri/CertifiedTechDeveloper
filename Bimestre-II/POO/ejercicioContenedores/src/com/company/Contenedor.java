package com.company;

public class Contenedor  implements  Comparable <Contenedor> {

    private Integer numeroId;
    private String paisProcedencia;
    private Boolean materialPeligroso;

    public Contenedor(Integer numeroId, String paisProcedencia, Boolean materialPeligroso) {
        this.numeroId = numeroId;
        this.paisProcedencia = paisProcedencia;
        this.materialPeligroso = materialPeligroso;
    }

    @Override

}
