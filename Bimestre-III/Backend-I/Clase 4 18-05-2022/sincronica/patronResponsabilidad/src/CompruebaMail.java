public class CompruebaMail {

    //Atributos
    //Se crea un manejador - Que es el primero en recibir el problema
    Manejador inicial;


    public  CompruebaMail(){
        this.inicial = new ManejadorGerencia();
        Manejador tecnica = new ManejadorTecnica();
        Manejador comercial = new ManejadorComercial();
        // Manejador spam = new ManejadorSpam();


        inicial.setSiguienteManejador(comercial);
        comercial.setSiguienteManejador(tecnica);
        // tecnica.setSiguienteManejador();
    }

    public void comprobar (Mail email){
        inicial.comprobar((email));
    }

}
