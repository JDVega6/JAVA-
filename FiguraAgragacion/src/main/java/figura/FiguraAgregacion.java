/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package figura;
import geometria.*;

/**
 *
 * @author juang
 */
public class FiguraAgregacion {

    public static void main(String[] args) {
        Punto p1 = new Punto(2,3);
        Punto p2 = new Punto(0,3);
        Punto p3 = new Punto(4,3);
        Punto p4 = new Punto(4,5);
        
        Poligono pol1 = new Poligono(p1, p2, p3);
        Poligono pol2 = new Poligono(p1, p2, p3,p4);
        
        System.out.println("x: " + pol1.getPuntos()[1].getX());
        System.out.println("y: " + pol1.getPuntos()[1].getY());
        
    }
}
