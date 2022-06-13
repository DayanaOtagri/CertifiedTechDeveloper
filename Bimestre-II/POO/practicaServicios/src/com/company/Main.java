package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Empresa empresa = new Empresa();


        empresa.agregarServicio(ServicioFactory.AIRE_ACONDICIONADO);
        empresa.agregarServicio(ServicioFactory.COLOCACION);
        empresa.agregarServicio(ServicioFactory.COMBOS_SERVICIOS);

        empresa.agregarServicio("WIFI");

        empresa.mostrarServicios();

    }
}
