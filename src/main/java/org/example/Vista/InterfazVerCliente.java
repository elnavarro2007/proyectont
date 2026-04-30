package org.example.Vista;

import org.example.Modelo.Cliente;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import static org.example.ControladorDAO.ClienteDAO.verCliente;

public class InterfazVerCliente extends JFrame {


    public InterfazVerCliente() {
        Cliente cliente = new Cliente();
        setTitle("Ver Clientes");
        setSize(640, 480);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centrar en pantalla
        setVisible(true);
        setResizable(false);


        JPanel panel = new JPanel(new BorderLayout());
        panel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));


        //JPanel panelCentro = new JPanel(new GridLayout(1, 2, 5, 5));


        //scroll.setVerticalScrollBar(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        //scroll.setHorizontalScrollBar(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

        JPanel panelTexto = new JPanel(new GridLayout(1, 5, 5, 5));


        JLabel dni = new JLabel("dni");
        JLabel nombre = new JLabel("nombre");
        JLabel apellidos = new JLabel("apellidos");
        JLabel telefono = new JLabel("telefono");
        JLabel correo = new JLabel("correo");
     //   JLabel obtenerDNI = new JLabel(cliente.getDni());
     //   JLabel obtenerNombre = new JLabel(cliente.getNombre());
     //   JLabel obtenerApellido = new JLabel(cliente.getDni());
     //   JLabel obtenerTelefono = new JLabel(cliente.getTelefono());
     //   JLabel obtenerCorreo = new JLabel(cliente.getCorreo());




        JButton volver = new JButton("volver");
        JButton anadir = new JButton("añadir");






        JPanel panelBotones = new JPanel(new GridLayout(1, 1, 5, 5));
        ArrayList<Cliente> clientes = verCliente();

        DefaultListModel<Cliente> modelo = new DefaultListModel<>();
        JList<Cliente> listaCliente = new JList<>(modelo);

        for (Cliente c : clientes) {
            modelo.addElement(c);
        }


        panelTexto.add(dni);
        panelTexto.add(nombre);
        panelTexto.add(apellidos);
        panelTexto.add(telefono);
        panelTexto.add(correo);



        JScrollPane scroll = new JScrollPane(listaCliente);
        scroll.setPreferredSize(new Dimension(250, 150));
        panelBotones.add(volver, BorderLayout.AFTER_LAST_LINE);

       // panelTexto.add(obtenerDNI);
        panel.add(panelTexto, BorderLayout.NORTH);
        panel.add(scroll);
        panel.add(panelBotones, BorderLayout.SOUTH);



        add(panel);

        volver.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                InterfazGestionClientes interfazGestionClientes = new InterfazGestionClientes();
                dispose();
            }
        });
    }

    public static void main(String[] args) {
        InterfazVerCliente interfazAñadirCliente = new InterfazVerCliente();
        interfazAñadirCliente.setVisible(true);
    }
}
