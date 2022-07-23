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
public class Farmacia {
    private String nit;
    private String nombre;
    private String direccion;
    public List<Almacen> almacenes;
    
    public Farmacia(String nit, String nombre,String direccion){
        this.nit = nit;
        this.nombre = nombre;
        this.direccion = direccion;
        this.almacenes = new ArrayList<>();
    }
    
    public void agregarAlmacen(Almacen almacen){
        almacenes.add(almacen);
    }
    
    public void agregarProductos(String codigoAlmacen, Producto p){
        for(Almacen almacen:almacenes){
            if(almacen.getCodigo().equals(codigoAlmacen)){
                almacen.agregarProducto(p);
            }
        }
    }

    @Override
    public String toString() {
        return "Farmacia{" + "nit=" + nit + ", nombre=" + nombre + ", direccion=" + direccion + ", almacenes="+"\n" + almacenes + '}';
    }
    
    
}
