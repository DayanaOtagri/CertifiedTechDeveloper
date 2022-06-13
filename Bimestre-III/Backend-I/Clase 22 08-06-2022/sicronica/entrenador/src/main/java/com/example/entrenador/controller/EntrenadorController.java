package com.example.entrenador.controller;

import com.example.entrenador.model.Entrenador;
import com.example.entrenador.service.impl.EntrenadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

// Anotaciones que nos permite utilizar esta clase como Controller
// @Controller
@RestController
// Hacer request para ubicar donde hacer el request
@RequestMapping // son los endpoint de la url (localhost:8080/entrenador)
public class EntrenadorController {

    //Anotación  que delega la costrucción del objeto a SpringBoot
    @Autowired
    //Atributos
    private final EntrenadorService entrenadorService;

    //Constructor
    public EntrenadorController(EntrenadorService entrenadorService) {
        this.entrenadorService = entrenadorService;
    }

    // Cada que suceda un request devuelve el objeto que genera el método
    @GetMapping("entrenador")
    public List<Entrenador> getEntrenador() {
        return entrenadorService.listaEntrenador();
    }
}
