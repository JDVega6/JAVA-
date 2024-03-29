/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciopracticoclabsinterfaces;

/**
 *
 * @author juang
 */
abstract class Empleado {
    //atributos
    private String nombre;
    private String apellido;
    private float baseSalarial;
    private int anios;

    //constructor
    public Empleado(String nombre, String apellido, float baseSalarial, int anios) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.baseSalarial = baseSalarial;
        this.anios = anios;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public float getBaseSalarial() {
        return baseSalarial;
    }

    public void setBaseSalarial(float baseSalarial) {
        this.baseSalarial = baseSalarial;
    }

    public int getAnios() {
        return anios;
    }

    public void setAnios(int anios) {
        this.anios = anios;
    }
    
    abstract double CalcularSalario();

    @Override
    public String toString() {
        return "Empleado{" + "nombre:" + nombre + ", apellido:" + apellido + ", baseSalarial:" + baseSalarial + ", anios:" + anios + '}';
    }
    
    
    

}
