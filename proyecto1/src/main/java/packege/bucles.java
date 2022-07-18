/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package packege;
import java.util.Arrays;
import java.util.ArrayList;

/**
 *
 * @author juang
 */
public class bucles {
    public static void main (String[]args){
        //Ciclos for
        for(int i=0; i<5; i++){
//            System.out.print(i + ",");
    }
        System.out.println();
        
        //Ciclos for y arreglos
        int [] numero = new int[4];
        numero[0] =5;
        numero[1] =10;
        numero[2] =15;
        numero[3] =20;
        //Imprimir el arreglo
        for(int i =0; i <numero.length;i++){
            System.out.println("numero: "+ numero[i]);
        }
        //Imprimir los datos con libreria
        System.out.println(Arrays.toString(numero));
        
        //Imprimir arreglos como variables similar for in
        for(int v:numero){
            System.out.println("v: "+v);
        }
        
        //Arreglo estatico
        double [] temp ={2.4,3.4,4.4,2.3};
        //Se pueden aplicar los mismos metodos anteriores para imprimirlo
        
        //Arreglos dinamicos
        ArrayList<String> nombres = new ArrayList();
        //poblar el arreglo
        nombres.add("Juan");
        nombres.add("Diego");
        nombres.add("Vega");
        nombres.add("Guativa");
        
        System.out.println(nombres);//Se imprime el arreglo 
        
        //acceder info
        System.out.println(nombres.get(2));
        
        //Iterar
        for(String nombre:nombres){
            System.out.println(nombre);
        }
        
         /*WHILE*/
        int i=0;
        while(i<5){
            
//            System.out.print(i + "*");
            i++;
        }
        /*DO WHILE*/
        System.out.println();
        int j=0;
        do{
//            System.out.print(j+".");
            j++;
        }while(j<5);
        
        /*VECTORES*/
         System.out.println();
        int [] vec ;
                vec= new int[4];
        vec[0]  = 3;
        vec[1]  = 6;
        vec[2]  = 9;
        vec[3]  = 12;
        
        for(int x=0; x< vec.length ;x++){
//            System.out.print(vec[x]+",");
        }
    }
}
