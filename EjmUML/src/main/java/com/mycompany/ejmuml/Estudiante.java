/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejmuml;

/**
 *
 * @author juang
 */
public class Estudiante {
    //Atributos
    private String nombre;
    private float nota1;
    private float nota2;
    private float nota3;
    private boolean activo;
    
    //constructor
    public Estudiante(){}
    public Estudiante(String nombre, boolean activo){
        this.nombre = nombre;
        this.activo = activo;
    }
    
    //Metodos
    public void agregar_notas(float nota1,float nota2,float nota3){
        if(this.activo){
            this.nota1 = nota1;
            this.nota2 = nota2;
            this.nota3 = nota3;
        }else{
            System.out.println("El estudiante no esta activo");
        }
    }
    private float promedio(){
          if(this.activo){
              float prom = (nota1+nota2+nota3)/3;
              return prom;
            
        }else{
            return 0;
        }
    }
    
    public void info(){
        if(this.activo){
            System.out.println(this.nombre);
            System.out.println(this.promedio());
        }else{
            System.out.println("estudiante "+this.nombre+" esta inactivo");
        }  
    }
    
    
    
    
    
    
    
}
