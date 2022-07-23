/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller2abst;

/**
 *
 * @author juang
 */
public abstract class Animal {
    //atributos
    protected int legs;
    
    //constructor

    protected Animal(int legs) {
        this.legs = legs;
    }
    
    public void walk(){
        System.out.println("Camina...");
    };
    public abstract void eat();
}
