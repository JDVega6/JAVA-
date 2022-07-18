/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioPoligonos;

/**
 *
 * @author juang
 */
public class poligonos {
      //Atributos
    public int numeroLados;
    public String nombrePoligono;
    
    //Constructores
    public poligonos(){};
    public poligonos(int numeroLados){
        this.numeroLados = numeroLados;   
    }
  
    //Metodos
    public void setNumeroLados(int numeroLados){
        this.numeroLados = numeroLados;
    }
    
    public int getNumeroLados(){
        return this.numeroLados;
    }
    
     public void setNombrePoligono(String nombrePoligono){
        this.nombrePoligono = nombrePoligono;
    }
    
    public String getNombrePoligono(){
        return this.nombrePoligono;
    }
    
}
