package com.example.ejemplointegrador.controllers;

import com.example.ejemplointegrador.models.Paciente;
import com.example.ejemplointegrador.services.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class PacienteController {

    //Le decimos a MAVEN que instancie el service automaticamente
    @Autowired
    public PacienteService pacienteService;

    //creamos el endpoint de la URL y lo que quiero mostrar
    @GetMapping("/todos")
    public List<Paciente> getAll(Model model){
        model.addAttribute("todos", pacienteService.getAll());
        return pacienteService.getAll();
    }

    @GetMapping("/email")
    public String getPacientByEmail(@RequestParam(name="name", required=false, defaultValue="mail@mail.com") String email, Model model){
        Paciente paciente= pacienteService.getPacientByEmail(email);

        if(paciente == null) return "no se encontro paciente con ese email";

        model.addAttribute("name", paciente.getNombre());
        model.addAttribute("surname", paciente.getApellido());
        model.addAttribute("matricula", paciente.getOdontologo().getMatricula());

        return "email";
    }
}
