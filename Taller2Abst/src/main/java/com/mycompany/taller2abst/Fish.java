/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller2abst;

/**
 *
 * @author juang
 */
public class Fish extends Animal{
    private String name;

    public Fish(String name) {
        super(0);
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public void play(){
        System.out.println("play....Fish");
    }
    
    @Override
    public void eat(){
        System.out.println("Fish a comer.");
    }
    
    public void walk(){
        System.out.println("Fish a comer.");
    }
    
}
