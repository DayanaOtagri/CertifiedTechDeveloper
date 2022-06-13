package com.example.demo1.controller;

import com.example.demo1.dominio.Entrenador;
import com.example.demo1.dominio.Odontologo;
import com.example.demo1.services.OdontologoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("odontologo")
public class OdontologoController {
    private final OdontologoService odontologoService;

    @Autowired
    public OdontologoController(OdontologoService odontologoService) {
        this.odontologoService = odontologoService;
    }

    @GetMapping
    public List<Odontologo> getOdontologos() {
        return odontologoService.listaOdontologos();
    }
}
