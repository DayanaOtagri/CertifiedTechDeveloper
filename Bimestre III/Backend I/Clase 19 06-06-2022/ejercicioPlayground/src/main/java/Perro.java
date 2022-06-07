public class Perro {

    // Atributos
    private String nombre;
    private String raza;
    private Integer edad;
    private String dirección;

    // Constructor
    public Perro(String nombre, String raza, Integer edad, String dirección) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.dirección = dirección;
    }

    // Setters & Getters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getDirección() {
        return dirección;
    }

    public void setDirección(String dirección) {
        this.dirección = dirección;
    }


    // toString

    @Override
    public String toString() {
        return "Perro{" +
                "nombre='" + nombre + '\'' +
                ", raza='" + raza + '\'' +
                ", edad=" + edad +
                ", dirección='" + dirección + '\'' +
                '}';
    }
}
