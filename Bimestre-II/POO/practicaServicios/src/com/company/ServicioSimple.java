package com.company;

public class ServicioSimple extends Servicio {

    //Atributo propio de la clase
    private Double precio;

    //Constructor con atributos del padre y el propio
    public ServicioSimple(String nombre, String descripcion, Double precio) {
        super(nombre, descripcion);
        this.precio = precio;
    }

    // Método heredado del padre (Contrato)
    @Override
    public Double calcularPrecio() {
        if (getNombre() == "COLOCACION") {
            precio +=  precio * 0.1;
        }
        return precio;
    }
}