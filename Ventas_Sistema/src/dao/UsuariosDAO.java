/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

/**
 *
 * @author shada
 */

import conexion.Conexion;
import modelo.Usuarios;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UsuariosDAO {

    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
// GUARDAR
public boolean guardar(Usuarios u){

    String sql = "INSERT INTO Usuarios(Nombre,Usuario,Contrasena,IdTipo) VALUES(?,?,?,?)";

    try{

        con = cn.conectar();

        ps = con.prepareStatement(sql);

        ps.setString(1, u.getNombre());
        ps.setString(2, u.getUsuario());
        ps.setString(3, u.getContrasena());
        ps.setInt(4, u.getIdTipo());

        ps.executeUpdate();

        return true;

    }catch(SQLException e){

        System.out.println(e);

        return false;

    }

}
}

