/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package packege;

/**
 *
 * @author juang
 */
public class variables {
    
    public static void main(String[] args){
    //Esta es la funcion principal
        System.out.println("Esta es la funcion principal");
        
    //Variables
    float temperatura;//Se define una variable
    temperatura = 45.5f;//inicializacion de una variable
        System.out.println("Temperatura: "+ temperatura + "C");
    
    long edadUniverso = 999999999999l;//datos long, enteros grandes
    
    String producto = "id 1";//Definir cadenas de texto
    
    char letra = 'J';//Para definir un caracter
    
    int numeroDeIteraciones = 4;//Se define y se inicializa
    
    int a,b,c;//Se inicializan multiples variables
    float x = 2.5f ,y=5.6f;
    
    //Creacion de instancias de clase Constantes
    constantes cte1 = new constantes();
    float temp = cte1.temperaturaAmbiente;
    int iter = cte1.ITERACIONES_MAXIMAS;
    
    constantes cte2 = new constantes();
    float temp2 = cte2.temperaturaAmbiente;
    int iter2 = cte2.ITERACIONES_MAXIMAS;
    
    
    //Cambios de tipo de variable por ensanchamiento
    //byte => short => int => long => float => double
    int aa= 5;
    long ab =aa;
    
    short da=5;
    int db = da;
    
    //estrechamiento
    double ba = 5.0;
    long bc = (long)ba;
    
    int ca = 5;
    short cb =(short)ca;
    
    //Cambio de numero a cadena de texto o al reves
    String edad2 = "24";
    int n = Integer.parseInt(edad2);
    float nn = Float.parseFloat(edad2);
        System.out.println(n);
    
    
    
    }
}
