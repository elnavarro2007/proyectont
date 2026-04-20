package org.example.Vista;

import javax.swing.*;
import java.awt.*;

public class InterfazGestionTienda extends JFrame {


    public InterfazGestionTienda(){
        setTitle("interfaz gestion Tienda");
        setSize(640, 480);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centrar en pantalla
        setVisible(true);
        setResizable(false);

        JPanel panel = new JPanel(new GridLayout(3, 1, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(40, 40, 40, 40));

        JButton verTiendas = new JButton("datos de las tiendas");
        JButton añadirTiendas = new JButton("añadir tiendas");
        JButton eliminarTiendas = new JButton("eliminar tiendas");



        panel.add(verTiendas);
        panel.add(añadirTiendas);
        panel.add(eliminarTiendas);



        add(panel);

    }

    public static void main(String[] args) {
        InterfazGestionTienda gestionTienda = new InterfazGestionTienda();

    }

}
