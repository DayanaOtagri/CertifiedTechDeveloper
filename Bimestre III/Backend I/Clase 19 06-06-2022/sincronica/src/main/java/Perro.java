import java.io.Serializable;

// Implementacion de la Interfaz Serializable
public class Perro implements Serializable  {

    //Atributos
    private Integer edad;
    private String nombre;

    // Sin Constructor

    //Getters & Setters
    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
