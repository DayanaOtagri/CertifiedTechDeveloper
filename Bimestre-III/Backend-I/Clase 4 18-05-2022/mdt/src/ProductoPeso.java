public class ProductoPeso extends AnalistaDeCalidad{

    @Override
    public void comprobarProducto(Producto producto) {
        if(producto.getPeso() >= 1000 || producto.getPeso() <= 2000){
            getSiguienteAnalistaDeCalidad().comprobarProducto(producto);
        }
        else System.out.println("Producto rechazado en Peso");
    }
}
