public class ProcesaMail {

    public static void main(String[] args){
        CompruebaMail proceso = new CompruebaMail();
        proceso.comprobar(new Mail("mio@gmail.com", "tecnica@cilmena.con", "reclamo"));
        proceso.comprobar(new Mail("mio@gmail.com", "comercial@cilmena.con", "reclamo"));

    }
}
