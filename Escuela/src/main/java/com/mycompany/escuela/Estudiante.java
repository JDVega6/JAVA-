/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.escuela;

/**
 *
 * @author juang
 */
public class Estudiante extends Usuario{
    float [] notas= new float[3];
    
    //constructores
     public Estudiante(){};
    public Estudiante(String nombre){
        this.nombre = nombre;
    }
    //Metodos
    public void setNotas(float [] notas){
        this.notas[0] = notas[0];
        this.notas[1] = notas[1];
        this.notas[2] = notas[2];
    }
    public float[] getNotas(){
        return this.notas;
    }
    
    public void info(){
        System.out.println(this.nombre);
        System.out.println(this.edad);
        System.out.println(this.telefono);
        for(int i=0;i<notas.length;i++){
            System.out.println(this.notas[i]);
        }
    }
}
