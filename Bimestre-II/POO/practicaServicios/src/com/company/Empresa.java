package com.company;

import java.util.ArrayList;
import java.util.List;

public class Empresa {

    private List<Servicio> servicios;

    public Empresa (){
        servicios = new ArrayList<>();
    }


    public void agregarServicio(String codigo){
        try{
            servicios.add(ServicioFactory.getInstance().generarServicio(codigo));
        } catch (ServicioException e) {
            System.out.println(e.getMessage());
        }
    }

    public void mostrarServicios(){
        for (Servicio servicio : servicios) {
            System.out.println(servicio);
        }
    }
}
