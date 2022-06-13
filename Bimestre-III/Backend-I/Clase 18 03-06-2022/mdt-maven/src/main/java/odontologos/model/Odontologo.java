package odontologos.model;

public class Odontologo {

    // Atributos
    private Integer id;
    private String apellido;
    private String nombre;
    private String nroMatricula;

    // Constructor sin id
    public Odontologo(String apellido, String nombre, String nroMatricula) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.nroMatricula = nroMatricula;
    }

    // Constructor con id
    public Odontologo(Integer id, String apellido, String nombre, String nroMatricula) {
        this.id = id;
        this.apellido = apellido;
        this.nombre = nombre;
        this.nroMatricula = nroMatricula;
    }

    // Getters & Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNroMatricula() {
        return nroMatricula;
    }

    public void setNroMatricula(String nroMatricula) {
        this.nroMatricula = nroMatricula;
    }

    // ToString
    @Override
    public String toString() {
        return "Odontologo{" +
                "id: " + id +
                ", apellido: '" + apellido + '\'' +
                ", nombre: '" + nombre + '\'' +
                ", nroMatricula: '" + nroMatricula + '\'' +
                '}';
    }

}
