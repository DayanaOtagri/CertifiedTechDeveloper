package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Socio socio1 = new Socio("1", "Tincho", 1000.0,"Invertir");
        Socio socio2 = new Socio("2", "Tincho", 1000.0,"Invertir");
        SocioHabilitado socioHabilitado1 = new SocioHabilitado("3","Fico",3000.0,"Financiador",500.0);


        System.out.println(socio1.equals(socio2));

        //System.out.println(socio1.calcularCostoMensual());
        // socioHabilitado1.setEstaHabilitado(true);
        //System.out.println(socioHabilitado1.calcularCostoMensual());
        //System.out.println(socio1);
        //System.out.println(socioHabilitado1);

    }



}
