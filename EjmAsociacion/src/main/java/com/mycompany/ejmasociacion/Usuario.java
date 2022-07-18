/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejmasociacion;

/**
 *
 * @author juang
 */
public class Usuario {
    //atributos
    private String nombre;
    private String email;
    Producto[] productos;
    private int items;
    private int iter;
    
    //contructor
    public Usuario(){
        productos = new Producto[1];
    }
    public Usuario(String nombre,String email, int n){
        this.nombre = nombre;
        this.email = email;
        this.items = n;
        this.iter = 0;
        productos = new Producto[n];
    }
    
    //metodos 
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getEmail(){
        return this.email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    
    public Producto[] getProducto(){
        return this.productos;
    }
    public void addProducto(Producto producto){
        if(iter<items){
            this.productos[iter] = producto;
            iter++;
        }
    }
    
    public void info(){
        for(int i=0; i<iter;i++){
            System.out.println(productos[i].getNombre()+"Producto: ");
        }
    }
    
    
    
    
}
