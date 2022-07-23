/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tallerherencia;

/**
 *
 * @author juang
 */
public class TallerHerencia {

    public static void main(String[] args) {
        
        Banco bbva = new Banco();
        bbva.abrir(1111);
        bbva.abrir(1112);
        bbva.abrir(1113);
        
        bbva.consignar(1113, 10000);
        
        bbva.showCuentas();
    }
}
