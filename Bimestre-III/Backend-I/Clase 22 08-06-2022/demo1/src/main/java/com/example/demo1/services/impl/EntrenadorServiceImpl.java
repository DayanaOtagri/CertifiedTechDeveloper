package com.example.demo1.services.impl;

import com.example.demo1.dominio.Entrenador;
import com.example.demo1.services.EntrenadorService;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class EntrenadorServiceImpl implements EntrenadorService {
    @Override
    public List<Entrenador> listaEntrenador() {
        return Arrays.asList(new Entrenador("Pibe"), new Entrenador("Roman"));
    }
}
