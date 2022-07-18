/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.instituto;

/**
 *
 * @author juang
 */
public class Profesor extends Usuario{
    public float salario;
    public String curso;
    
    public Profesor(){}
    public Profesor(String nombre,String curso){
        this.nombre = nombre;
        this.curso =curso;
    }
}
