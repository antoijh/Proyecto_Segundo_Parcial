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
import modelo.TipoUsuario;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TipoUsuarioDAO {

    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    // GUARDAR
    public boolean guardar(TipoUsuario tipo){

        String sql = "INSERT INTO TipoUsuario(NombreTipo) VALUES(?)";

        try{

            con = cn.conectar();
            ps = con.prepareStatement(sql);

            ps.setString(1, tipo.getNombreTipo());

            ps.executeUpdate();

            return true;

        }catch(SQLException e){

            System.out.println(e);

            return false;

        }

    }

    // LISTAR
    public List<TipoUsuario> listar(){

        List<TipoUsuario> lista = new ArrayList<>();

        String sql = "SELECT * FROM TipoUsuario";

        try{

            con = cn.conectar();

            ps = con.prepareStatement(sql);

            rs = ps.executeQuery();

            while(rs.next()){

                TipoUsuario tipo = new TipoUsuario();

                tipo.setIdTipo(rs.getInt("IdTipo"));
                tipo.setNombreTipo(rs.getString("NombreTipo"));

                lista.add(tipo);

            }

        }catch(SQLException e){

            System.out.println(e);

        }

        return lista;

    }
   // BUSCAR
    public TipoUsuario buscar(int id){

    TipoUsuario tipo = new TipoUsuario();

    String sql = "SELECT * FROM TipoUsuario WHERE IdTipo=?";

    try{

        con = cn.conectar();

        ps = con.prepareStatement(sql);

        ps.setInt(1, id);

        rs = ps.executeQuery();

        if(rs.next()){

            tipo.setIdTipo(rs.getInt("IdTipo"));
            tipo.setNombreTipo(rs.getString("NombreTipo"));

        }

    }catch(SQLException e){

        System.out.println(e);

    }

    return tipo;

}
    // ACTUALIZAR
public boolean actualizar(TipoUsuario tipo){

    String sql = "UPDATE TipoUsuario SET NombreTipo=? WHERE IdTipo=?";

    try{

        con = cn.conectar();

        ps = con.prepareStatement(sql);

        ps.setString(1, tipo.getNombreTipo());
        ps.setInt(2, tipo.getIdTipo());

        ps.executeUpdate();

        return true;

    }catch(SQLException e){

        System.out.println(e);

        return false;

    }

}
// ELIMINAR
    public boolean eliminar(int id){

    String sql = "DELETE FROM TipoUsuario WHERE IdTipo=?";

    try{

        con = cn.conectar();

        ps = con.prepareStatement(sql);

        ps.setInt(1,id);

        ps.executeUpdate();

        return true;

    }catch(SQLException e){

        System.out.println(e);

        return false;

    }

}
    public List<TipoUsuario> llenarCombo(){

    List<TipoUsuario> lista = new ArrayList<>();

    String sql = "SELECT * FROM TipoUsuario";

    try{

        con = cn.conectar();

        ps = con.prepareStatement(sql);

        rs = ps.executeQuery();

        while(rs.next()){

            TipoUsuario t = new TipoUsuario();

            t.setIdTipo(rs.getInt("IdTipo"));
            t.setNombreTipo(rs.getString("NombreTipo"));

            lista.add(t);

        }

    }catch(SQLException e){

        System.out.println(e);

    }

    return lista;

}
}