package com.example.demo1.controller;

import com.example.demo1.dominio.Entrenador;
import com.example.demo1.services.EntrenadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("entrenador")
public class EntrenadorController {
    private final EntrenadorService entrenadorService;

    @Autowired
    public EntrenadorController(EntrenadorService entrenadorService) {
        this.entrenadorService = entrenadorService;
    }

    @GetMapping
    public List<Entrenador> getEntrenador() {
        return entrenadorService.listaEntrenador();
    }
}
