/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tallerherencia;

/**
 *
 * @author juang
 */
public class Banco {
    //atributos
    private static final int MAX_NUMERO_CUENTAS = 3;
    private Cuenta[] cuentas;
    private int numeroCuentas;

    //contructor
    public Banco() {
        this.cuentas = new Cuenta[MAX_NUMERO_CUENTAS];
        this.numeroCuentas = 0;
    }
    
    //metodos
    public void abrir(int numero){
        if(numeroCuentas<MAX_NUMERO_CUENTAS){
            Cuenta cuenta = new Cuenta(numero);
           cuentas[numeroCuentas] = cuenta;
           numeroCuentas++;
//            System.out.println("Se creo su cuenta #"+numeroCuentas+" con exito");
        }else
            System.out.println("No se pueden crear mas cuentas!!!");
    }
    
    public void consignar(int a, double valor){
        int aux = 0;
        for(int i=0; i<numeroCuentas;i++){
            if(cuentas[i].getNumero() == a){
                cuentas[i].depositar(valor);
                aux =1;
            }
        }
        if(aux==0){
         System.out.println("El numero de cuenta no se encuenta registrado");
        }else
             System.out.println("Transaccion exitosa");
    }
    
    public void showCuentas(){
        for(int i=0; i<numeroCuentas;i++){
            System.out.println(">----------------------<");
            cuentas[i].print();
            
        }
    }

  

    
}
