/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometria;

/**
 *
 * @author juang
 */
public class Triangulo extends Poligono{
    //atributos
    private String nombre;
    
    //constructor
    public Triangulo(Punto p1,Punto p2,Punto p3){
        super(p1,p2,p3);//Se accede a el contructor de la clase superior
        nombre = "Triangulo";
    }
    
    public String getName(){
        return nombre;
    }
    
}
