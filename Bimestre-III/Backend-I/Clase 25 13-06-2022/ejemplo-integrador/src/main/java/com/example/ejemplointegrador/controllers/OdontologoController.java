package com.example.ejemplointegrador.controllers;

import com.example.ejemplointegrador.models.Odontologo;
import com.example.ejemplointegrador.services.OdontologoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class OdontologoController {

    @Autowired
    public OdontologoService odontologoService;

    @GetMapping("/odontologoById")
    public String getOdontoloById(@RequestParam (name="name", required = false, defaultValue = "1" ) Long id, Model model){

        Odontologo odontologo = odontologoService.getOdontologoById(id);
        model.addAttribute("name", odontologo.getNombre());
        model.addAttribute("surname", odontologo.getApellido());
        model.addAttribute("matricula", odontologo.getMatricula());
        if (odontologo == null) return "no se ha encontrado el odontologo";
        return "odontologoById";
    }


}
