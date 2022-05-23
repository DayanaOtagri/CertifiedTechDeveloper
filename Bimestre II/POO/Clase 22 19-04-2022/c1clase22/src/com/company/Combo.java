package com.company;

import java.util.ArrayList;
import java.util.List;

public class Combo implements Comprable {

    private List<Comprable> productos;
    private Double descuento;


    public Combo(Double descuento) {
        this.descuento = descuento;
        productos = new ArrayList<>();
    }

    public void agregarProducto(Comprable comprable){
        productos.add(comprable);
    }

    @Override
    public Double informarPrecio() {
        Double sumaPrecios = 0.0;
        System.out.println("encontre un combo");
        for (Comprable producto : productos) {
            sumaPrecios += producto.informarPrecio();
        }
        Double precioFinal = sumaPrecios - (sumaPrecios*descuento);
        System.out.println(" el precio del combo con descuento es " + precioFinal);

        return precioFinal;
    }
}
