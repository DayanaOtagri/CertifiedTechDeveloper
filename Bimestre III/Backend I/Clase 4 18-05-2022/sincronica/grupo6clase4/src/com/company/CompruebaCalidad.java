package com.company;

public class CompruebaCalidad extends AnalistaDeProducto{

    AnalistaDeProducto inicial;

    public CompruebaCalidad() {
        this.inicial = new AnalistaLote();
        AnalistaPeso peso = new AnalistaPeso();
        AnalistaEnvase envase = new AnalistaEnvase();

        inicial.setSigAnalista(peso);
        peso.setSigAnalista(envase);
    }

    @Override
    public void comprobarProducto(Producto prod) {
        inicial.comprobarProducto(prod);
    }
}
