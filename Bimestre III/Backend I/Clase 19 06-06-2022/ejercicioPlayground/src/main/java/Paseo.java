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
        jueves.add(p2)


        lunes.add(p3);
        martes.add(p3);
        miercoles.add(p3);
        viernes.add(p3);

    }



}
