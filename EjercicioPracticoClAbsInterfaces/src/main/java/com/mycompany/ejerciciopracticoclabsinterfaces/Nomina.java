/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciopracticoclabsinterfaces;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author juang
 */
public class Nomina {
    //atributos
    private List<Empleado> empleados;

    public Nomina() {
        this.empleados = new ArrayList<>();
    }
    
    //metodos
    public void addEmpleado(Empleado e){
        empleados.add(e);
    }
    
    public void imprimirNomina(){
        for(Empleado empleado:empleados){
            System.out.println(empleado);
        }
    }
    
    
    
    
}
