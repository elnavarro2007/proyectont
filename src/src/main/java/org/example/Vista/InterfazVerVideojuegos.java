package org.example.Vista;

import org.example.ControladorDAO.VideojuegoDAO;
import org.example.Modelo.Cliente;
import org.example.Modelo.Videojuegos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import static org.example.ControladorDAO.ClienteDAO.verCliente;

public class InterfazVerVideojuegos extends JFrame{
    public InterfazVerVideojuegos() {
        Cliente cliente = new Cliente();
        setTitle("Ver Videojuegos");
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



        //   JLabel obtenerDNI = new JLabel(cliente.getDni());
        //   JLabel obtenerNombre = new JLabel(cliente.getNombre());
        //   JLabel obtenerApellido = new JLabel(cliente.getDni());
        //   JLabel obtenerTelefono = new JLabel(cliente.getTelefono());
        //   JLabel obtenerCorreo = new JLabel(cliente.getCorreo());




        JButton volver = new JButton("volver");







        JPanel panelBotones = new JPanel(new GridLayout(1, 1, 5, 5));
        ArrayList<Videojuegos> videojuegos = VideojuegoDAO.verVideojuegos();

        DefaultListModel<Videojuegos> modelo = new DefaultListModel<>();
        JList<Videojuegos> listaVideojuegos = new JList<>(modelo);

        for (Videojuegos v : videojuegos) {
            modelo.addElement(v);
        }






        JScrollPane scroll = new JScrollPane(listaVideojuegos);
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
                InterfazGestionVideojuegos interfazGestionVideojuegos = new InterfazGestionVideojuegos();
                dispose();
            }
        });
    }

    public static void main(String[] args) {
        InterfazVerVideojuegos interfazVerVideojuegos = new InterfazVerVideojuegos();
        interfazVerVideojuegos.setVisible(true);
    }
}
