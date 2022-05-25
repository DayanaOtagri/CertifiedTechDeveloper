public class ApiCantidad {

    // Método
    public Integer descuento(Integer cantidad){

        if(cantidad > 11 ){
            return 15;
        }
        else{
            return 0;
        }
    }

}
