import org.apache.log4j.Logger;

import java.util.List;
import java.util.ArrayList;


public class ListaPromedio {

    // Atributo static final: NO MODIFICABLE
    private static final Logger logger = Logger.getLogger(ListaPromedio.class);

    private List<Integer> enteros = new ArrayList<>();

    //Construcctor
    public ListaPromedio(List <Integer> enteros) throws Exception{
        this.enteros = enteros;

        if (enteros.size() > 5){
            logger.info("La longitud de la lista es mayor a 5");
        }

        if (enteros.size() > 10){
            logger.info("La longitud de la lista es mayor a 10");
        }

        if (enteros.size() == 0){
            throw new Exception();
        }

    }

    // Métodos
    public Integer promedio(){
        Integer suma = 0;
        for(Integer entero:enteros){
            suma += entero;
        }
        Integer promedio = suma / enteros.size();
        logger.info("El promedio de la Lista es: " + promedio);

        return promedio;
    }

    public List<Integer> getEnteros(){
        return enteros;
    }

}
