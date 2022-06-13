package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        EmpleadoFactory empleadoFactory = EmpleadoFactory.getInstance();

//        EmpleadoFactory empleadoFactory1 = EmpleadoFactory.getInstance();
//
//        System.out.println(empleadoFactory.equals(empleadoFactory1));


        Empresa empresa = new Empresa("Frailejón SA");

        empresa.agregarEmpleado(empleadoFactory.generarEmpleado("EMP-EXT"));
        empresa.agregarEmpleado(empleadoFactory.generarEmpleado("EMP-EXT"));
        empresa.agregarEmpleado(empleadoFactory.generarEmpleado("EMP-EXT"));
        empresa.agregarEmpleado(empleadoFactory.generarEmpleado("EMP-INT"));
        empresa.agregarEmpleado(empleadoFactory.generarEmpleado("EMP-INT"));
        empresa.agregarEmpleado(empleadoFactory.generarEmpleado("EMP-INT"));
        empresa.agregarEmpleado(empleadoFactory.generarEmpleado("EMP-INT"));

        System.out.println(empresa.calcularSueldosTotales(30));

    }
}
