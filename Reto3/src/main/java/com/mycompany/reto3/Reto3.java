/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.reto3;

/**
 *
 * @author juang
 */
public class Reto3 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Producto pro1 = new Producto("Jabon", "2006", 5, 10000);
        System.out.println("Costo Refrigerado: " + pro1.calcularCostoDeAlmacenamiento());
    }
}
