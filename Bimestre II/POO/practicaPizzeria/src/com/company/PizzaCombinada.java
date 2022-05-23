package com.company;

import java.util.ArrayList;
import java.util.List;

public class PizzaCombinada extends Pizza {

    private List<Pizza> pizzas;

    public PizzaCombinada(String nombre, String descripcion) {
        super(nombre, descripcion);

        pizzas = new ArrayList<>();
    }

    public void agregarPizza(Pizza pizza){
        pizzas.add(pizza);
    }


    @Override
    public Double calcularPrecio() {
        double precioTotal = 0.0;

        for (Pizza pizza : pizzas) {
            precioTotal += pizza.calcularPrecio();
        }
        return  precioTotal / pizzas.size();
    }
}
