import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Creo una lista de perros
        List<Perro> listaPerros = new ArrayList<>();

        // Creo dos perros
        Perro perro1 = new Perro();
        perro1.setNombre("Firu");
        perro1.setEdad(4);

        Perro perro2 = new Perro();
        perro1.setNombre("Aladin");
        perro1.setEdad(7);

        // Agrega los dos perros a la lista de Perros
        listaPerros.add(perro1);
        listaPerros.add(perro2);

        //System.out.println(perro1.getEdad());
        // System.out.println(perro1.getNombre();
        // La propiedades de tipo de CLASE no le seteo ningun valor por defefcto es null

        FileOutputStream fo;
        try{
            // Objeto donde guardamos datos persistidos
            fo = new FileOutputStream("OutputFile.txt");
            // Canal que apunta al archivo. Los dos son de salida
            ObjectOutputStream dos = new ObjectOutputStream(fo);

            // Al canal le escribo el Objeto (En este caso Lista)
            // Hace un articulo Serializado
            dos.writeObject(listaPerros);

        } catch (FileNotFoundException e) {
            e.printStackTrace();

            // Input- Output Exception
        }catch (IOException e){
            throw new RuntimeException(e);
        }

        List<Perro> listaPerros2 = null;
        FileInputStream fi = null;

        try{
            fi = new FileInputStream("OutputFile.txt");
            ObjectInputStream ois = new ObjectInputStream(fi);

            //Guaradr en la lista y permite leerlo
            listaPerros2 = (ArrayList) ois.readObject();

        }catch (IOException e){
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        for (Perro perro : listaPerros2) {
            System.out.println(perro.getNombre() + " " + perro.getEdad());
        }

    }

}
