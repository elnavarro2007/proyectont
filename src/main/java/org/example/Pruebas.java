package org.example;

import org.example.Modelo.*;
import org.example.Vista.InterfazLogin;

import java.util.ArrayList;

import static org.example.ControladorDAO.ClienteDAO.*;
import static org.example.ControladorDAO.TicketCompraDAO.*;
import static org.example.ControladorDAO.TiendaDAO.*;
import static org.example.ControladorDAO.TiendaVideojuegoDAO.*;
import static org.example.ControladorDAO.VideojuegoDAO.*;

public class Pruebas {
    public static void main(String[] args) {

        ArrayList<Cliente> clientes = verCliente();
        ArrayList<TicketCompra> ticketCompras = verTicket();
        ArrayList<Tienda> tiendas = verTienda();
        ArrayList<TiendaVideojuegos> tiendStock = verStock();
        ArrayList <Videojuegos> videojuegos = verVideojuegos();

        Cliente cliente = new Cliente("12344708A", "Yo", "Yo", "111111111", "y743o@h.com");
        Tienda tienda = new Tienda("Game", "123456781", "calle clementes 24");
        Videojuegos videojuego = new Videojuegos("123454783", "Persona 4", "RPG", "70.00");
        TicketCompra ticket = new TicketCompra("12344708A", "123454783", videojuego.getPrecio());
        TiendaVideojuegos tiendaVideojuegos = new TiendaVideojuegos("1", "123454783", "300");

        //  if (insertarCliente(cliente)) {
        //    System.out.println("insertado");
        // } else {
        //     System.out.println("No insertado");
        // }
        //  if (insertarTienda(tienda)) {
        //      System.out.println("insertado");
        //  } else {
        //      System.out.println("No insertado");
        //  }
        //   if (insertarVideojuego(videojuego)) {
        //       System.out.println("insertado");
        //   } else {
        //       System.out.println("No insertado");
        //   }
        //  if (insertarCompra(ticket)) {
        //      System.out.println("Insertado");
        //  } else {
        //      System.out.println("no insertado");
        //  }

        //  if (insertarTiendaVideojuego(tiendaVideojuegos)) {
        //      System.out.println("Insertado");
        //  } else {
        //      System.out.println("no insertado");
        //  }


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

        // for (Cliente c : clientes){
        //     System.out.println(c);
        // }

        //for (TicketCompra t : ticketCompras){
        //    System.out.println(t);
        //}

        // for (Tienda t : tiendas){
        //     System.out.println(t);
        // }

        //for (TiendaVideojuegos t : tiendStock){
        //    System.out.println(t);
        //}

        for (Videojuegos v : videojuegos){
            System.out.println(v);
        }

    }
}
