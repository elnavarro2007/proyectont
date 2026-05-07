package org.example.Vista;

import org.example.ControladorDAO.ClienteDAO;
import org.example.Modelo.Cliente;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

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


        JPanel panelBotones = new JPanel(new GridLayout(1, 3, 5, 5));
        JButton volver = new JButton("volver");
        JButton actualizar = new JButton("Modificar");
        JButton eliminar = new JButton("Eliminar");


        ArrayList<Cliente> clientes = ClienteDAO.verCliente();

        DefaultListModel<Cliente> modelo = new DefaultListModel<>();
        JList<Cliente> listaCliente = new JList<>(modelo);

        for (Cliente c : clientes) {
            modelo.addElement(c);
        }


        JPanel panelScroll = new JPanel();
        JScrollPane scroll = new JScrollPane(listaCliente);
        scroll.setPreferredSize(new Dimension(550, 250));
        panelBotones.add(volver);
        panelBotones.add(actualizar);
        panelBotones.add(eliminar);

        // panelTexto.add(obtenerDNI);
        panel.add(panelTexto, BorderLayout.NORTH);
        panelScroll.add(scroll);
        panel.add(panelBotones, BorderLayout.SOUTH);


        panel.add(panelScroll, BorderLayout.CENTER);
        add(panel);

        volver.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                InterfazGestionClientes interfazGestionClientes = new InterfazGestionClientes();
                dispose();
            }
        });
        eliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Cliente seleccionado = listaCliente.getSelectedValue();


                if (seleccionado == null) {
                    JOptionPane.showMessageDialog(null, "No se ha seleccionado ningun usuario");
                } else {
                    int respuesta = JOptionPane.showConfirmDialog(null, "Seguro que quieres eliminar el usuario", "Si, no", JOptionPane.YES_NO_OPTION);
                    if (respuesta == JOptionPane.YES_OPTION) {
                        boolean eliminado = ClienteDAO.eliminarCliente(seleccionado);
                        JOptionPane.showMessageDialog(null, "Eliminado con exito");
                        dispose();
                        new InterfazVerCliente().setVisible(true);

                    }
                    if (respuesta == JOptionPane.NO_OPTION) {

                    }
                }
            }
        });

        actualizar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Cliente seleccionado = listaCliente.getSelectedValue();

                if (seleccionado == null) {
                    JOptionPane.showMessageDialog(null, "Cliente no seleccionado");
                } else {
                    
                    
                    ModificarCliente modificarUsuario = new ModificarCliente();
                    dispose();
                    new InterfazVerCliente().setVisible(true);

                } // Preguntar a angel para que me pille el dni sin tener que escribirlo 
                // y para que no se abran nuevas interfaces mientras modificarCliente este activo


            }
        });
    }

    public static void main(String[] args) {
        InterfazVerCliente interfazAñadirCliente = new InterfazVerCliente();
        interfazAñadirCliente.setVisible(true);
    }
}
