package com.company;

public class CargaFactory {

    // Constantes
    public static final String TV_32 = "TV32";
    public static final String TV_32_LSD = "TV32LSD";
    public static final String CAJA_MEDICAMENTOS = "CAJAMEDICAMENTOS";
    public static final String CONTENEDOR = "CONTENEDOR";


    //Atributo privado
    private static CargaFactory instance;


    //Constructor privado
    private CargaFactory(){
    }

    //Hacer la instancia


    public static CargaFactory getInstance() {
        //Si la isntancia esta vacía la genera
        if (instance == null ){
            instance = new CargaFactory();
        }
        //si no esta vacía la retorna
        return instance;
    }

    //Hace las cargas
    public Carga generarCarga(String codigo) throws CargaException {
        switch (codigo){
            case TV_32_LSD:
<<<<<<< HEAD
                return new CargaSimple("TV32LSD","Tv de 32 Pulgadas LSD",30.0,false);
=======
                return new CargaSimple("TV32LSD","Tv de 32 Pulgadas LSD",3.0,false);
>>>>>>> d05196c4 (Subiendo)
            case CAJA_MEDICAMENTOS:
                return new CargaSimple("CAJAMEDICAMENTOS","Medicamentos para la gripe",2.0,true);
            case CONTENEDOR:
                Contenedor contenedor1 = new Contenedor("CONTENEDOR","Contiene un televisor 32'P LSD y medicamentos",100.0);
                contenedor1.agregarCarga(generarCarga(TV_32_LSD));
                contenedor1.agregarCarga(generarCarga(CAJA_MEDICAMENTOS));
                return contenedor1;
        }
        throw  new CargaException(codigo + " no es un codigo valido");
    }
}
