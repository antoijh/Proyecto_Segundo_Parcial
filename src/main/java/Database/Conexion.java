/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;

/**
 *
 * @author geime
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {

    // Cambia estos datos por los de tu servidor MySQL
    private static final String URL = "jdbc:mysql://localhost:3306/sistemaventas";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    private Connection conexion;

    public Connection getConnection() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            conexion = DriverManager.getConnection(URL, USER, PASSWORD);

            System.out.println("Conexión exitosa a la base de datos.");

        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null,
                    "No se encontró el Driver de MySQL.\n" + e.getMessage());

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,
                    "Error al conectar con la base de datos.\n" + e.getMessage());
        }

        return conexion;
    }

    public void cerrarConexion() {
        try {
            if (conexion != null && !conexion.isClosed()) {
                conexion.close();
                System.out.println("Conexión cerrada.");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,
                    "Error al cerrar la conexión.\n" + e.getMessage());
        }
    }
}
