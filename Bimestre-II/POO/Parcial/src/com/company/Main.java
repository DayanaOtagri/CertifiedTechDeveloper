package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Persona persona1 = new Persona("Abril","Sanchez",132213);
        TituloLicenciatura titulo = new TituloLicenciatura(5,"24-05-2030","23-05-2040",true,true,persona1,"sdfsdafsd","faddsfs",7);
        TituloTerciario titulo2 = new TituloTerciario(4,"22-2-2222","55-454-34",false,true,persona1,false,true);

       //  System.out.println(titulo2);
       // System.out.println(titulo2.validoNacional());
       // System.out.println(titulo.ejercertitulo());
        //System.out.println(titulo2.ejercertitulo());
    }

}
