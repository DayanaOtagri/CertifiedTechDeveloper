public class Producto {

    // Atributos
    private String tipo;
    private String nombre;

    // Constructor
    public Producto(String tipo, String nombre) {
        this.tipo = tipo;
        this.nombre = nombre;
    }

    // Getters & Setters
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
