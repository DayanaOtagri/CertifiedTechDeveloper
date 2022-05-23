package com.company;

public abstract class AnalistaDeProducto {
    protected AnalistaDeProducto sigAnalista;

    public AnalistaDeProducto getSigAnalista() {
        return sigAnalista;
    }

    public void setSigAnalista(AnalistaDeProducto sigAnalista) {
        this.sigAnalista = sigAnalista;
    }

    public abstract void comprobarProducto(Producto prod);
}
