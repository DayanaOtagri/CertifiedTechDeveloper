package com.example.pacientes.models;

import java.time.LocalDate;

public class Paciente {

    //Atributos
    private Long id;
    private String nombre;
    private String apellido;
    private String email;
    private String dni;
    private LocalDate fechaIngreso;
    private Odontologo odontologo;

    // Constructor


    public Paciente(Long id, String nombre, String apellido, String email, String dni, LocalDate fechaIngreso, Odontologo odontologo) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.dni = dni;
        this.fechaIngreso = fechaIngreso;
        this.odontologo = odontologo;
    }

    // Getters & Settes

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Odontologo getOdontologo() {
        return odontologo;
    }

    public void setOdontologo(Odontologo odontologo) {
        this.odontologo = odontologo;
    }

    //Getter ID

    public Long getId() {
        return id;
    }
}
