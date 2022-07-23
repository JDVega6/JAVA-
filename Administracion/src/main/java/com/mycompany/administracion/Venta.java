/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.administracion;



/**
 *
 * @author juang
 */
public class Venta {
    //atributos
    private Empleado empleado;
    private Cliente cliente;
    private Producto[] listaProductos;
    
    //constructor
    //metodo
    public Producto[] getProductos(){
        return this.listaProductos;
    }
}
