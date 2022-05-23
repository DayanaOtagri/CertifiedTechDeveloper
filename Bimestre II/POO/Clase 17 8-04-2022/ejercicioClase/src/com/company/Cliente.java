package com.company;

public class Cliente {

    private String nombre;
    private String apellido;
    private  Integer dni;
    private Double saldoCuenta;
    private Double limiteCompra;
    private Double deuda;


    public Cliente(String nombre, String apellido, Integer dni, Double saldoCuenta, Double limiteCompra) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.saldoCuenta = 0.0;
        this.limiteCompra = limiteCompra;
        deuda = 0.0;
    }

    private  void comprar(Double importe) throws  ClienteExcepcion{
        if(importe > limiteCompra){
            //Si no sucede el condicional, entonces que se ejecute una excepción importe;
            throw new ClienteExcepcion("tu limite es de " + limiteCompra);
        } else {

            deuda += importe;
        }
    }
}
