/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

/**
 *
 * @author juang
 */
public class Ventana {
    //atributos
    private Cabecera titulo;
    private Panel cuerpo;
    private ScrollBar[] barras;
    
    //constructor
    Ventana(){
        titulo = new Cabecera();
        cuerpo = new Panel();
        barras = new ScrollBar[2];
    }
    
    
}
