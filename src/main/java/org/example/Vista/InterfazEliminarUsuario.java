package org.example.Vista;

import org.example.ControladorDAO.UsuarioDAO;
import org.example.Modelo.Usuario;
import org.example.Modelo.Videojuegos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static org.example.ControladorDAO.VideojuegoDAO.eliminarVideojuego;

public class InterfazEliminarUsuario extends JFrame {

    public InterfazEliminarUsuario() {
        setTitle("Eliminar Usuario");
        setSize(640, 480);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centrar en pantalla
        setVisible(true);
        setResizable(false);


        JPanel panel = new JPanel(new GridLayout(2, 2, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JLabel correo = new JLabel("id");
        JTextField escribirId = new JTextField();
        JButton volver = new JButton("volver");
        JButton eliminar = new JButton("eliminar");

        panel.add(correo);
        panel.add(escribirId);
        panel.add(volver);
        panel.add(eliminar);
        add(panel);

        volver.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                InterfazGestionUsuarios interfazGestionUsuarios = new InterfazGestionUsuarios();
                dispose();
            }
        });
        eliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String correo = escribirId.getText().trim();

                Usuario usuario = new Usuario(correo);

                if (UsuarioDAO.eliminarUsuario(usuario)){
                    JOptionPane.showMessageDialog(null, "Usuario eliminado con exito");

                }else {
                    JOptionPane.showMessageDialog(null, "No existe esa correo");

                }
                escribirId.setText("");
            }
        });

    }

    public static void main(String[] args) {
        InterfazEliminarUsuario interfazEliminarUsuario = new InterfazEliminarUsuario();
        interfazEliminarUsuario.setVisible(true);
    }
}

