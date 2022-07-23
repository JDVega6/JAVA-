/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tellerclaseabstractaeinterfaces;

/**
 *
 * @author juang
 */
public class TellerClaseAbstractaEInterfaces {

    public static void main(String[] args) {
        Telefono obj;
        obj = new TelefonInteligente();//polimorfismo
        
        TV tv = new TV();
        tv.encender();
        tv.apagar();
        tv.netflix();
    }
}
