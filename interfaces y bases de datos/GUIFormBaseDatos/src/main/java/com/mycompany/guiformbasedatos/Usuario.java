/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.guiformbasedatos;

import java.sql.*;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author juang
 */
public class Usuario {
    //atributos
    private int id;
    private String nombre;
    private String apellido;
    private int edad;
    private String email;

    //constructor
    public Usuario() {
    }

    //getters and setters
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    //metodos
    public boolean createUsuario(){
        
        String peticion = "INSERT INTO usuarios (nombre,apellido,edad,email) "
                + "VALUES ('"+nombre+"','"+apellido+"',"+edad+",'"+email+"')";
        ConexionBD conn = new ConexionBD();
        if(conn.setAutoCommitBD(false)){
            if(conn.insertarBD(peticion)){
                conn.commitBD();
                conn.cerrarConexion();
                return true;
            }else{
                conn.rollbackBD();
                conn.cerrarConexion();
                return false;
            }
        }else{
            conn.cerrarConexion();
            return false;
        }
    }
    
    public List<Usuario> readUsuario(){
        List<Usuario> usr = new ArrayList<>();
        ConexionBD conn = new ConexionBD();
        String peticion = "SELECT * FROM usuarios";
        ResultSet rs = conn.consultarBD(peticion);
        
        try{
            while(rs.next()){
                id = rs.getInt("id");
                nombre = rs.getString("nombre");
                apellido = rs.getString("apellido");
                edad = rs.getInt("edad");
                email = rs.getString("email");
                
                Usuario u = new Usuario();
                u.setId(id);
                u.setNombre(nombre);
                u.setApellido(apellido);
                u.setEdad(edad);
                u.setEmail(email);
                usr.add(u);
                
            }
        }catch(SQLException e){
            System.err.println(e.getMessage());
        }
        conn.cerrarConexion();
        return usr;
    }
    
    public void updateUsuario(int id, String nombre,String apellido,int edad,String email){
        ConexionBD conn = new ConexionBD();
        String peticion = "UPDATE usuarios SET "
                + "nombre='"+nombre+"', "
                + "apellido='"+apellido+"', "
                + "edad="+edad+", "
                + "email='"+email+"' "
                + "WHERE id="+id;
        
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
    
    
    public void deleteUsuario(int id){
        ConexionBD conn = new ConexionBD();
        String peticion = "DELETE FROM usuarios WHERE id="+id;
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
    
}
