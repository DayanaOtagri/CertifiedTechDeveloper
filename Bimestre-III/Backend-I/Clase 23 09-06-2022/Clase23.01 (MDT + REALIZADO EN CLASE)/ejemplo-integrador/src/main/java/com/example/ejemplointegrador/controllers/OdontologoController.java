package com.example.ejemplointegrador.controllers;

import com.example.ejemplointegrador.models.Odontologo;
import com.example.ejemplointegrador.models.Paciente;
import com.example.ejemplointegrador.services.OdontologoService;
import com.example.ejemplointegrador.services.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class OdontologoController {

    @Autowired
    public OdontologoService odontologoService;

    @GetMapping("/todosOdontologos")
    public List<Odontologo> getAll(Model model){
        model.addAttribute("todosOdontologos", odontologoService.getAll());
        return odontologoService.getAll();
    }


    //NO FUNCIONO
    @GetMapping("/odontologoID")
    public String getOdontologoById(@RequestParam(name="id", required=false, defaultValue="1L") Long id, Model model){


        Odontologo odontologo= odontologoService.getOdontologoById(id);
        String odontologoString = odontologo+"";

        model.addAttribute("name", odontologo.getNombre());
        model.addAttribute("surname", odontologo.getApellido());
        model.addAttribute("matricula", odontologo.getMatricula());

        return "Odontologo: " + odontologoString;
    }
}
