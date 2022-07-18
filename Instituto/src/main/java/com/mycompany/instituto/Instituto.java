/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.instituto;

import java.util.Scanner;
import java.util.ArrayList;//Se importa la libreria para crear arreglos dinamicos

/**
 *
 * @author juang
 */
public class Instituto {

    public static void main(String[] args) {
        
        Usuario obj = new Usuario("Luisa",24);
        obj.setTelefono("311 20 22 145");
        
         System.out.println(obj.nombre);
        System.out.println(obj.telefono);
        
        Usuario[] listaUsuariosEstatica =new Usuario[10];//Arreglos estaticos
        ArrayList<Usuario> listaUsuarioDinamica = new ArrayList<Usuario>();//El tamaño es variable
        listaUsuarioDinamica.add(obj);
        
        Estudiante est = new Estudiante("Juan");
        est.setTelefono("311 20 22 145");
        est.setNotas(3.9f,4.5f,5.0f);
        est.info();
        
        Profesor prf = new Profesor("Juan","Matematicas");
        prf.setTelefono("311 45 12 759");
        
//        obj.nombre ="julia";
        
        
       
    }
}
