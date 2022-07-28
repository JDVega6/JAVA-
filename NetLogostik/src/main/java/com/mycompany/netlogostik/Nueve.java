/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.netlogostik;

/**
 *
 * @author juang
 */
public class Nueve {
    public int edad = 9;
    private double aceite =2.45;
    private double atun=0.7;
    private double leche = 1.1;
    private double arroz = 0.5;
    private double azucar =0.45;
    private double sal = 0.35;
    private double jamon =1.4;
    private double cafe = 2.25;
    
   public double costo(){
       double costo = 3*cafe+4*arroz+6*azucar + 2*leche +3*atun+3*sal;
       System.out.println("estoy aca "+costo);
       if(edad<10){
           System.out.println("estoy aca "+costo);
           costo = costo - costo*0.25;
       }
       else if(edad>=10 && edad<15){
           costo = costo - costo*0.20;
       }else{
           costo = costo - costo*0.18;
       }
       return costo;
   }
}
