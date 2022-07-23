/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tallerherencia;

/**
 *
 * @author juang
 */
public class CuentaAhorros extends Cuenta{
    //atributos
    private double InteresVariable;

    //constructor
    public CuentaAhorros(int numero) {
        super(numero);
    }
 
    //metodo
    public void setInteresVariable(double InteresVariable) {
        this.InteresVariable = InteresVariable;
    }
}
