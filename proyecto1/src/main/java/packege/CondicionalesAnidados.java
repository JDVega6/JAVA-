/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package packege;

import java.util.Scanner;
import java.lang.Math;




/**
 *
 * @author juang
 */
public class CondicionalesAnidados {
     public static void main(String[] args) {
     
     int productosInventario = 20, productosComprar, numeroPaquetes;
      Scanner in = new Scanner(System.in);
    System.out.println("Ingrese el numero de productos a comprar: ");
    productosComprar = in.nextInt();
         
     
    if(productosComprar > productosInventario){
        
        int productosFaltantes = productosComprar - productosInventario;
        productosInventario = productosInventario + productosFaltantes;
        System.out.println("Hay "+productosInventario+"productos en inventario,Se solicita ingresar "+productosFaltantes+" productos en almacen");
    }
    else if(productosComprar < productosInventario){
       
        numeroPaquetes = (int)Math.ceil(productosComprar / 4.0);//para tomar el valor entero mayor 
        System.out.println("Se requieren: "+ numeroPaquetes + " paquetes");
    } 
     }
}
