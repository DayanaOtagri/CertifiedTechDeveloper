import java.util.ArrayList;
import java.util.List;

public class Empresa {
    public String getNombre() {
        return nombre;
    }

    private String nombre;
    private List<Reserva> reservas;

    public Empresa(String nombre) {
        this.nombre = nombre;
        this.reservas= new ArrayList<Reserva>();
    }

    public void addReserva(Reserva r){
        this.reservas.add(r);
    }

    public Double recaudacionTotal(){
        Double total=0.0;
        for (Reserva reserva : reservas) {
            System.out.println("El precio de la reserva desde "+reserva.getRecorrido().getEstacionPartida()+" a "+reserva.getRecorrido().getEstacionDestino()+" es: $ "+reserva.calcularPrecioReserva());
            total+=reserva.calcularPrecioReserva();
        }
        return total;
    }

    public Integer cantVecesRecorridas(String estacion) throws RecorridoException{
        if(!getEstaciones().contains(estacion)){
            throw new RecorridoException("No es una estacion permitida");
        }
        Integer count=0;
        for (Reserva reserva : reservas) {
            if(reserva.getRecorrido().getEstacionPartida().equals(estacion)|| reserva.getRecorrido().getEstacionDestino().equals(estacion)){
                count++;
            }
        }
        return count;
    }

    private List<String> getEstaciones(){

        List<String> estacionesPermitidas= new ArrayList<String>();
        estacionesPermitidas.add("Buenos Aires");
        estacionesPermitidas.add("Luján");
        estacionesPermitidas.add("Mercedes");
        estacionesPermitidas.add("Suipacha");
        estacionesPermitidas.add("Chivilcoy");
        estacionesPermitidas.add("Alberti");
        estacionesPermitidas.add("Bragado");
        return estacionesPermitidas;
    }

}
