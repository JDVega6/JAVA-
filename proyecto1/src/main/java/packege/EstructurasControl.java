
package packege;
import java.util.Scanner;

public class EstructurasControl {
    
        public static int si(){
             Scanner in = new Scanner(System.in);
    System.out.println("Ingrese la edad: ");
    int edad = in.nextInt();
    if(edad >=18)
    {
        System.out.println("Es mayor de edad: "+edad);
//        System.out.println(((Object)edad).getClass().getName());
    }
    else
    {
        System.out.println("NO es mayor de edad: "+edad);
//        System.out.println(((Object)edad).getClass().getName());   
    }
    return edad;
}
        
    
    
    public static void main(String[] args) {
 
  
      si();//Como implementar un if
      
    }
    
    
    
}
