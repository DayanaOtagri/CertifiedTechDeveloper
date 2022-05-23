package poo.clase3;

import poo.clase3.sincronico.EjercicioVeterinaria;
import poo.clase3.sincronico.EjercicioPiedraPapelTijera;

public class Ejercicios {

    public static void main(String[] args) {

        System.out.println("\n\n\t------------------ CLASE 3A ------------------");
//        System.out.println("\t----------------- Veterinaria ----------------");
//        String nombrePerro = EjercicioVeterinaria.pedirNombrePerro();
//        double cdadComidaPerro = EjercicioVeterinaria.pedirCdadComidaPerro(nombrePerro);
//        System.out.println(nombrePerro + " necesita " + EjercicioVeterinaria.cuantosPaquetes(cdadComidaPerro) + " paquetes");

        System.out.println("\t----------- Piedra, papel, o tijera ----------");
        EjercicioPiedraPapelTijera.jugar();
    }
}
