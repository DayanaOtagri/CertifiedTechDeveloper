package com.company;

public class ServicioDescarga implements IServicioDescarga{

    public ServicioDescarga() {
    }

    @Override
    public void descargar(String tipo) {
        System.out.println("Eres "+ tipo +". Se esta descargando la cancion...");
        System.out.println("*------------------");
        System.out.println("*******------------");
        System.out.println("*************------");
        System.out.println("*****************--");
        System.out.println("*******************");

        System.out.println("Cancion descargada!");
    }
}
