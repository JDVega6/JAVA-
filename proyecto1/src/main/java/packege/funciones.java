/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
/*
 * A partir de una temperatura de referencia determine cuando la temperatura
 * es mayor que esa temperatura de referencia, cuando es menor y cuando son
 * iguales
 */

package packege;

import java.util.Scanner;

/**
 *
 * @author bto_u
 */
public class funciones {
    public static float f2c(float tempF) {
        return (tempF - 32.0f) * 5.0f / 9.0f;
    }
    
    public static float calcularCosto(int nItems, float precioItems, float descuento){
       return (nItems*precioItems)-(nItems*precioItems)*(descuento/100.0f);
    }
    public static void main(String[] args) {
        
        int NItems;
        float PItems;
        Scanner in = new Scanner(System.in);
        System.out.println("Ingresa el numero de productos: ");
        NItems = in.nextInt();
        
        System.out.println("El costo totales: "+calcularCosto(NItems,20,51));
             
//        System.out.println(f2c(120));
//        System.out.println(f2c(70));
//        System.out.println(f2c(67));
    }
}
