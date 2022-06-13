package com.example.pacientes.services;
import com.example.pacientes.models.Paciente;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class PacienteService {

    // Implementa el Odontologo Service para poder asociarlo a un paciente
    private OdontologoService odontologoService = new OdontologoService();

    private List<Paciente> pacientes = new ArrayList<>();


    // Aquí  pasa el odontologo
    public PacienteService(){
        pacientes.add(new Paciente(1L, "Rodriguez","Mariano",
                "mail@mail.com", "38545656", LocalDate.of(2021,8,20), odontologoService.getOdontologoById(1L)));
    }

    //Obtener todos los pacientes
    public List<Paciente> getAll(){
        return pacientes;
    }


    public Paciente getPacientByEmail(String email){
        // Recorre cada paciente y que el paciente i sea igual al parametro
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
