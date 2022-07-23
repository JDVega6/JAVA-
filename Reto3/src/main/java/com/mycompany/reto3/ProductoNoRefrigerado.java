/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.reto3;

/**
 *
 * @author juang
 */
public class ProductoNoRefrigerado extends Producto{

    //constructor
    public ProductoNoRefrigerado(String nombre, String id, double temperatura, double valorBase) {
        super(nombre, id, temperatura, valorBase);
    }

    public ProductoNoRefrigerado() {}
    
    @Override
    public double calcularCostoDeAlmacenamiento(){
        return (getValorBase()*1.1);   
    }
}
