/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.administracion;

/**
 *
 * @author juang
 */
public class Cliente extends Persona{
    //atributos
    private int totalPuntos;
    private int numeroCompras;
    
    //constructor
    public Cliente(String nombre, int edad){
        super(nombre,edad);
        totalPuntos =0;
        numeroCompras = 0;
    }
    
}
