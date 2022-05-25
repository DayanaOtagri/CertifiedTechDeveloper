public class FacadeDescuento {

    //Atributos

    private ApiTarjeta apiTarjeta;
    private ApiProducto apiProducto;
    private ApiCantidad apiCantidad;

    // Constructor
    public FacadeDescuento(){
        apiTarjeta = new ApiTarjeta();
        apiProducto = new ApiProducto();
        apiCantidad = new ApiCantidad();
    }


    //Método que va aplicar el descuento
    public Integer  descuento(Tarjeta tarj, Producto prod, Integer cant){

        Integer elDescuento = 0;

        elDescuento = elDescuento + apiTarjeta.descuento(tarj);
        elDescuento = elDescuento + apiProducto.descuento(prod);
        elDescuento = elDescuento + apiCantidad.descuento(cant);

        return elDescuento;

    }



}
