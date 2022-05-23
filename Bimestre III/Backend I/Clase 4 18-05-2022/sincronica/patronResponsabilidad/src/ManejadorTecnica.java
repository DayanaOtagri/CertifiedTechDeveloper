public class ManejadorTecnica extends Manejador {
    @Override
    public void comprobar(Mail email) {
        if ((email.getDestino().equalsIgnoreCase(("tecnica@colmena.com")) ||
                email.getTema().equalsIgnoreCase("tecnica"))){

            System.out.println("Enviado a tecnica");
        }
        else {
            if (this.getSiguienteManejador()!=null){
                this.getSiguienteManejador().comprobar(email);
        }
    }
}
}
