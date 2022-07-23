/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package figura;

import geometria.Poligono;
import geometria.Punto;
import geometria.Triangulo;

/**
 *
 * @author juang
 */
public class FiguraHerencia {

    public static void main(String[] args) {
            Punto p1 = new Punto(2,3);
        Punto p2 = new Punto(0,3);
        Punto p3 = new Punto(4,3);
        Punto p4 = new Punto(4,5);
        
        Triangulo tri1 = new Triangulo(p1, p2, p3);
        Poligono pol2 = new Poligono(p1, p2, p3,p4);
        
        //impresion de la info ejemplo AGREGACION
        System.out.println("x: " + pol2.getPuntos()[1].getX());
        System.out.println("y: " + pol2.getPuntos()[1].getY());
        
        //impresion de la info ejemplo HERENCIA
        System.out.println(tri1.getPuntos()[1].getX());
        for (Punto pt : tri1.getPuntos()){
            System.out.println("X: "+pt.getX());
            System.out.println("Y: "+pt.getY());
        }
    }
}
