package org.example.Vista;

import org.example.ControladorDAO.ClienteDAO;
import org.example.ControladorDAO.UsuarioDAO;
import org.example.Modelo.Cliente;
import org.example.Modelo.Usuario;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ModificarCliente extends JFrame {


    public ModificarCliente(){
        setTitle("Ver Clientes");
        setSize(640, 480);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setVisible(true);
        setResizable(false);

        JPanel panelModificar = new JPanel(new GridLayout(5,2,5,5));
        panelModificar.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));

        JLabel dni = new JLabel(" DNI");
        JLabel telefono = new JLabel("telefono");
        JLabel correo = new JLabel("Correo");


        JLabel passwd = new JLabel("contraseña");

        JTextField escribirDni = new JTextField();
        JTextField escribirTelefono = new JTextField();
        JTextField escribirCorreo = new JTextField();
        JTextField escribirPasswd = new JTextField();


        JButton modificar = new JButton("modificar");
        JButton volver = new JButton("volver");

        panelModificar.add(dni);
        panelModificar.add(escribirDni);
        panelModificar.add(telefono);
        panelModificar.add(escribirTelefono);
        panelModificar.add(correo);
        panelModificar.add(escribirCorreo);

        panelModificar.add(passwd);
        panelModificar.add(escribirPasswd);
        panelModificar.add(modificar);
        panelModificar.add(volver);
        add(panelModificar);


        modificar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                String telefono =  escribirTelefono.getText().trim();
                String correo = escribirCorreo.getText().trim();
                String contrasena = escribirPasswd.getText().trim();
                String dni = escribirDni.getText().trim();


                Cliente cliente = new Cliente(telefono,correo,contrasena,dni);

                if (ClienteDAO.actualizarCliente(cliente)){
                    JOptionPane.showMessageDialog(null,"Usuario Cambiado con exito");
                }else {
                    JOptionPane.showMessageDialog(null," No se ha podido cambiar");
                }

                escribirCorreo.setText("");
                escribirPasswd.setText("");
                escribirTelefono.setText("");


            }
        });
        volver.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                InterfazVerCliente interfazVerCliente = new InterfazVerCliente();
                dispose();
            }
        });


    }


    public static void main(String[] args) {
        ModificarCliente modificarUsuario = new ModificarCliente();
        modificarUsuario.setVisible(true);
    }
}
