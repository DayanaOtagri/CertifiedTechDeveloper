public class Tarjeta {

    //Atributos
    private String banco;
    private String numero;

    //Constructor
    public Tarjeta(String banco, String numero) {
        this.banco = banco;
        this.numero = numero;

    }

    // Getters & Setters
    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}
