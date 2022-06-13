public class Main {
    public static void main(String[] args) {

        Empresa empresa= new Empresa("Tren de los Bs As");

        Recorrido recorrido1= new Recorrido("Buenos Aires","Mercedes");
        Recorrido recorrido2= new Recorrido("Luján","Suipacha");
        Recorrido recorrido3= new Recorrido("Buenos Aires","Bragado");
        Recorrido recorrido4= new Recorrido("Bragado","Buenos Aires");
        Recorrido recorrido5= new Recorrido("Buenos Aires","Bragado");
        Recorrido recorrido6= new Recorrido("Mercedes","Chivilcoy");


        Reserva reserva1= new Reserva("002",recorrido6,4);
        Reserva reserva2= new Reserva("098",recorrido3,9);
        Reserva reserva3= new Reserva("973",recorrido5,6);
        Reserva reserva4= new Reserva("008",recorrido4,8);
        Reserva reserva5= new Reserva("233",recorrido2,10);


        empresa.addReserva(reserva5);
        empresa.addReserva(reserva4);
        empresa.addReserva(reserva2);
        empresa.addReserva(reserva3);


        System.out.println("\nEl total recaudado por la empresa \'"+empresa.getNombre()+"\' es: $ "+empresa.recaudacionTotal());

        try {
            System.out.println("\nLa estacion Buenos Aires fue recorrida: "+empresa.cantVecesRecorridas("Buenos Aires")+ " veces");
            System.out.println("La estacion Chivilcoy fue recorrida: "+empresa.cantVecesRecorridas("Chivilcoy")+ " veces");
            System.out.println("La estacion Suipacha fue recorrida: "+empresa.cantVecesRecorridas("Suipacha")+ " veces");
        } catch (RecorridoException e) {
            throw new RuntimeException(e);
        }



    }
}