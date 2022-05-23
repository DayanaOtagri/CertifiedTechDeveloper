public abstract class AnalistaDeCalidad {

    // Atributo
    protected AnalistaDeCalidad siguienteAnalistaDeCalidad;

    // Getter & Setter

    public AnalistaDeCalidad getSiguienteAnalistaDeCalidad() {
        return siguienteAnalistaDeCalidad;
    }

    public void setSiguienteAnalistaDeCalidad(AnalistaDeCalidad siguienteAnalistaDeCalidad) {
        this.siguienteAnalistaDeCalidad = siguienteAnalistaDeCalidad;
    }

    //
    public abstract void comprobarProducto(Producto producto);
}
