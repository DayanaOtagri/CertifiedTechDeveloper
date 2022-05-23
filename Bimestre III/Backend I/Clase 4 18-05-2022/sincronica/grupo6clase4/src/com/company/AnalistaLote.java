package com.company;

public class AnalistaLote extends AnalistaDeProducto{
    @Override
    public void comprobarProducto(Producto prod) {
        if (prod.getLote() >= 1000 || prod.getLote() <= 2000){
            System.out.println("El producto paso analisis de Lote. Derivado a " + getSigAnalista().getClass().getSimpleName());
            getSigAnalista().comprobarProducto(prod);
        } else System.out.println("producto rechazado en Lote");
    }
}
