/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.reto2;

/**
 *
 * @author juang
 */
public class Producto {
    //atributos
    private String nombre;
    private String codigo;
    private String categoria;
    private String laboratorio;
    private boolean cotizante;
    
    //Constructor
    public Producto(String nombre, String codigo,String categoria, String laboratorio,boolean cotizante){
    this.nombre = nombre;
    this.codigo = codigo;
    this.categoria = categoria;
    this.laboratorio = laboratorio;
    this.cotizante = cotizante;
    }
    
    //metodos
    public float costo(){
        float pago;
        if(this.cotizante){
            pago=3500f; 
        }else{
            pago=14000f;
        }
        return pago;
    }
    
   public void info() {
     System.out.println("[Producto]:");   	 
     System.out.println("Nombre:" +this.nombre);
     System.out.println("Codigo: " + this.codigo);
     System.out.println("Categoria: " + this.categoria);
     System.out.println("Laboratorio: " + this.laboratorio);
     System.out.println("Precio: " + this.costo());
    }
}
