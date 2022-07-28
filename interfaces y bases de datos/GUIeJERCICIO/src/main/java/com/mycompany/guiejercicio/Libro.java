/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.guiejercicio;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author juang
 */
public class Libro {
    //atributos
    private String nombre;
    private float precio;
    private int cantidad;
    private List<Autor> autores;

    public Libro(String nombre, float precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.autores = new ArrayList<Autor>();
    }
    
    //metodos
    public void addAutor(Autor autor){
        autores.add(autor);
    }

    @Override
    public String toString() {
        return "Libro{" + "nombre=" + nombre + ", precio=" + precio + ", cantidad=" + cantidad + ", autores=" + autores + '}';
    }
    
    
    
}
