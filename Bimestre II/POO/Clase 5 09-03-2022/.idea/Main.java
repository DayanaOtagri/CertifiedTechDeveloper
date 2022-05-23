package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Cliente cliente1 = new Cliente(1,"Simon");

        Cliente cliente2 = new Cliente(2,"Indira");


  //      System.out.println(cliente1.getNombre());

   //     cliente1.setNombre("Nicolas");

        cliente1.incrementarDeuda(200.0);
        cliente1.incrementarDeuda(400.0);
        cliente1.pagarDeuda();
        cliente1.incrementarDeuda(100.0);
        cliente1.incrementarDeuda(4.0);
        cliente1.incrementarDeuda(-750.0);



    }
}
