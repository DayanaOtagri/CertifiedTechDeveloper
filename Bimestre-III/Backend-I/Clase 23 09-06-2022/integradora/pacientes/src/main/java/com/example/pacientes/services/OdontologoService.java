package com.example.pacientes.services;

import com.example.pacientes.models.Odontologo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OdontologoService {

    // creando la lista que guarda los odontologos
    private List<Odontologo> OdontologoList = new ArrayList<>();

    // Constructor
    public OdontologoService() {
        OdontologoList.add(new Odontologo(1L, "Juan", "Perez", "AB1000"));
    }

    // Método = devuleve todos los objetos de la lista
    public List<Odontologo> getAll(){
        return OdontologoList;
    }


    // Método(Lamba) Se pasa un el id, devulve el Objeto del id que pasamos
    // y si no existe retorna NULL
    public Odontologo getOdontologoById(long id) {
        return OdontologoList.stream().filter(x -> x.getId() == (id)).findFirst().orElse(null);
    }



}
