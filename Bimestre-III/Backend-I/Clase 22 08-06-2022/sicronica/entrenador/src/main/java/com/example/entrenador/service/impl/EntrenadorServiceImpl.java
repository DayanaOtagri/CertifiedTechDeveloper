package com.example.entrenador.service.impl;

import com.example.entrenador.model.Entrenador;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// indicar que es un Service
@Service
public class EntrenadorServiceImpl implements EntrenadorService {

    // Implementar métodos de la interfaz EntrenadorService
    @Override
    public List<Entrenador> listaEntrenador() {
        // Crear los objetos de tipo entrenador y se los pasamos al Array
        return Arrays.asList(new Entrenador("Juan"), new Entrenador("Carlos"));
    }



}
