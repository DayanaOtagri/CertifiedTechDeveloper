package com.example.ejemplointegrador.services;

import com.example.ejemplointegrador.models.Domicilio;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DomicilioService<List> {
    private List<Domicilio> domicilios = new ArrayList<>();

    public DomicilioService(){
        domicilios.add(new Domicilio( 1L, "Rosas", 123, "Olavarria", "Bs As" ));
    }

    public List<Domicilio> getDomicilios() {
        return domicilios;
    }

    public Domicilio getDomicilioById(Long id){
        return domicilios.stream().filter(x-> x.getId() == (id)).findFirst().orElse(null);
    }
}
