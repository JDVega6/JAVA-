/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejmuml;

/**
 *
 * @author juang
 */
public class EjmUML {

    public static void main(String[] args) {
        Estudiante est = new Estudiante("Juan",true);
        est.agregar_notas(5.0f, 5.0f, 4.0f);
        est.info();
        
        Estudiante est2 = new Estudiante("Diego",true);
        est2.agregar_notas(5.0f, 1.0f, 4.0f);
        est2.info();
    }
}
