/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.asocbidireccional;

/**
 *
 * @author juang
 */
public class Dinero {
    //atributos
    private double cantidad;
    
    //constructor
    public Dinero(){}
    
    public Dinero(double valor){
        cantidad = valor;
    }
    
    //metodos
    public void setCantidad(float valor){
        cantidad = valor;
    }
    public double getCantidad(){
        return cantidad;
    }
    
}
