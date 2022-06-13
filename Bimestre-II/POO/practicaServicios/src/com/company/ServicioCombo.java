package com.company;

// Se importan las clases List y ArrayList
import java.util.ArrayList;
import java.util.List;

public class ServicioCombo extends Servicio{

    // Atributo y lista de servicios
    private Double descuento;
    private List<Servicio> servicios;

    //Constructor y se inicializa la lista
    public ServicioCombo(String nombre, String descripcion, Double descuento) {
        super(nombre, descripcion);
        this.descuento = descuento;
        servicios = new ArrayList<>();

    }

    //Método que permite agregar un servicio al array
    public void agregarServicio(Servicio servicio){
        servicios.add(servicio);
    }

    //Método que hereda (Contrato)
    @Override
    public Double calcularPrecio() {

        //Se inicializa un contador en cero
        Double precioTotal = 0.0;


        // Itera por la lista de servicios y cada uno sabe calcular su precio
        for (Servicio servicio : servicios) {
            precioTotal += servicio.calcularPrecio();
        }
        return precioTotal - (precioTotal * descuento);
    }
}
