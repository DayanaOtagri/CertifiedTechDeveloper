package com.example.ejemplointegrador.services;

import com.example.ejemplointegrador.models.Odontologo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OdontologoService {

    //creamos la lista donde agregamos los objetos que vamos a crear
    private List<Odontologo> odontologos = new ArrayList<>();

    //creamos los objetos y los pusheamos a la lista
    public OdontologoService(){

        odontologos.add(new Odontologo(1L, "Menendez", "Juana", "M-J-123"));
        odontologos.add(new Odontologo(2L, "Sanchez", "Sandra", "M-J-132"));
    }

    //retorna la lista con todos los pacientes
    public List<Odontologo> getAll() {
        return odontologos;
    }

    //busca un odontologo por id y si no lo encuentra devuelve null. Este formato es lamda!!
    public Odontologo getOdontologoById(long id) {
        return odontologos.stream().filter(x -> x.getId() == (id)).findFirst().orElse(null);
    }

}