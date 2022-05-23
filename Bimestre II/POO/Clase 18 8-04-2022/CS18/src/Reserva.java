public class Reserva {
    private static final int PRECIO_BOLETO = 50;
    private String codigo;
    private Recorrido recorrido;
    private Integer cantPasajeros;

    public Reserva(String codigo, Recorrido recorrido, Integer cantPasajeros) {
        this.codigo = codigo;
        this.recorrido = recorrido;
        this.cantPasajeros = cantPasajeros;
    }

    public Double calcularPrecioReserva(){
        double precioReserva=(double)PRECIO_BOLETO * this.cantPasajeros;
        if(recorrido.getEstacionPartida().equals("Buenos Aires") && recorrido.getEstacionDestino().equals("Bragado") ||
        recorrido.getEstacionPartida().equals("Bragado") && recorrido.getEstacionDestino().equals("Buenos Aires")){
            double descuento=precioReserva*0.2;
            return precioReserva-=descuento;
        }
        return precioReserva;
    }

    public String getCodigo() {
        return codigo;
    }

    public Recorrido getRecorrido() {
        return recorrido;
    }

    public Integer getCantPasajeros() {
        return cantPasajeros;
    }
}
