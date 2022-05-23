public class ManejadorGerencia extends Manejador {

    @Override
    public void comprobar(Mail email) {
        if ((email.getDestino().equalsIgnoreCase(("gerencia@colmena.com")) ||
                email.getTema().equalsIgnoreCase("gerencia")))
        {

            System.out.println("Enviado a gerencia");
        }
        else{
            if (this.getSiguienteManejador()!=null){
                this.getSiguienteManejador().comprobar(email);
            }
        }
    }
}
