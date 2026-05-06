package org.example.Vista;

import org.example.ControladorDAO.ClienteDAO;
import org.example.ControladorDAO.UsuarioDAO;
import org.example.Modelo.Cliente;
import org.example.Modelo.Usuario;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ModificarUsuario extends JFrame {


    public ModificarUsuario(){
        setTitle("Ver Usuarios");
        setSize(640, 480);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setVisible(true);
        setResizable(false);

        JPanel panelModificar = new JPanel(new GridLayout(3,2,5,5));
        panelModificar.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));


        JLabel nombre = new JLabel("nombre");


        JLabel passwd = new JLabel("contraseña");


        JTextField escribirNombre = new JTextField();
        JTextField escribirCorreo = new JTextField();
        JTextField escribirPasswd = new JTextField();


        JButton modificar = new JButton("modificar");
        JButton volver = new JButton("volver");

        panelModificar.add(nombre);
        panelModificar.add(escribirNombre);


        panelModificar.add(passwd);
        panelModificar.add(escribirPasswd);
        panelModificar.add(modificar);
        panelModificar.add(volver);
        add(panelModificar);


        modificar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                String nombre =  escribirNombre.getText().trim();

                String contrasena = escribirPasswd.getText().trim();

                Usuario usuario = new Usuario(nombre,contrasena);

                if (UsuarioDAO.actualizarUsuario(usuario)){
                    JOptionPane.showMessageDialog(null,"Usuario Cambiado con exito");
                }else {
                    JOptionPane.showMessageDialog(null," No se ha podido cambiar");
                }

                escribirNombre.setText("");

                escribirCorreo.setText("");


            }
        });
        volver.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                InterfazVerUsuarios interfazVerUsuarios = new InterfazVerUsuarios();
                dispose();
            }
        });


    }


    public static void main(String[] args) {
        ModificarUsuario modificarUsuario = new ModificarUsuario();
        modificarUsuario.setVisible(true);
    }
}
