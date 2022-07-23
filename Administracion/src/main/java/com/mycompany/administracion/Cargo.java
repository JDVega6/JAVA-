/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.administracion;

/**
 *
 * @author juang
 */
public class Cargo {
    private String nombre;
    private float salario;
    
    //constructor
    public Cargo(String nombre){
        this.nombre = nombre;
        if(null != nombre)
            switch (nombre) {
            case "Gerente":
                this.salario = 10000000;
                break;
            case "Diseñador":
                this.salario = 5000000;
                break;
            case "Desarrollador":
                this.salario = 6000000;
                break;
            default:
                break;
        }
    }
    
}
