/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.netlogostik;

import java.util.Scanner;

/**
 *
 * @author juang
 */
public class Operacion {
     public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        int n; 
        int x;
        
        System.out.println("Cantidad de numeros a ingresar : ");
        n = sc.nextInt();
        int[] numeros = new int[n];
        for (int i=0;i<=n-1;i++){
            System.out.println("Introduzca numero ["+i+"]: ");
            x = sc.nextInt();
            numeros[i] = x;
        }
        System.out.println("------------------------");
        for(int j=0;j<=n-1;j++){
            System.out.println(numeros[j]+"\n");
        }
    }  
}
