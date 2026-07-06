/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistema_ventas;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import interfaz.Login;
/**
 *
 * @author geime
 */
public class Sistema_ventas {

    public static void main(String[] args) {
         try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException |
                 IllegalAccessException | UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }

        // Ejecuta la interfaz gráfica
        java.awt.EventQueue.invokeLater(() -> {
            Login login = new Login();
            login.setLocationRelativeTo(null); // Centra la ventana
            login.setVisible(true);
        });
    }
}
