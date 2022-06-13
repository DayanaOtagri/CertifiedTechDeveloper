package com.company;

public class Cliente {

    // ATRIBUTOS
    private Integer numeroDeCliente;
    private String nombre;
    private Double deuda;


    //CONSTRUCTOR
//    public Cliente(Integer numeroDeCliente,String nombre,Double deuda){
//        this.numeroDeCliente = numeroDeCliente;
//        this.nombre = nombre;
//        this.deuda = deuda;
//    }

    public Cliente(Integer numeroDeCliente,String nombre){
        this.numeroDeCliente = numeroDeCliente;
        this.nombre = nombre;
        this.deuda = 0.0;
    }



    //METODOS
    public void incrementarDeuda(Double valor){
        if(valor > 0){
            System.out.println("incremento mi deuda por " + valor);
            this.deuda += valor;
            System.out.println("mi nueva deuda es de " + deuda);
        }else {
            System.out.println("no podes incrementar tu deuda por valores negativos");
        }

    }

    public void pagarDeuda(){
        System.out.println("tu deuda fue saldada");
        this.deuda = 0.0;
    }



    //GETTERS Y SETTERS
    public Double getDeuda() {
        return deuda;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}
