
public class RegistroVacuna implements Registro{

    @Override
    public void registrar(Object[] datos) {
        System.out.println("Se ha generado el registro del dni " + datos[0] + " en la fecha " + datos[1].toString() + " como vacunado");

    }
}
