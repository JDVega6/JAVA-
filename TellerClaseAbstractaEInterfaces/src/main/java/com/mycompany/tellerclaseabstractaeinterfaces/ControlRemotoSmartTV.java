/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.tellerclaseabstractaeinterfaces;

/**
 *
 * @author juang
 */
public interface ControlRemotoSmartTV extends ControlRemotoTV{
    
    default void netfilx(){
        System.out.println("Abre netflix.");
    };
    
}
