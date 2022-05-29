import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Empleado {

    // Conectarse al Drive y retorna la conexión con la base de datos
    public static Connection getConnection() throws Exception {
        Class.forName("org.h2.Driver").newInstance();
        return DriverManager.getConnection("jdbc:h2:~/test", "username", "password");

    }

    // Atributo String que tiene como nombre SQL_CREATE_TABLE y crea la tabla
    // Solo accesible para cualquier objeto que sea instancia de Test.java(clase que la contiene)
    private static final String SQL_CREATE_TABLE = "DROP TABLE IF EXISTS EMPLEADO; CREATE TABLE EMPLEADO "
            + "("
            + " ID INT PRIMARY KEY,"
            + " NOMBRE varchar(100) NOT NULL, "
            + " EMPRESA varchar(100) NOT NULL, "
            + " EDAD INT NOT NULL,"
            + " FECHA_INICIO varchar(100) NOT NULL,"
            + " SUELDO INT NOT NULL"
            + " )";


    // Para insertar 3
    private static final String SQL_INSERT1 = "INSERT INTO EMPLEADO (ID, NOMBRE, EMPRESA, EDAD, FECHA_INICIO, SUELDO) VALUES (1,'Javier','Digital',28,'12/10/2020',100)";
    private static final String SQL_INSERT2 = "INSERT INTO EMPLEADO (ID, NOMBRE, EMPRESA, EDAD, FECHA_INICIO, SUELDO) VALUES (2,'Pepe','Facebook',40,'09/11/2020',100)";
    private static final String SQL_INSERT3 = "INSERT INTO EMPLEADO (ID, NOMBRE, EMPRESA, EDAD, FECHA_INICIO, SUELDO) VALUES (2,'Diego','Google',33,'12/20/2021',100)";


    public static void main(String[] args) throws Exception{

        //Establece la conexión con la base de datos
        Connection connection = null;

        // Dentro de un try se crea la conexion porque puede generar excepciones
        try{
            // Crea la Conexión
            connection= getConnection();

            // Crea el objeto Statemt que permite ejecutar consultas
            Statement statement = connection.createStatement();
            statement.execute(SQL_CREATE_TABLE);

            // Agrega datos a la tabla
            Statement stat1 = connection.createStatement();
            stat1.execute(SQL_INSERT1);

            Statement stat2 = connection.createStatement();
            stat2.execute(SQL_INSERT2);

            Statement stat3 = connection.createStatement();
            // (execute) valor que ejecuto e inserto en la base
            stat3.execute(SQL_INSERT3);



            // Recupera todos los empleados
            String sql = "SELECT * FROM EMPELADO";

            Statement sqlsmt = connection.createStatement();

            // En este se ejectuta el select (String sql de arriba)
            // (executeQuery)metodo de un statment
            ResultSet resultado = sqlsmt.executeQuery(sql);


            // Mostrar valores por pantalla
            // Bucle que recorre lo guardado en "ResultSet" el .next va pasando de dato en dato
            while (resultado.next()) {
                System.out.println(resultado.getInt(1) + resultado.getString(2) + resultado.getString(3) + resultado.getInt(4) + resultado.getString(5)+ resultado.getString(6));
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            connection.close();
        }
    }
}

