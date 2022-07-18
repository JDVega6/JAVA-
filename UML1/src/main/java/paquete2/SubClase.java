/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

import paquete1.superClase;

/**
 *
 * @author juang
 */
public class SubClase extends superClase{
    //atributos
    private int attra;
    
    //metodos
    public void test(){
        
         superClase o =  new superClase();
        SubClase p = new SubClase();
        
        //para supér clases
       // System.out.println(o.attr1);
        //System.out.println(o.attr2);
        System.out.println(o.attr3);
        //System.out.println(o.attr4);
        System.out.println(o.getAttr1());
        //System.out.println(o.getalterAttr2());
        
        //
        //System.out.println(p.attr1);
        //System.out.println(p.attr2);
        System.out.println(p.attr3);
        System.out.println(p.attr4);
        System.out.println(p.attra);
        //System.out.println(o.getalterAttr2());
        System.out.println(p.getAttr1());
        
    }
    
}
