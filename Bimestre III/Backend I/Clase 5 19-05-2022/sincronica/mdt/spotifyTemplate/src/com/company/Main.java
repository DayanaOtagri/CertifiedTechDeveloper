package com.company;

public class Main {

    public static void main(String[] args) {
        Usuario user1 = new Usuario(1, "Free");
        Usuario user2 = new Usuario(1, "Premium");

        IServicioDescarga proxy = new ServicioDescargaProxy();

        proxy.descargar(user1.getTipo());
        proxy.descargar(user2.getTipo());
    }
}
