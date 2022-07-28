/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.firstagui;
import javax.swing.*;//libreria para crear interfaces de usuario
/**
 *
 * @author juang
 */
public class FirstaGUI {
    
    

    public static void main(String[] args) {
        ExtendedJFrame frame = new ExtendedJFrame("primera ventana");//se crea el objeto
        frame.setBounds(100, 100, 400, 500);//dimensiones de la ventana
        frame.setVisible(true);//para que la ventan sea visible
        frame.setDefaultCloseOperation(ExtendedJFrame.EXIT_ON_CLOSE);//Cuando se cierre la ventana el programa se termine
        
    }
}
