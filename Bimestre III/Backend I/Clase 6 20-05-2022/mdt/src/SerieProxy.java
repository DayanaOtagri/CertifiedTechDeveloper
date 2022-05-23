public class SerieProxy implements InterfazSerie{

    public Integer cantidadVistas;
    public Serie laSerie;

    public SerieProxy(Integer cantidadVistas, Serie laSerie) {
        this.cantidadVistas = cantidadVistas;
        this.laSerie = laSerie;
    }
    @Override
    public String getSerie(String getNombreSerie) {
        if(cantidadVistas > 5 ){
            return "La serie supera el limite de vistas";
        }
        cantidadVistas++;
        return la
    }
}
