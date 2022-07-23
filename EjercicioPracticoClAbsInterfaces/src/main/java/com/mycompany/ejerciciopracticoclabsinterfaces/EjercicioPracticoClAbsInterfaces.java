/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejerciciopracticoclabsinterfaces;

/**
 *
 * @author juang
 */
public class EjercicioPracticoClAbsInterfaces {

    public static void main(String[] args) {
        Nomina nomina = new Nomina();
        Empleado empleado;
        empleado = new EmpleadoPlanta("Juan", "vega", 10000000, 1);
        nomina.addEmpleado(empleado);
        empleado = new EmpleadoTemporal("Esteban", "gonzalez", 8000000, 0);
        nomina.addEmpleado(empleado);
        nomina.imprimirNomina();
    }
}
