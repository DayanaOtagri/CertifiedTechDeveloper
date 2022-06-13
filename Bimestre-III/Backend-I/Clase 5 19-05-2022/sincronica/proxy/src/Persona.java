import java.util.Date;

public class Persona {

    //Atributos
    private String nombre;
    private String apellido;
    private Integer dni;
    private String nombreVacuna; // Puede crearse una Clase vacuna y asiganrsela
    private Date fecha;

    //

    // Constructor
    public Persona(String nombre, String apellido, Integer dni, String nombreVacuna, Date fecha) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.nombreVacuna = nombreVacuna;
        this.fecha = fecha;
    }


    //Método que guarda los valores de la clase en un Arrego de tipo Objet

    public Object[ ] datos(){
        Object[ ] informacion;
        informacion = new Object[2];
        informacion[0] = dni;
        informacion[1] = fecha;
        return informacion;
    }


    // Getters & Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public String getNombreVacuna() {
        return nombreVacuna;
    }

    public void setNombreVacuna(String nombreVacuna) {
        this.nombreVacuna = nombreVacuna;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

}
