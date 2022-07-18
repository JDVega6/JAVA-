/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.asocbidireccional;

/**
 *
 * @author juang
 */
public class AsocBidireccional {

    public static void main(String[] args) {
        Cuenta c1 = new Cuenta("Juan",1121955338,10000);
       
        c1.getBalance().setCantidad(5);
        
        
        c1.info();
    }
}
