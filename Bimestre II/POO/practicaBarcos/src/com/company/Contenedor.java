package com.company;

// Importa la clase List y ArrayList
import java.util.ArrayList;
import java.util.List;

public class Contenedor extends Carga {

    private Double pesoContenedor;
    // crea la lista
    private List<Carga> cargas;

    //Constructor
    public Contenedor(String nombre, String descripcion, Double pesoContenedor) {
        super(nombre, descripcion);
        this.pesoContenedor = pesoContenedor;
        //Inicializa la lista
        cargas = new ArrayList<>();
    }

    //Método que agrega cargas a la lista de cargas
    public void agregarCarga(Carga carga){
        cargas.add(carga);
    }

    //Implementa el método del padre
    @Override
    public Double calcularPeso() {
        Double pesoTotal = 0.0;

        // Por cada carga en la lista de cargas calcula el peso
        for (Carga carga : cargas) {
            pesoTotal += carga.calcularPeso() ;
        }
        return pesoTotal + pesoContenedor;
    }


}
