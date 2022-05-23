import java.time.LocalDate;
import java.time.Period;

public class Persona {

    // Atributos
    private String nombre;
    private String apellido;
      // LocalDate como un dato local, no es tan complejo, objeto fecha puntual
    private LocalDate edad;
    private  String email;


    // Constructor

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    // Get y set

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

    public LocalDate getEdad() {
        return edad;
    }

    public void setEdad(LocalDate edad) {
        this.edad = edad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }



    // Métodos

    // Este método nos devulve el nombre completo
    public String calcularNombreCompleto(){
        return  this.nombre + ", " + this.apellido;
    }

    public boolean esMayorDeEdad(){
        return Period.between(this.edad,LocalDate.of(2022, 5, 16)).getYears()>=18;
    }


}
