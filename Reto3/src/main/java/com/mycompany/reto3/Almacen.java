/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.reto3;

/**
 *
 * @author juang
 */
public class Almacen {
    //atributos
    private String codigo;
    private String nombre;
    private Lote lote;
    
    //contructor
    public Almacen(String codigo,String nombre){
        this.codigo = codigo;
        this.nombre = nombre;
        this.lote = new Lote();
    }
    
    //metodos
    public void agregarProducto(Producto p){
     lote.agregarProducto(p);
    }

    @Override
    public String toString() {
        return "\nAlmacen{" + "codigo=" + codigo + ", nombre=" + nombre + ", lote="+ "\n" + lote + '}';
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public Lote getLote() {
        return lote;
    }
    
    
    
}
