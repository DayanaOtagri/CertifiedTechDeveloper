package com.company;

public class PizzeriaFactory {

    //CONSTANTES - CODIGOS
    public static final String PIZZA_MUZZARELLA = "PIZZAMUZARELLA";
    public static final String COMBINADA_LOCA = "COMBINADALOCA";
    public static final String PIZZA_ESPECIAL = "PIZZAESPECIAL";
    public static final String PIZZA_ANANA = "PIZZA-ANANA";
    //Otras pizzas
    public static final String PEPPERONI = "PEPPERONI";
    public static final String NAPOLITANA = "NAPOLITANA";
    public static final String COMBINADA_ITALIANA = "COMBINADAITALIANA";

    // Atributo
    private static PizzeriaFactory instance;


    // Contructor privado
    private PizzeriaFactory() {

    }


    // Si no tiene la instancia creada la crea y si la tiene la retorna
    public static PizzeriaFactory getInstance() {
        if (instance == null) {
            instance = new PizzeriaFactory();
        }
        return instance;
    }

    //Fabrica de pizzas que se le pasa una PizzaException que era de Excepcion y permite pasar un mensaje
    public Pizza hacerPizza(String codigo) throws PizzaException {
        switch (codigo){
            case PIZZA_MUZZARELLA:
                //Se crea una pizza simple de tipo MUZZARELA
                return new PizzaSimple("muzzrella","Delicioso queso",700.0,false);
            case PIZZA_ESPECIAL:
                //Se crea una pizza simple de tipo ESPECIAL
                return new PizzaSimple("especial","Deliciosa",850.0, false);

            case PIZZA_ANANA:
                //Se crea una pizza simple de tipo ANANA
                return new PizzaSimple("ananá","Muy deliciosa",950.0, false);

            case COMBINADA_LOCA:
                //Se crea una pizza combiana
                PizzaCombinada pizzaCombinada = new PizzaCombinada("CombinadaLoca", "Tiene mitad especial, mitad ananá");
                //Se agregan las dos pizzas que la conforman
                pizzaCombinada.agregarPizza(hacerPizza(PIZZA_ESPECIAL));
                pizzaCombinada.agregarPizza(hacerPizza(PIZZA_ANANA));
                return pizzaCombinada;


            // Probando otros tipos de pizza


            case PEPPERONI:
                return new PizzaSimple("PEPPERONI","Deliciosa pizza de pepperoni", 1000.0, true);
            case NAPOLITANA:
                return new PizzaSimple("NAPOLITANA","Deliciosa pizza de napolitana", 3000.0, false);
            case COMBINADA_ITALIANA:
                PizzaCombinada comboItalia = new PizzaCombinada("COMBINADAITALINA","Tiene PEPPERONI Y NAPOLITANA");
                comboItalia.agregarPizza(hacerPizza(PEPPERONI));
                comboItalia.agregarPizza(hacerPizza(NAPOLITANA));
                return  comboItalia;
        }
        //Mensaje de la PizzaException
        throw new PizzaException(codigo + "  no es un código valido");
    }
}