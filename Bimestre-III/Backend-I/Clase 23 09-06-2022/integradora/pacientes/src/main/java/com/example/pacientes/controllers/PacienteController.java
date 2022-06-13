package com.example.pacientes.controllers;
import com.example.pacientes.models.Paciente;
import com.example.pacientes.services.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class PacienteController {

    @Autowired // le decimos a MAVEN que instancie el Service
    public PacienteService pacienteService;

    @GetMapping("/todos")
    public List<Paciente> getAll(){
        return pacienteService.getAll();
    }

    @GetMapping("/email")
    // RequestParam = Un parametro que se le pasa para que busque
    public String getPacientByEmail(@RequestParam(name="name", required=false, defaultValue="mail@mail.com") String email, Model model){
        Paciente paciente= pacienteService.getPacientByEmail(email);

        if(paciente == null) return "No se encontró un paciente con ese email";

        model.addAttribute("name", paciente.getNombre());
        model.addAttribute("surname", paciente.getApellido());
        model.addAttribute("matricula", paciente.getOdontologo().getMatricula());

        return "email";
    }
}
