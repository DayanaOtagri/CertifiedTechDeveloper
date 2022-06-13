package com.company;

import java.util.ArrayList;
import java.util.List;

public class Carrito {
    private estadoCarrito estado;
    private List<Producto> listaProductos;


    public Carrito(estadoCarrito estado, List<Producto> listaProductos) {
        this.estado = new Vacio();
        this.listaProductos = new ArrayList<>();
    }
}
