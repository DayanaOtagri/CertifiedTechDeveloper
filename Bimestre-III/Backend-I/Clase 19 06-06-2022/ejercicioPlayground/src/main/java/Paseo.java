import java.io.*;
import java.util.ArrayList;

public class Paseo {

    public static void main(String[] args) {
        Perro p1 = new Perro("Firu","Criolla",3, "Cll 65");
        Perro p2 = new Perro("Simba","Golden",7, "Cll 80");
        Perro p3 = new Perro("Atenea","Pastor Aleman",2, "Cll 100");


        ArrayList<Perro> lunes = new ArrayList<Perro>();
        ArrayList<Perro> martes = new ArrayList<Perro>();
        ArrayList<Perro> miercoles = new ArrayList<Perro>();
        ArrayList<Perro> jueves = new ArrayList<Perro>();
        ArrayList<Perro> viernes = new ArrayList<Perro>();


        lunes.add(p1);
        miercoles.add(p1);
        viernes.add(p1);


        lunes.add(p2);
        martes.add(p2);
        jueves.add(p2);


        lunes.add(p3);
        martes.add(p3);
        miercoles.add(p3);
        viernes.add(p3);

        try {

            // Archivo de salida (Cómo parámetro se le da el nombre que tendrá en el sistema Operativo)
            FileOutputStream file = new FileOutputStream("perros.dat");
            // Objeto de salida
            ObjectOutputStream archiv = new ObjectOutputStream(file);

            // Escribiendo en el archivo // grabando objetos
            archiv.writeObject(lunes);
            archiv.writeObject(martes);
            archiv.writeObject(miercoles);
            archiv.writeObject(jueves);
            archiv.writeObject(viernes);

            // Cierro el archivo
            archiv.close();

            // Abrir el archivo para leerlo y listarlo
            FileInputStream fileIm = new FileInputStream("perros.dat");
            // Objero de entrada
            ObjectInputStream archivIm = new ObjectInputStream(fileIm);

            ArrayList <Perro> dia ;
            for( int i = 0; i < 5; i++){
                System.out.println("Día: " + (i+1));
                System.out.println("=================================");
                // Casteo dia
                dia = (ArrayList<Perro>) archivIm.readObject();
                for (Perro perro : dia) {
                    System.out.println(perro);
                }
            }

            // Cierro el archivo
            archivIm.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
