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
public class switchs {
    
    public static String composicionCorporal(){
        
        double peso, estatura,IMC;
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese el peso: ");
        peso =in.nextFloat();
        System.out.println("Ingrese la estatura: ");
        estatura =in.nextFloat();
        
        IMC= peso/Math.pow(estatura,2);
        
        IMC = Math.round(IMC*100.00)/100.00;
        
        
        if (IMC<18.5) {
            return "su IMC es: "+ IMC + " Peso inferior al normal";
        }
        else if(IMC>=18.5 && IMC<=24.9){
            return "su IMC es: "+ IMC + " Peso normal";
        }
        else if(IMC>24.9 && IMC<=29.9){
            return "su IMC es: "+ IMC + " Peso superior al normal";
        }else{
            return "su IMC es: "+ IMC + " Obesidad";
        }
    }
    
    
    
    public static void main(String[] args){
        
       int options;
       Scanner in = new Scanner(System.in);
       System.out.println("Ingresar una opcion: ");
       options = in.nextInt();
       
       switch(options){
            case 1:
               System.out.println("Hola soy "+ options);
               break;
            case 2:
               System.out.println("Hola soy "+options);
               break;
            default:
                System.out.println("Pailas papi no cogio ninguna opcion valida entonces pa juera");
                break;
       }
       
        System.out.println(composicionCorporal());
       
        
    }
}
