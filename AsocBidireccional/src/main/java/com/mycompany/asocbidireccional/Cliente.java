/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.asocbidireccional;

/**
 *
 * @author juang
 */
public class Cliente {
    private String nombre;
    private long id;
    private Cuenta[] cuentas;
    public static final int MAX_CUENTAS = 3;
    private int total_cuentas = 0;
    
    //constructor
    public Cliente(String nombre, long id){
        this.nombre = nombre;
        this.id = id;
        cuentas = new Cuenta[MAX_CUENTAS];
    }

   
    
    //metodos
    public void agregarCuenta(Cuenta c){
        if(total_cuentas <3){
            cuentas[total_cuentas] = c;
            total_cuentas++;
        }else{
            System.out.println("excede el numero de cuentas!!");
        }
    }
    
    public Cuenta[] getCuentas(){
        return cuentas;
    }
    public String getNombre(){
        return nombre;
    }
    
}
