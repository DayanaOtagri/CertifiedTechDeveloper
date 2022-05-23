public abstract class Manejador {
    // Atributos
    protected Manejador siguienteManejador;


    // getters & Setters
    public Manejador getSiguienteManejador() {
        return siguienteManejador;
    }

    public void setSiguienteManejador(Manejador siguienteManejador) {
        this.siguienteManejador = siguienteManejador;
    }


    //Método que se sobrescribira en las clases que exientan esta
    public abstract void comprobar(Mail email);
}
