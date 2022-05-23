package com.company;

public class AnalistaPeso extends AnalistaDeProducto{
    @Override
    public void comprobarProducto(Producto prod) {
        if (prod.getPeso() >= 1200 || prod.getPeso() <= 1300){
            System.out.println("El producto paso analisis de Peso. Derivado a " + getSigAnalista().getClass().getSimpleName());
            getSigAnalista().comprobarProducto(prod);
        } else System.out.println("producto rechazado en Peso");
    }
}
