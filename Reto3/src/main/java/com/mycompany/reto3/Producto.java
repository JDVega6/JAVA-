/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.reto3;

/**
 *
 * @author juang
 */
public class Producto {
    //atributos
    protected String nombre;
    protected String id;
    protected double temperatura;
    protected double valorBase;
    
    //constructor
    
    public Producto(String nombre, String id,double temperatura,double valorBase){
        this.nombre = nombre;
        this.id = id;
        this.temperatura = temperatura;
        this.valorBase = valorBase;
    }
    public Producto(){}
    
    //metodos
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
     public String getId(){
        return this.id;
    }
    public void setId(String id){
        this.id = id;
    }
    
    public double getTemperatura(){
        return this.temperatura;
    }
    public void setTemperatura(double temperatura){
        this.temperatura = temperatura;
    }
    
    public double getValorBase(){
        return this.valorBase;
    }
    public void setValorBase(double valorBase){
        this.valorBase = valorBase;
    }
    
    public double calcularCostoDeAlmacenamiento(){
        
//        double costo=0;
//        if(this.temperatura >= 0 && this.temperatura <= 20){
//            ProductoRefrigerado.
//        }
        return 20;
    }

    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + ", id=" + id + ", temperatura=" + temperatura + ", valorBase=" + valorBase + '}';
    }
    
    
    
}
