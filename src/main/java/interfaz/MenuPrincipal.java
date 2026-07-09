package interfaz;

import java.awt.Font;
import javax.swing.*;

public class MenuPrincipal extends JFrame {

    private JLabel lblTitulo;

    private JButton btnUsuarios;
    private JButton btnClientes;
    private JButton btnCategorias;
    private JButton btnProductos;
    private JButton btnVentas;
    private JButton btnSalir;

    public MenuPrincipal() {
        initComponents();
    }

    private void initComponents() {

        setTitle("Sistema de Ventas");
        setSize(450, 420);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        setResizable(false);

        lblTitulo = new JLabel("SISTEMA DE VENTAS", SwingConstants.CENTER);
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 20));
        lblTitulo.setBounds(50, 20, 330, 30);
        add(lblTitulo);

        btnUsuarios = new JButton("Usuarios");
        btnUsuarios.setBounds(120, 80, 200, 35);
        add(btnUsuarios);

        btnClientes = new JButton("Clientes");
        btnClientes.setBounds(120, 125, 200, 35);
        add(btnClientes);

        btnCategorias = new JButton("Categorías");
        btnCategorias.setBounds(120, 170, 200, 35);
        add(btnCategorias);

        btnProductos = new JButton("Productos");
        btnProductos.setBounds(120, 215, 200, 35);
        add(btnProductos);

        btnVentas = new JButton("Ventas");
        btnVentas.setBounds(120, 260, 200, 35);
        add(btnVentas);

        btnSalir = new JButton("Salir");
        btnSalir.setBounds(120, 315, 200, 35);
        add(btnSalir);

        // Eventos
        btnUsuarios.addActionListener(e -> abrirUsuarios());

        btnClientes.addActionListener(e -> abrirClientes());

        btnCategorias.addActionListener(e -> abrirCategorias());

        btnProductos.addActionListener(e -> abrirProductos());

        btnVentas.addActionListener(e -> abrirVentas());

        btnSalir.addActionListener(e -> salir());
    }

    private void abrirUsuarios() {
        JOptionPane.showMessageDialog(this, "Abrir módulo Usuarios");
        // new FrmUsuarios().setVisible(true);
    }

    private void abrirClientes() {
        JOptionPane.showMessageDialog(this, "Abrir módulo Clientes");
        // new FrmClientes().setVisible(true);
    }

    private void abrirCategorias() {
        JOptionPane.showMessageDialog(this, "Abrir módulo Categorías");
        // new FrmCategorias().setVisible(true);
    }

    private void abrirProductos() {
        JOptionPane.showMessageDialog(this, "Abrir módulo Productos");
        // new FrmProductos().setVisible(true);
    }

    private void abrirVentas() {
        JOptionPane.showMessageDialog(this, "Abrir módulo Ventas");
        // new FrmVentas().setVisible(true);
    }

    private void salir() {

        int opcion = JOptionPane.showConfirmDialog(
                this,
                "¿Desea salir del sistema?",
                "Confirmar",
                JOptionPane.YES_NO_OPTION);

        if (opcion == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new MenuPrincipal().setVisible(true);
        });
    }
}