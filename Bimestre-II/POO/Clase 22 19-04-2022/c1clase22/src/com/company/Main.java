package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

     ProductoIndividual papasFritas = new ProductoIndividual("Papa frita" ,2.0 );
     ProductoIndividual hamburguesa = new ProductoIndividual("Hamburguesa" ,7.0 );
     ProductoIndividual cocaCola = new ProductoIndividual("Coca Cola" ,1.0 );
     ProductoIndividual helado = new ProductoIndividual("Helado" ,1.5 );


     Combo combo1 = new Combo(0.1);
     combo1.agregarProducto(hamburguesa);
     combo1.agregarProducto(papasFritas);
     combo1.agregarProducto(cocaCola);


     Combo combo2 = new Combo(0.2);
     combo2.agregarProducto(combo1);
     combo2.agregarProducto(combo1);

     Combo combo3 = new Combo(0.3);
     combo3.agregarProducto(combo1);
     combo3.agregarProducto(combo2);
     combo3.agregarProducto(helado);
     combo3.agregarProducto(helado);
     combo3.agregarProducto(helado);

     Carrito carrito = new Carrito();
     carrito.agregarProducto(combo1);
     carrito.agregarProducto(combo2);
     carrito.agregarProducto(combo3);

     System.out.println(carrito.calcularPrecioCarrito());
    }
}
