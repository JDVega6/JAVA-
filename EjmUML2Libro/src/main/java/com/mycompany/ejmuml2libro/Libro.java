/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejmuml2libro;

/**
 *
 * @author juang
 */
public class Libro {
    //atributos
    private String titulo;
    private String autor;
    private int ejemplares;
    private int prestados;
    
    //Constructor
    public Libro(){}
    public Libro(String Titulo, String Autor, int Ejemplares,int Prestados){
        this.titulo = Titulo;
        this.autor = Autor;
        this.ejemplares = Ejemplares;
        this.prestados = Prestados;
    }
    
    //Metodos
    public String getTitulo(){
        return this.titulo;
    }
    public void setTitulo(String titulo){
        this.titulo =titulo;
    }
    
    public String getAutor(){
        return this.autor;
    }
    public void setAutor(String autor){
        this.autor =autor;
    }
    
    public int getEjemplares(){
        return this.ejemplares;
    }
    public void setTitulo(int ejemplares){
        this.ejemplares = ejemplares;
    }
    
    public int getPrestados(){
        return this.prestados;
    }
    public void setPrestados(int prestados){
        this.prestados = prestados;
    }
    
    public boolean prestamo(){
        if(this.prestados <= this.ejemplares){
            this.prestados++;
            return true;
        }else{
        return false;
        }
    }
    
    public boolean devolucion(){
        if(this.prestados != 0){
            this.prestados--;
            return true;
        }else{
            return false;
        }
    }
    public void info(){
            System.out.println(this.titulo);
            System.out.println(this.autor);
            System.out.println(this.prestados);
            System.out.println(this.ejemplares);
    }
    
    
}
