/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometria;

/**
 *
 * @author juang
 */
public class Poligono {
    private int nPuntos;
    private Punto[] puntos;
    
    //contructores
    public Poligono (Punto p1,Punto p2,Punto p3){
        nPuntos = 3;
        puntos = new Punto[nPuntos];
        puntos[0] =p1;
        puntos[1] =p2;
        puntos[2] =p3; 
    }
    
      public Poligono (Punto p1,Punto p2,Punto p3,Punto p4){
        nPuntos = 4;
        puntos = new Punto[nPuntos];
        puntos[0] =p1;
        puntos[1] =p2;
        puntos[2] =p3; 
        puntos[3] =p4;
    }
      
    public Punto[] getPuntos(){
        return puntos;
    }
    
    
}
