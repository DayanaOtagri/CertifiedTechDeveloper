import java.util.Date;

public class Probar {

    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan", "Perez", 12345, "VacuVida", new Date(121,6,5));
        Persona persona2 = new Persona("Maria", "Gonzales", 123456, "VacuVida", new Date(123,6,5));


        Registro registro = new RegistroVacunaProxy();
        // registro.registrar(persona1.datos());
        registro.registrar(persona2.datos());

    }

}
