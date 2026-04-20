package org.example.Vista;

import javax.swing.*;
import java.awt.*;

public class InterfazGestionClientes extends JFrame {

    public InterfazGestionClientes() {

        setTitle("interfaz gestion clientes");
        setSize(640, 480);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centrar en pantalla
        setVisible(true);
        setResizable(false);

        JPanel panel = new JPanel(new GridLayout(2, 1, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(40, 40, 40, 40));

        JButton verClientes = new JButton("ver clientes");
        JButton eliminarClientes = new JButton("eliminar Clientes");



        panel.add(verClientes);
        panel.add(eliminarClientes);



        add(panel);
    }

    public static void main(String[] args) {
        InterfazGestionClientes clientes = new InterfazGestionClientes();

    }
}
