package com.dh.odontologos.dao.impl;

import com.dh.odontologos.model.Odontologo;
import org.apache.log4j.Logger;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class OdontologoDaoH2 implements IDao<Odontologo> {

    private final static String DB_JDBC_DRIVER = "org.h2.Driver";
    // Esta instrucción ejecuta el script sql cuando se conecta a la base
    private final static String DB_URL = "jdbc:h2:~/test;INIT=RUNSCRIPT FROM 'create.sql'";
    private final static String DB_USER ="";
    private final static String DB_PASSWORD = "";

    final static Logger log = Logger.getLogger(OdontologoDaoH2.class);

    // Implementación de los métodos de IDao
    @Override
    public Odontologo guardar(Odontologo odontologo) {

        log.debug("Registrando un nuevo odontologo: "+ odontologo.toString());

        // Conexión a la base de datos
        Connection connection = null;
        PreparedStatement preparedStatement = null;


        try{
            // Hace el driver y Conecta
            Class.forName(DB_JDBC_DRIVER);
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

            // Crea una sentencia
            // No se le agrega id, ya que este es autoincremental en sql
            preparedStatement = connection.prepareStatement("INSERT INTO odontologos(apellido, nombre, nroMatricula) VALUES(?,?,?)");

            // Inserta los datos que queremos en la tabla
            preparedStatement.setString(1, odontologo.getApellido());
            preparedStatement.setString(2, odontologo.getNombre());
            preparedStatement.setString(3, odontologo.getNroMatricula());

            // Se Ejecuta una sentencia SQL
            preparedStatement.executeUpdate();
            // Cierra
            preparedStatement.close();


        }
        catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
        }
        return odontologo;
    }

    @Override
    public List buscarTodos() throws SQLException {

        // Conexión a la base de datos
        Connection connection = null;
        PreparedStatement preparedStatement = null;


        // Crea la lista
        List<Odontologo> odontologos = new ArrayList<>();

        try {
            Class.forName(DB_JDBC_DRIVER);
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

            // Sentencia que trae todos los odontologos
            preparedStatement = connection.prepareStatement("SELECT * FROM odontologos");
            // La variable result guarda la ejecucuon de la sentencia
            ResultSet result = preparedStatement.executeQuery();

            while (result.next()) {
                // Long idPaciente = result.getLong("id");
                String apellido = result.getString("apellido");
                String nombre = result.getString("nombre");
                String nroMatricula = result.getString("nroMatricula");
                Odontologo odontologo = new Odontologo(apellido, nombre, nroMatricula);


                odontologos.add(odontologo);
            }

            // Cierra
            preparedStatement.close();
        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


        return odontologos;
    }

    @Override
    public void eliminar(Integer id){

        log.debug("Eliminando odontologo con id : "+id);

        //Creando Conexión
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        Odontologo odontologo = null;

        try {
            // Hace el driver y Conecta
            Class.forName(DB_JDBC_DRIVER);
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

            //Crea una sentencia
            preparedStatement = connection.prepareStatement("DELETE FROM odontologos where id = ?");
            preparedStatement.setInt(1,id);

            //Ejecuta la sentencia SQL
            preparedStatement.executeUpdate();
            //Cierra
            preparedStatement.close();

        } catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
        }
    }
}
