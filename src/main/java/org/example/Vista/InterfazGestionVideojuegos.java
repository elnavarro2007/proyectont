package org.example.Vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InterfazGestionVideojuegos extends JFrame{

    public InterfazGestionVideojuegos(){
        setTitle("interfaz gestion Videojuegos");
        setSize(640, 480);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centrar en pantalla
        setVisible(true);
        setResizable(false);

        JPanel panel = new JPanel(new GridLayout(3, 1, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(40, 40, 40, 40));

        JButton verVideojuegos = new JButton("datos de los videojuegos");
        JButton añadirVideojuegos= new JButton("añadir videojuegos");
        JButton eliminarVideojuegos = new JButton("eliminar videojuegos");



        panel.add(verVideojuegos);
        panel.add(añadirVideojuegos);
        panel.add(eliminarVideojuegos);



        add(panel);
        añadirVideojuegos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                InterfazAñadirVideojuegos interfazAñadirVideojuegos = new InterfazAñadirVideojuegos();
                dispose();
            }
        });
    }

    public static void main(String[] args) {
        InterfazGestionVideojuegos interfazGestionVideojuegos = new InterfazGestionVideojuegos();

    }
}
