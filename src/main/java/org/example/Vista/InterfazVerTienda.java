package org.example.Vista;

import org.example.ControladorDAO.UsuarioDAO;
import org.example.Modelo.Cliente;
import org.example.Modelo.Usuario;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class InterfazVerTienda extends JFrame {

    public InterfazVerTienda() {

        Cliente cliente = new Cliente();
        setTitle("Ver Tiendas");
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








        JButton volver = new JButton("volver");







        JPanel panelBotones = new JPanel(new GridLayout(1, 1, 5, 5));
        ArrayList<Usuario> usuarios = UsuarioDAO.verUsuarios();

        DefaultListModel<Usuario> modelo = new DefaultListModel<>();
        JList<Usuario> listaUsuarios = new JList<>(modelo);

        for (Usuario u : usuarios) {
            modelo.addElement(u);
        }






        JScrollPane scroll = new JScrollPane(listaUsuarios);
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
                InterfazGestionUsuarios interfazGestionUsuarios = new InterfazGestionUsuarios();
                dispose();
            }
        });

    }
}
