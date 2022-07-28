/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.guiejercicio;

/**
 *
 * @author juang
 */
public class GUIEjercicio {

    public static void main(String[] args) {
        Libro libro = new Libro("Farenheit 456",50000,10);
        Autor A1 = new Autor("Jhon", 48, "jhon@gmail.com", "Alemania");
        Autor A2 = new Autor("Sthephen King", 57, "king@gmail.com", "belgica");
        System.out.println(libro);
    }
}
