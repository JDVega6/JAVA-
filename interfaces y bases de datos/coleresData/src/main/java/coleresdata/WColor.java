/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coleresdata;
import java.util.List;
import java.util.ArrayList;
import java.sql.*;


/**
 *
 * @author juang
 */
public class WColor {
    //atributos
    private int id;
    private String nombre;
    private int red;
    private int green;
    private int blue;
    
    //constructor

    public WColor() {
    }
    
    

    //metodos
 
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getRed() {
        return red;
    }

    public void setRed(int red) {
        this.red = red;
    }

    public int getGreen() {
        return green;
    }

    public void setGreen(int green) {
        this.green = green;
    }

    public int getBlue() {
        return blue;
    }

    public void setBlue(int blue) {
        this.blue = blue;
    }
    
    public void createColor(String nombre,int red,int green, int blue){
        
        ConexionBD conn = new ConexionBD();
        String peticion = "INSERT INTO colores (nombre,red,green,blue) VALUES ('"+nombre+"','"+red+"','"+green+"','"+blue+"')";
        if(conn.setAutoCommitBD(false)){
            if(conn.insertarBD(peticion)){
                conn.commitBD();
                conn.cerrarConexion();
            }else{
                conn.rollbackBD();
                conn.cerrarConexion();
            }
        }else{
            conn.cerrarConexion();
        }
        
    }
    
    public List<WColor> readColor(){
        
        List<WColor> colores = new ArrayList<>();//
        ConexionBD conn = new ConexionBD();
        String peticion = "SELECT * FROM colores";
        ResultSet rs = conn.consultarBD(peticion);

        try {
            while(rs.next()){
                id =rs.getInt("id");
                nombre = rs.getString("nombre");
                red = rs.getInt("red");
                green = rs.getInt("green");
                blue = rs.getInt("blue");
                
                WColor color = new WColor();
                color.setId(id);
                color.setNombre(nombre);
                color.setRed(red);
                color.setGreen(green);
                color.setBlue(blue);
                colores.add(color);
                //System.out.println(id+"| R:"+red+",G:"+green+",B:"+blue+" | "+nombre);
            }
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        conn.cerrarConexion();
        return colores;
    }
    
    public void updateColor(String nombre,int red,int green,int blue,int id){
        ConexionBD conn = new ConexionBD();
        String peticion = "UPDATE colores SET nombre ='"+nombre+"', red="+red+", green="+green+", blue="+blue+ " WHERE id="+id;
        if(conn.setAutoCommitBD(false)){
            if(conn.insertarBD(peticion)){
                conn.commitBD();
                conn.cerrarConexion();
            }else{
                conn.rollbackBD();
                conn.cerrarConexion();
            }
        }else{
            conn.cerrarConexion();
        }
    }
    
    public void deleteColor(int id){
        ConexionBD conn = new ConexionBD();
        String peticion = "DELETE FROM colores WHERE id="+id;
        if(conn.setAutoCommitBD(false)){
            if(conn.insertarBD(peticion)){
                conn.commitBD();
                conn.cerrarConexion();
            }else{
                conn.rollbackBD();
                conn.cerrarConexion();
            }
        }else{
            conn.cerrarConexion();
        }
    }

    
    public String toString() {
        return id+":"+nombre + "(" + red + ","+ green + ","+ blue + ')';
    }
    public String toString2() {
        return id+":"+nombre;
    }
    
    
}
