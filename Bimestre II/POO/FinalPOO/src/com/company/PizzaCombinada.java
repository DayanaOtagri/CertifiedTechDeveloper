package com.company;

// Se importan las clases List y ArrayList
import java.util.ArrayList;
import java.util.List;


public class PizzaCombinada extends Pizza {

    //Crea la lista
    private List<Pizza> pizzas;

    //Constructor de la clase que además Hereda de la clase abstract Pizza
    public PizzaCombinada(String nombre, String descripcion) {
        super(nombre, descripcion);

        // Inicializa la lista
        pizzas = new ArrayList<>();
    }

    //Permite agregar pizzas
    public void agregarPizza(Pizza pizza){
        pizzas.add(pizza);
    }


    //Implementa el método que hereda de la Clase Pizza (Contrato)
    @Override
    public Double calcularPrecio() {

        // Se crea un contador vacío
        double precioTotal = 0.0;

        //Por cada pizza en la lista de pizzas calcula el precio. Cada pizza sabe como calcular su precio
        for (Pizza pizza : pizzas) {
            precioTotal += pizza.calcularPrecio();
        }
        return  precioTotal / pizzas.size();
    }
}
