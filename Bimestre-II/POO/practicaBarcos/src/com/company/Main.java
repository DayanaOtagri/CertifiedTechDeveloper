package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Barco barco = new Barco();

        barco.agregarCarga(CargaFactory.TV_32_LSD);
        barco.agregarCarga(CargaFactory.CAJA_MEDICAMENTOS);
        barco.agregarCarga(CargaFactory.CONTENEDOR);

        barco.agregarCarga("CELULAR");

        barco.mostrarCarga();

    }
}
