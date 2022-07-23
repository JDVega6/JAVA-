/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.administracion;

/**
 *
 * @author juang
 */
public class Administracion {

    public static void main(String[] args) {
        Empresa empresa = new Empresa("Ferreteria la esperanza");
        Cargo c1 = new Cargo("Desarrollador");
        Empleado emp1 = new Empleado("Juan",24,c1);
    }
}
