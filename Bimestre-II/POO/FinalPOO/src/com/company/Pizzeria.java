package com.company;

import java.util.ArrayList;
import java.util.List;

public class Pizzeria {

    //Se crea Lista
    private List<Pizza> pizzas;

    //Se inicializa la lista
    public Pizzeria(){
        pizzas = new ArrayList<>();
    }

    //Método que agrega pizzas
    public void agregarPizza(String codigo){
        try {
            pizzas.add(PizzeriaFactory.getInstance().hacerPizza(codigo));
        } catch (PizzaException e) {
            System.out.println(e.getMessage());
        }
    }


    //Método que muestra las pizzas
    public void mostrarPizzas(){
        for (Pizza pizza : pizzas) {
            System.out.println(pizza);
        }
    }
}
