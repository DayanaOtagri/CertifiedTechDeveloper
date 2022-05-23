package com.company;

public class ServicioFactory {


    //Constantes

    public static final String AIRE_ACONDICIONADO = "AIREACONDICIONADO";
    public static final String COLOCACION = "COLOCACION";
    public static final String COMBOS_SERVICIOS = "COMBOSERVICIOS";


    //Atributo
    private static ServicioFactory instance;

    // Constructor privado
    private ServicioFactory(){
    }

    // Hace la instancia

    public static ServicioFactory getInstance() {
        if (instance == null){
            instance = new ServicioFactory();
        }
        return instance;
    }

    public Servicio generarServicio(String codigo)throws ServicioException{
        switch (codigo){
            case AIRE_ACONDICIONADO:
                return new ServicioSimple("AIREACONDICIONADO","excelente calidad",65000.0);
            case COLOCACION:
                return new ServicioSimple("COLOCACION","Tiene una cobro más", 10000.0);
            case COMBOS_SERVICIOS:
                ServicioCombo servicioCombos = new ServicioCombo("COMBOSERVICIOS","Buen combo",0.1);
                servicioCombos.agregarServicio(generarServicio(AIRE_ACONDICIONADO));
                servicioCombos.agregarServicio(generarServicio(COLOCACION));
                return servicioCombos;
        }
        throw new ServicioException(codigo + " no es un codigo valido");
    }

}
