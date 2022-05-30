public class Cuenta {

    // Atributos
    private Long id;
    private  Integer nroCuenta;
    private  String nombre;
    private Double saldo;

    // Constructor - Simpre se agrega un id pero no se hace accesible
    public Cuenta(Integer nroCuenta, String nombre, Double saldo) {
        this.nroCuenta = nroCuenta;
        this.nombre = nombre;
        this.saldo = saldo;
    }

    // Getters & Setters
    public Integer getNroCuenta() {
        return nroCuenta;
    }

    public void setNroCuenta(Integer nroCuenta) {
        this.nroCuenta = nroCuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    // Get de id
    public Long getId() {
        return id;
    }
}

