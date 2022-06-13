public class ManejadorComercial extends  Manejador {

    @Override
    public void comprobar(Mail email) {
        if ((email.getDestino().equalsIgnoreCase(("comercial@colmena.com")) ||
                email.getTema().equalsIgnoreCase("comercial"))) {

            System.out.println("Enviado a comercial");
        } else {
            if (this.getSiguienteManejador() != null) {
                this.getSiguienteManejador().comprobar(email);
            }
        }
    }
}