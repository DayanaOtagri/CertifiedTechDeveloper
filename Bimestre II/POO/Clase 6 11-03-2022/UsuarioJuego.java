package com.company;

public class UsuarioJuego {
    private String nombre;
    private String clave;
    private Double puntaje;
    private Integer nivel;

    // constructor

    public UsuarioJuego (String nombre, String clave) {
        this.nombre = nombre;
        this.clave = clave;
        this.puntaje = 0.0;
        this.nivel = 0;
    }

    // metodos

    public void aumentarPuntaje(){
        this.puntaje ++;
        System.out.println("tu puntaje es de " + puntaje);
    }

    public void subirNivel() {
        this.nivel ++;
        System.out.println("tu nivel es: " + nivel);
    }

    public void bonus (Integer valor) {
        if (valor > 0) {
            this.puntaje += valor;
            System.out.println("tu puntaje es despues del bonus es de " + puntaje);
        } else {
            System.out.println("Ingrese un valor positivo");
        }

    }

}


