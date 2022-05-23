package com.company;

public class ProductoFactory {

    // Son constantes
    public static final String CODIGO_CAJA10 = "CAJA10X10";
    public static final String CODIGO_PELOTA_FUTBOL  = "PELOTAFUTBOL";
    public static final String CODIGO_PELOTA_TENIS = "PELOTATENIS";

    //Attribute static
    private static ProductoFactory instance;

    //Constructor privado para que nadie pueda crear instancias
    private ProductoFactory(){
    }


    // Crea la instancia
    public static ProductoFactory getInstance() {
        if(instance == null){
            instance = new ProductoFactory();
        }
        return instance;
    }

    //Crea el producto y también tiene una excepción
    public Producto crearProducto(String codigo) throws ProductoFactoryException{
        switch (codigo){
            case CODIGO_CAJA10 :
                return new Caja(20.0,10.0,10.0,10.0);
            case CODIGO_PELOTA_FUTBOL:
                return new Pelota(5.0,11.0);
            case CODIGO_PELOTA_TENIS:
                return new Pelota(1.0,0.32);
        }
        //Aquí esta la excepción en caso de que no se cumplan los casos de arriba.
        throw new ProductoFactoryException(codigo + " no es un codigo valido");
    }
}
