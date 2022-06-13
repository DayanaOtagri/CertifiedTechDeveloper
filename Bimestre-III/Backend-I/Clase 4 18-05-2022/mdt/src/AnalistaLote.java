public class AnalistaLote extends  AnalistaDeCalidad{

    @Override
    public void comprobarProducto(Producto producto) {
        if(producto.getLote() >= 1000 || producto.getLote() <= 2000){
            System.out.println("El producto paso el analisis de Calidad. Derivado " + siguienteAnalistaDeCalidad.getClass().getName());
            getSiguienteAnalistaDeCalidad().comprobarProducto(producto);
        }
        else System.out.println("Producto rechazado en Lote");
    }
}
