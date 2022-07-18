/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.asocbidireccional;

/**
 *
 * @author juang
 */
public class Cuenta {
    private Dinero balance;
//    private Dinero balance = new Dinero(0.0);//si no se quiere inicializar el constructor, se puede cambiar por esto
    private double limite;
    private Cliente titular;
    
    //constructor
    public Cuenta(){}
    public Cuenta(String nombre,long id,double valor){
        balance = new Dinero(valor);
        titular = new Cliente(nombre,id);
        
    }
    
    //metodo
    public Dinero getBalance(){
        return balance;
    }
    
    public Cliente getCliente(){
        return titular; 
    }
    
     public void info(){
        System.out.println("<---------------------------------------->");
        System.out.println("Balance: $"+ balance.getCantidad());
        System.out.println("<---------------------------------------->");
    }
    
    
}
