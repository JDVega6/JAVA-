/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.instituto;

/**
 *
 * @author juang
 */
public class Usuario {
    //Atributos
    //Atributos
    public String nombre;
    public int edad;
    public String telefono;
    public String direccion;
    
    //Constructores
    public Usuario(){};//Constructor predeterminado
    public Usuario(String nombre){
        this.nombre = nombre;   
    }
    public Usuario(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
        this.telefono = "3112335669";
    }
    
    //Metodos
    public void setTelefono(String telefono){
        this.telefono = telefono;
    }
    
    public String getTelefono(){//Cuando el atributo es privado
        return this.telefono;
    }
}
