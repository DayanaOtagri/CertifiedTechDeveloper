package com.company;

public class EmpleadoFactory {

    private static EmpleadoFactory instance;

    private EmpleadoFactory(){
    }

    public static EmpleadoFactory getInstance() {
        if(instance == null){
            instance = new EmpleadoFactory();
        }
        return instance;
    }

    public Empleado generarEmpleado(String codigo){

        switch (codigo){
            case "EMP-INT" :
                return new EmpleadoEnRelacionDeDependencia("Juan","Perez",123,1000.0);
            case "EMP-EXT" :
                return new EmpleadoContratado("Carlos","Algo",456,7.0,0.14);
        }

        return null;
    }
}
