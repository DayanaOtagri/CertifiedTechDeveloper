package com.company;

public class AnalistaEnvase extends AnalistaDeProducto{
    @Override
    public void comprobarProducto(Producto prod) {
        if (prod.getEnvasado().equalsIgnoreCase("sano") || prod.getEnvasado().equalsIgnoreCase("casi sano")){
            System.out.println("El producto paso analisis de Envase");
            System.out.println("El producto fue aceptado!!");
        } else System.out.println("producto rechazado en Envase");
    }
}
