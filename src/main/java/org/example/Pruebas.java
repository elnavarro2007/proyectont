package org.example;

import org.example.Modelo.*;
import org.example.Vista.InterfazLogin;

import java.util.ArrayList;

import static org.example.ControladorDAO.ClienteDAO.*;
import static org.example.ControladorDAO.TicketCompraDAO.eliminarCompra;
import static org.example.ControladorDAO.TiendaDAO.eliminarTienda;
import static org.example.ControladorDAO.TiendaDAO.insertarTienda;
import static org.example.ControladorDAO.VideojuegoDAO.eliminarVideojuego;
import static org.example.ControladorDAO.VideojuegoDAO.insertarVideojuego;
import static org.example.ControladorDAO.TicketCompraDAO.insertarCompra;
import static org.example.ControladorDAO.TiendaVideojuegoDAO.insertarTiendaVideojuego;
import static org.example.ControladorDAO.TiendaVideojuegoDAO.eliminarTiendaVideojuego;

public class Pruebas {
    public static void main(String[] args) {

        ArrayList<Cliente> clientes = verCliente();

        Cliente cliente = new Cliente("12344708A", "Yo", "Yo", "111111111", "y743o@h.com");
        Tienda tienda = new Tienda("Gama", "123456780", "300", "calle clementes 24");
        Videojuegos videojuego = new Videojuegos("123454784", "Persona 3", "RPG", "60.00");
        TicketCompra ticket = new TicketCompra("12345679A", "123454784");
       // TiendaVideojuegos tiendaVideojuegos = new TiendaVideojuegos("2","123454784");

      //  if (insertarCliente(cliente)) {
      //    System.out.println("insertado");
      // } else {
      //     System.out.println("No insertado");
      // }
       // if (insertarTienda(tienda)) {
       //     System.out.println("insertado");
       // } else {
       //     System.out.println("No insertado");
       // }
       // if (insertarVideojuego(videojuego)) {
       //     System.out.println("insertado");
       // } else {
       //     System.out.println("No insertado");
       // }
       // if (insertarCompra(ticket)) {
       //     System.out.println("Insertado");
       // } else {
       //     System.out.println("no insertado");
       // }

        //if (insertarTiendaVideojuego(tiendaVideojuegos)) {
        //    System.out.println("Insertado");
        //} else {
        //    System.out.println("no insertado");
        //}


        //  if (eliminarCompra(ticket)) {
        //      System.out.println("Eliminado");
        //  } else {
        //      System.out.println("no eliminado");
        //  }
        // if (eliminarCliente(cliente)) {
        //     System.out.println("Eliminado");
        // } else {
        //     System.out.println("no eliminado");
        // }
        //  if (eliminarTienda(tienda)) {
        //      System.out.println("Eliminado");
        //  } else {
        //      System.out.println("no eliminado");
        //  }

        // if (eliminarVideojuego(videojuego)) {
        //     System.out.println("Eliminado");
        // } else {
        //     System.out.println("no eliminado");
        // }

       // if (eliminarTiendaVideojuego(tiendaVideojuegos)) {
       //     System.out.println("Eliminado");
       // } else {
       //     System.out.println("no eliminado");
       // }

        for (Cliente c : clientes){
            System.out.println(c);
        }

    }
}
