/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asociacionU;

/**
 *
 * @author juang
 */
public class Cuenta {
    private Dinero balance;//Se  pone el tipo de dato como la clase
    
    //constructores
    public Cuenta(){
        //se inicializa el valor en 0.0
     balance = new Dinero();//Se inicializa la variable "balance de la otra clase
     
    }
    public Cuenta(float cantidad){
        balance = new Dinero(cantidad);//Se crea el constructor para recibir una entrada
    }
    
    //metodos
    public void ingresar(float cantidad){
        float cantidadActualizada = balance.getCantidad() + cantidad;
        System.out.println("Ingreso: $" + cantidad);
        balance.setCantidad(cantidadActualizada);
    }
    
    public void retirar(float cantidad){
        if(balance.getCantidad() >= cantidad){
            float cantidadActualizada = balance.getCantidad() - cantidad;
            System.out.println("Retiro: $"+ cantidad);
            balance.setCantidad(cantidadActualizada);
        }else{
            System.out.println("La cantidad de dinero en la cuenta es insuficiente");
        }
    }
    
    public void info(){
        System.out.println("<---------------------------------------->");
        System.out.println("Balance: $"+ balance.getCantidad());
        System.out.println("<---------------------------------------->");
    }
    
    
    
    
    
}
