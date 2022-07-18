/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package packege;

import java.util.Scanner;// se importa la libreria

/**
 *
 * @author juang
 */
public class ImprimirNombre {
      public static void main(String[] args) {
        //Definir una instancia de scaner
        Scanner in = new Scanner(System.in);//Se inicializa la instancia Scanner
     
        System.out.println("Ingrese su nombre:");//Para imprimir un aviso antes de solicitar la entrada por teclado
        String nombre =in.nextLine();//Se recolecta info por teclado
        System.out.println("Su nombre es: "+nombre);
        
        System.out.println("Ingrese su edad:");//Para imprimir un aviso antes de solicitar la entrada por teclado
        int age =in.nextInt();//Se recolecta info por teclado
        System.out.println("Su edad es: "+age);
        
        
        System.out.println(((Object)nombre).getClass().getName());//
    }
}
