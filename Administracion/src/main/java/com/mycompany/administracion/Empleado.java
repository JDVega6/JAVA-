/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.administracion;

/**
 *
 * @author juang
 */
public class Empleado extends Persona{
    //atributos
    private Cargo cargo;
    
    //constructor
    public Empleado(String nombre, int edad,Cargo cargo){
        super(nombre, edad);
        this.cargo= cargo;
    }
    
    //metodos
    public Cargo getCargo(){
        return this.cargo;
    }
}
