package com.company;

public class Usuario {
    private Integer id;
    private String tipo;

    public Usuario(Integer id, String tipo) {
        this.id = id;
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }
}
