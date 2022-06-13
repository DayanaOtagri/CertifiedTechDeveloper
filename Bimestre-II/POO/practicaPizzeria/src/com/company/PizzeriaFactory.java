package com.company;

public class PizzeriaFactory {

    public static final String PIZZA_MUZZARELLA = "PIZZAMUZARELLA";
    public static final String COMBINADA_LOCA = "COMBINADALOCA";
    public static final String PIZZA_ESPECIAL = "PIZZAESPECIAL";
    public static final String PIZZA_ANANA = "PIZZA-ANANA";
    public static final String PEPPERONI = "PEPPERONI";
    public static final String NAPOLITANA = "NAPOLITANA";
    public static final String COMBINADA_ITALIANA = "COMBINADAITALIANA";


    private static PizzeriaFactory instance;

    private PizzeriaFactory() {

    }

    public static PizzeriaFactory getInstance() {
        if (instance == null) {
            instance = new PizzeriaFactory();
        }
        return instance;
    }

    public Pizza hacerPizza(String codigo) throws PizzaException {
        switch (codigo){
            case PIZZA_MUZZARELLA:
                return new PizzaSimple("muzzrella","Delicioso queso",700.0,false);
            case PIZZA_ESPECIAL:
                return new PizzaSimple("especial","Deliciosa",850.0, false);

            case PIZZA_ANANA:
                return new PizzaSimple("ananá","Muy deliciosa",950.0, false);

            case COMBINADA_LOCA:
                PizzaCombinada pizzaCombinada = new PizzaCombinada("CombinadaLoca", "Tiene mitad especial, mitad ananá");
                pizzaCombinada.agregarPizza(hacerPizza(PIZZA_ESPECIAL));
                pizzaCombinada.agregarPizza(hacerPizza(PIZZA_ANANA));
                return pizzaCombinada;


            // Probando otros tipos de pizza

            /*
            case PEPPERONI:
                return new PizzaSimple("PEPPERONI","Deliciosa pizza de pepperoni", 1000.0, true);
            case NAPOLITANA:
                return new PizzaSimple("NAPOLITANA","Deliciosa pizza de napolitana", 3000.0, false);
            case COMBINADA_ITALIANA:
                PizzaCombinada comboItalia = new PizzaCombinada("COMBINADAITALINA","Teiene PEPPERONI Y NAPOLITANA");
                comboItalia.agregarPizza(hacerPizza(PEPPERONI));
                comboItalia.agregarPizza(hacerPizza(NAPOLITANA));
                return  comboItalia;*/
    }
            throw new PizzaException(codigo + "  no es un código valido");
}
}