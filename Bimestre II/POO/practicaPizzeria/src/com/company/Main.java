package com.company;

public class Main {

    public static void main(String[] args) {

        Pizzeria pizzeria = new Pizzeria();

        pizzeria.agregarPizza(PizzeriaFactory.PIZZA_MUZZARELLA);
        pizzeria.agregarPizza(PizzeriaFactory.PIZZA_ESPECIAL);
        pizzeria.agregarPizza(PizzeriaFactory.PIZZA_ANANA);

        pizzeria.agregarPizza(PizzeriaFactory.COMBINADA_LOCA);
        pizzeria.agregarPizza("PIZZAMEXICANA");

        //otras pruebas
        // pizzeria.agregarPizza((PizzeriaFactory.PEPPERONI));
        //pizzeria.agregarPizza(PizzeriaFactory.NAPOLITANA);
        //pizzeria.agregarPizza(PizzeriaFactory.COMBINADA_ITALIANA);
        //pizzeria.agregarPizza("PIZZACOLOMBIANA");

        pizzeria.mostrarPizzas();
    }
}
