

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller2abst;

/**
 *
 * @author juang
 */
public class Cat extends Animal implements Pet{
    //atributos
    private String name;
    
    //constructor
    public Cat(String name) {
        super(4);
        this.name = name;
    }
    
    //metodos
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public void play(){
        System.out.println("play....cat");
    }
    
    @Override
    public void eat(){
        System.out.println("Cat a comer.");
    }
    
}
