package com.company;

import java.util.ArrayList;
import java.util.List;

public class Almacen  {
    // Se crea una lista que recibe productos y el nombre de la lista "productos"
    private List<Producto> productos;

    //Se inicializa la lista de productos en el constructor
    public Almacen() {
        productos = new ArrayList<>();
    }


    //Este es un metodo que permite agregar productos a la lista
    // No devuelve nada y como parametro toma ProductoFactory el código del producto.
    public void agregarProducto(String codigoProducto) {
        try{
            productos.add(ProductoFactory.getInstance().crearProducto(codigoProducto));
        }catch (ProductoFactoryException e){
            System.out.println("algo fallo");
        }
    }

    public Double calcularEspacioNecesario(){
        //Contador vacio
        Double espacioNecesario = 0.0;

        // Por cada Producto en la lista de productos
        for (Producto producto : productos) {
            // agrega a espacio necesario el calulculo del espacio
            espacioNecesario += producto.calcularEspacio();
        }

        return espacioNecesario;
    }
}
