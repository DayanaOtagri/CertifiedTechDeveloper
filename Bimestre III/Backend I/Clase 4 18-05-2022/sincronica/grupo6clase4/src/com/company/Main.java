package com.company;

public class Main {

    public static void main(String[] args) {
        Producto prod = new Producto("Cocacola", 1500, 1250, "sano");

        CompruebaCalidad comprobador = new CompruebaCalidad();

        comprobador.comprobarProducto(prod);

    }
}
