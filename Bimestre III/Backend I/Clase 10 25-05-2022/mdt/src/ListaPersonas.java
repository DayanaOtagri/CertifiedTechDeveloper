import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class ListaPersonas {

    // Atributo static final: NO MODIFICABLE
    private static final Logger logger = Logger.getLogger(ListaPersonas.class);

    private List<Persona> personas = new ArrayList<>();

    public ListaPersonas(List<Persona> personas) throws  Exception{
        this.personas = personas;



    }
}
