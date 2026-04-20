package org.example.Vista;

import javax.swing.*;
import java.awt.*;

public class InterfazGestionTickets extends JFrame {

    public InterfazGestionTickets() {
        setTitle("Gestion De Tickets");
        setSize(640, 480);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centrar en pantalla
        setVisible(true);
        setResizable(false);

        // Panel principal 3 filas, 2 columnas
        JPanel panel = new JPanel(new GridLayout(1, 2, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        setVisible(true);
        setResizable(false);

        JButton verTickets = new JButton("Ver Tickets");
        JButton añadirTickets = new JButton(" Añadir Tickets");

        panel.add(verTickets);
        panel.add(añadirTickets);
        add(panel);
    }
}
