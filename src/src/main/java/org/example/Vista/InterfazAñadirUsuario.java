package org.example.Vista;

import org.example.ControladorDAO.UsuarioDAO;
import org.example.Modelo.Usuario;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InterfazAñadirUsuario extends JFrame {

    public InterfazAñadirUsuario() {

        setTitle("añadir videojuego");
        setSize(640, 480);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centrar en pantalla
        setVisible(true);
        setResizable(false);

        // Panel principal 3 filas, 2 columnas
        JPanel panel = new JPanel(new GridLayout(4, 2, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JLabel nombre = new JLabel("Nombre");
        JLabel correo = new JLabel("correo");
        JLabel contrasena = new JLabel("contraseña");
        JButton volver = new JButton("volver");
        JButton añadir = new JButton("añadir");
        JTextField escribirCorreo = new JTextField();
        JPasswordField escribirContraseña = new JPasswordField();
        JTextField escribirNombre = new JTextField();
        panel.add(nombre);
        panel.add(escribirNombre);
        panel.add(correo);
        panel.add(escribirCorreo);
        panel.add(contrasena);
        panel.add(escribirContraseña);
        panel.add(volver);
        panel.add(añadir);
        add(panel);

        volver.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                InterfazGestionUsuarios interfazGestionUsuarios = new InterfazGestionUsuarios();
                dispose();
            }
        });
        añadir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre = escribirNombre.getText().trim();
                String correo = escribirCorreo.getText().trim();
                String contrasena = escribirContraseña.getText().trim();

                Usuario usuario = new Usuario(nombre,correo,contrasena);

                if (UsuarioDAO.insertarUsuario(usuario)){
                    JOptionPane.showMessageDialog(null,"usuario añadido con exito");
                }else {
                    JOptionPane.showMessageDialog(null,"No se ha encontrado correo");
                }
            }
        });

    }

    public static void main(String[] args) {
        InterfazAñadirUsuario interfazAñadirUsuario = new InterfazAñadirUsuario();
        interfazAñadirUsuario.setVisible(true);
    }
}
