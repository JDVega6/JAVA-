/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tallerherencia;

/**
 *
 * @author juang
 */
public class Cuenta {
    //atributos
    private double balance;
    //numero de cuenta
    private int numero;

    //constructor
    public Cuenta() {}
    public Cuenta(int numero) {
        this.balance = 0.0;
        this.numero = numero;
    }
    
    //metodos
    public void depositar(double valor){
        if(valor>0){
            balance   += valor;
        }else
            System.out.println("No se puede depositar una cantidad negativa"); 
    }
    
    public void retirar (double valor){
        if (valor>0){
            balance -= valor;
        }else
            System.out.println("");
    }

    public double getBalance() {
        return balance;
    }

    public int getNumero() {
        return numero;
    }

  
    
    

    @Override
    public String toString() {
        return "Cuenta{" +numero+ " balance=" + balance +'}';
    }
    
    public final void print(){
        System.out.println(toString());
    }
    
}
