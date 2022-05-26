import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import java.io.File;
import java.util.Arrays;

public class Main {

    private static final Logger logger = Logger.getLogger(Main.class);


    public static void main(String[] args) {
	// write your code here
        //Referencia al archivo dond e tenemos el .properties
        File log4jfile = new File ("./src/logging/config/log4j.properties");
        PropertyConfigurator.configure(log4jfile.getAbsolutePath());

        ListaPromedio listaPromedioMayorA5 = null;
        ListaPromedio listaPromedioMayorA10 = null;
        ListaPromedio listaPromedioMayorAVacia = null;

        try{
            listaPromedioMayorA5 = new ListaPromedio((Arrays.asList(1, 2, 3, 4, 5, 6)));
            listaPromedioMayorA5 = new ListaPromedio((Arrays.asList(1, 2, 3, 4, 5, 6,7,8,9,10,11,12)));
            listaPromedioMayorA5 = new ListaPromedio((Arrays.asList()));

        }
        catch (Exception e){
            logger.error("La lista esta vacía");
        }

    }
}
