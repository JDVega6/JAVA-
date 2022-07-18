/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejmasociacion;

/**
 *
 * @author juang
 */
public class EjmAsociacion {

    public static void main(String[] args) {
        Usuario usr = new Usuario("Juan","juan@gmail.com",3);
        Producto mesa = new Producto("mesa de centro", 10000);
        Producto tablero = new Producto("Tablero", 20000);
              
        usr.addProducto(mesa);
        usr.addProducto(tablero);
        usr.info();
    }
}
