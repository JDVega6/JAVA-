/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package asociacionU;

/**
 *
 * @author juang
 */
public class Asociacion {

    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta(20000);
        cuenta.info();
        //"ingresamos" dinero a la cuenta
        cuenta.ingresar(50000);
        //"retiramos" dinero de la cuenta
        cuenta.retirar(100000);
        //imprime la info de la cuenta 
        cuenta.info();
        
    }
}
