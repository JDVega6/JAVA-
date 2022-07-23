/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciopracticoclabsinterfaces;

/**
 *
 * @author juang
 */
public class EmpleadoTemporal extends Empleado{

    public EmpleadoTemporal(String nombre, String apellido, float baseSalarial, int anios) {
        super(nombre, apellido, baseSalarial, anios);
    }
    
    @Override
    public double CalcularSalario(){     
        double salario = 2.5 * getBaseSalarial() - getBaseSalarial()*0.286;
        return salario;
     }

}
