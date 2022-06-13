package com.company;

import java.util.ArrayList;
import java.util.List;

public class Pizzeria {

    private List<Pizza> pizzas;

    public Pizzeria(){
        pizzas = new ArrayList<>();
    }

    public void agregarPizza(String codigo){
        try {
            pizzas.add(PizzeriaFactory.getInstance().hacerPizza(codigo));
        } catch (PizzaException e) {
            System.out.println(e.getMessage());
        }
    }

    public void mostrarPizzas(){
        for (Pizza pizza : pizzas) {
            System.out.println(pizza);
        }
    }
}
