/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package packege;

import java.util.Scanner;

/**
 *
 * @author juang
 */
public class Prueba {
        public static void main(String[] args) {
            
            /*CONTROL DE TEMPERATURA*/
            
            float temp,refTemp=30;
            Scanner in = new Scanner(System.in);
            System.out.println("Ingresar la temperatura: ");
            temp = in.nextInt();
              
            if(temp<refTemp)
                System.out.println(temp+" es menor que "+refTemp);
            else if (temp>refTemp)
                System.out.println(temp+" Es mayor que "+refTemp);
            else
                System.out.println(temp+" Es igual que "+refTemp);
            
            
//            int numero, a =5;
//            if(a<5)
//                numero =10;
//            else
//                numero = 5;
//            
//            /*PARA SIMPLIFICAR LAS ANTERIORES CONDICIONES SE PUEDE HACER DE LA SIGUIENTE MANERA:*/
//            numero = a<5 ? 10:5;
//            System.out.println(numero);
            
 
        }
}
