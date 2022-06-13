package com.company;

import java.util.ArrayList;
import java.util.List;

public class Carrito {

    private List<Comprable> productos;

    public Carrito() {
        productos = new ArrayList<>();
    }

    public void agregarProducto(Comprable comprable){
        productos.add(comprable);
    }

    public Double calcularPrecioCarrito(){
        Double precioTotal = 0.0;
        for (Comprable producto : productos) {
            precioTotal += producto.informarPrecio();
        }
        return precioTotal;
    }
}
