/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciopracticoclabsinterfaces;

/**
 *
 * @author juang
 */
public class EmpleadoPlanta extends Empleado implements AfiliacionSindical{

    //constructor superClase
    public EmpleadoPlanta(String nombre, String apellido, float baseSalarial, int anios) {
        super(nombre, apellido, baseSalarial, anios);
    }
    
    @Override
    public double getBonoAntiguedad(){
            return getAnios()>10
                    ?getBaseSalarial()*0.1
                    :getBaseSalarial()*0.05;  
    }
    
    @Override
    public double getAportesASindicato(){
        return getAnios() > 10
                ? getBaseSalarial()*0.03
                : getBaseSalarial()*0.015;
    }
    
    @Override
    public double CalcularSalario(){
        return 2.5 * getBaseSalarial() + getBonoAntiguedad() - getAportesASindicato();
    }
}
