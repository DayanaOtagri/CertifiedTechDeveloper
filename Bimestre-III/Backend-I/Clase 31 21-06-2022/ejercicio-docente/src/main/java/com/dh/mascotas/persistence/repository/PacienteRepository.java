package com.dh.mascotas.persistence.repository;

import com.dh.mascotas.persistence.entities.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PacienteRepository extends JpaRepository<Paciente, Integer> {
}
