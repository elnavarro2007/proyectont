package org.example.Vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InterfazAñadirVideojuegos extends JFrame{

    public InterfazAñadirVideojuegos(){

        setTitle("añadir videojuego");
        setSize(640, 480);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centrar en pantalla
        setVisible(true);
        setResizable(false);

        // Panel principal 3 filas, 2 columnas
        JPanel panel = new JPanel(new GridLayout(5, 2, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JLabel numeroSerie = new JLabel("numero serie");
        JLabel nombre = new JLabel("nombre");
        JLabel genero = new JLabel("genero");
        JLabel precio  = new JLabel("precio");
        JButton volver = new JButton("volver");
        JButton añadir = new JButton("añadir");
        JTextField escribirNumeroSerie = new JTextField();
        JTextField escribirNombre = new JTextField();
        JTextField escribirGenero = new JTextField();
        JTextField escribirPrecio = new JTextField();

        panel.add(numeroSerie);
        panel.add(escribirNumeroSerie);
        panel.add(nombre);
        panel.add(escribirNombre);
        panel.add(genero);
        panel.add(escribirGenero);
        panel.add(precio);
        panel.add(escribirPrecio);
        panel.add(volver);
        panel.add(añadir);
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
        InterfazAñadirVideojuegos interfazAñadirVideojuegos = new InterfazAñadirVideojuegos();
        interfazAñadirVideojuegos.setVisible(true);
    }
}
