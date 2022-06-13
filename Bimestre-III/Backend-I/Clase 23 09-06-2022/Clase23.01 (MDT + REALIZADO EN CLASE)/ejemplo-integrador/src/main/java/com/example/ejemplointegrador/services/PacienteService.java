package com.example.ejemplointegrador.services;

import com.example.ejemplointegrador.models.Odontologo;
import com.example.ejemplointegrador.models.Paciente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class PacienteService {

    //implementamos el osodontologoService para asociar el odontologo al paciente
    private OdontologoService odontologoService = new OdontologoService();

    private List<Paciente> pacientes = new ArrayList<>();

    public PacienteService(){
        pacientes.add(new Paciente(2L, "Rodriguez","Mariano",
                "mail@mail.com", "38545656", LocalDate.of(2021,8,20), odontologoService.getOdontologoById(2L)));
    }

    public List<Paciente> getAll(){
        return pacientes;
    }

    //recorre y verifica si el email que ingresamos por parametro es igual al que tenemos en la BD
    public Paciente getPacientByEmail(String email){
        for(int i = 0; i<pacientes.size();i++){
            if(pacientes.get(i).getEmail().equals(email)){
                return pacientes.get(i);
            }
        }
        return null;
    }

    public void savePaciente(Paciente paciente){
        pacientes.add(paciente);
    }
}
