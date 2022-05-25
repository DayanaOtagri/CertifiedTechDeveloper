public class ApiProducto {

    // Método
    public Integer descuento(Producto unProducto){

        if (unProducto.getTipo().compareTo("Lata") == 0){
            return 10;
        }
        else {
            return 0;
        }

    }


}
