/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.escuela;

/**
 *
 * @author juang
 */
public class Escuela {
    
      public static double salario(int x){
          if(x<=40){
              double pagoSalario = (x*0.015)*1000000;
              return pagoSalario;
          }else{
              double pagoSalario = (x*0.02)*1000000;
              return pagoSalario;
          }
    };
     public static float calcularCostoAlmacenamiento(boolean refigerado, float valorBase){
         if(refigerado == true){
                valorBase = valorBase + valorBase*0.3f;
         }else{
             valorBase = valorBase + valorBase *0.15f;
         }
         
         return valorBase;
     };

    public static void main(String[] args) {
        
//        Usuario obj = new Usuario("Juan",20);
//        System.out.println(salario(41));
        System.out.println(calcularCostoAlmacenamiento(false,1500));
//        obj.setTelefono("3112022145");
//        Estudiante est = new Estudiante("Juan");
//        est.info();
//       
    }
}
