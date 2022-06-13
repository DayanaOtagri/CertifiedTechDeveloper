public class Serie implements InterfazSerie{
    @Override
    public String getSerie(String getNombreSerie) {
        return "www." + getNombreSerie;
    }
}
