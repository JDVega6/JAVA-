/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.pruebabasedatos;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author juang
 */
public class PruebaBaseDatos {

    public static void main(String[] args) {
        ConexionBD conn = new ConexionBD();
        String peticion = "SELECT * FROM producto WHERE id=6 ";
        ResultSet rs = conn.consultarBD(peticion);
        int id;
        String nombre;
        try{
            id = rs.getInt("id");
            nombre = rs.getString("nombre");
            System.out.println(id+", "+nombre);
            
        }catch(SQLException e){
            System.err.println(e.getMessage());
        }
        conn.cerrarConexion();
    }
}
