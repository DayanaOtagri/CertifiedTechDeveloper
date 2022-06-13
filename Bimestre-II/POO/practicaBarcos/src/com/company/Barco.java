package com.company;

import java.util.ArrayList;
import java.util.List;

public class Barco {

    //Crea la lista
    private List<Carga> cargas;

    // Inicializa la lista
    public Barco(){
        cargas = new ArrayList<>();
    }

    //Agrega cargas al barco
    public void agregarCarga(String codigo){
        try {
            cargas.add(CargaFactory.getInstance().generarCarga(codigo));
        } catch (CargaException e){
            System.out.println(e.getMessage());
        }
    }

    //Muestra su carga
    public void mostrarCarga(){
        for (Carga carga : cargas) {
            System.out.println(carga);
        }
    }
}
