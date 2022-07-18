/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejmuml2libro;

/**
 *
 * @author juang
 */
public class EjmUML2Libro {

    public static void main(String[] args) {
        Libro lib = new Libro("Viaje a el centro de la tierra","Julio verne",5,2);
        lib.info();
        lib.devolucion();
        lib.info();
        lib.devolucion();
        lib.info();
        lib.devolucion();
        lib.info();
        lib.prestamo();
        lib.info();
    }
}
