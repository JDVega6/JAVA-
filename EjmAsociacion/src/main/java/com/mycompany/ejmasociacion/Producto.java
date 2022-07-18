/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejmasociacion;

/**
 *
 * @author juang
 */
public class Producto {
    //atributos
    private String nombre;
    private float precio;
    
    //contructor
    public Producto(String nombre , float precio){
        this.nombre = nombre;
        this.precio = precio;
    }
    
    //metodos
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
     public float getPrecio(){
        return this.precio;
    }
    public void setPrecio(float precio){
        this.precio = precio;
    }
    
}
