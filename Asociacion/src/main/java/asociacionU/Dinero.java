/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asociacionU;

/**
 *
 * @author juang
 */
public class Dinero {
    //atributos
    private float cantidad;
    //contructores
    public Dinero(){
    this.cantidad =0.0f;//inicializa el valor en 0
    }
    
    public Dinero(float cantidad){
        this.cantidad = cantidad;
    }
    
    //metodos
    public float getCantidad(){
        return this.cantidad;
    }
    public void setCantidad(float cantidad){
        this.cantidad = cantidad;
    }
    
}
