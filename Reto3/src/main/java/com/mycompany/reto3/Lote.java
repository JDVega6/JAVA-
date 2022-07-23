/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.reto3;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author juang
 */
public class Lote {
    //atributos
    private List<Producto> productos;
    
    //constructor
    public Lote(){
        this.productos = new ArrayList<>();
    }
    
    //metodo
    public void agregarProducto(Producto p){
        productos.add(p);//se agregan productos a el arreglo
    }
    
    //

    @Override
    public String toString() {
        return "Lote{" + "productos = \n" + productos + '}';
    }
       
}
