package org.example.ControladorDAO;

import org.example.Modelo.TiendaVideojuegos;
import org.example.Modelo.Usuario;
import org.example.Modelo.Videojuegos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import static org.example.Configuracion.Conexion.getConnection;

public class UsuarioDAO {

    public static boolean comprobarUserRegistro(Usuario usuario) {

        try (Connection connection = getConnection();
             PreparedStatement ps = connection.prepareStatement("SELECT 1 FROM cliente WHERE correo = ?")) {

            ps.setString(1, usuario.getEmail());

            ResultSet rs = ps.executeQuery();

            return rs.next();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static boolean compruebaUsuarioLogin(Usuario usuario) {
        try (Connection connection = getConnection();
             PreparedStatement ps = connection.prepareStatement("SELECT nombre, password FROM usuarios WHERE nombre = ? AND password = ? AND password <> '' ")) {

            ps.setString(1, usuario.getNombre());
            ps.setString(2, usuario.getPassword());

            ResultSet rs = ps.executeQuery();

            return rs.next();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static boolean insertarUsuario(Usuario usuario) {

        try (Connection connection = getConnection();
             PreparedStatement ps = connection.prepareStatement("INSERT INTO usuarios (nombre,password,correo) VALUES (?,?,?)")) {


            ps.setString(1, usuario.getNombre());
            ps.setString(2, usuario.getPassword());
            ps.setString(3, usuario.getEmail());


            int columnasAfectadas = ps.executeUpdate();
            return columnasAfectadas > 0;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        // Creo la clase, creo constructor y variables,


    }

    public static boolean eliminarUsuario(Usuario usuario) {
        try (Connection connection = getConnection();
             PreparedStatement ps = connection.prepareStatement("Delete from usuarios where id = ? ")) {

            ps.setInt(1, usuario.getId());


            int columnasAfectadas = ps.executeUpdate();
            return columnasAfectadas > 0;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static ArrayList<Usuario> verUsuarios() {
        ArrayList<Usuario> usuarios = new ArrayList<>();

        try (Connection connection = getConnection();
             PreparedStatement ps = connection.prepareStatement("SELECT *  FROM usuarios where nombre !='admin'")) {

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Usuario u = new Usuario();

                u.setId(rs.getInt("id"));
                u.setNombre(rs.getString("nombre"));
                u.setEmail(rs.getString("correo"));
                u.setPassword(rs.getString("Password"));


                usuarios.add(u);
            }


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return usuarios;
    }

    public static boolean actualizarUsuario(Usuario usuario){


        try (Connection connection = getConnection();
             PreparedStatement ps = connection.prepareStatement("UPDATE usuarios SET nombre = ?, password = ? WHERE id = ?")) {


            ps.setString(1, usuario.getNombre());
            ps.setString(2, usuario.getPassword());


            int columnasAfectadas = ps.executeUpdate();
            return columnasAfectadas > 0;

        } catch (SQLException e) {
            throw new RuntimeException("Error al actualizar el usuario: " + e.getMessage(), e);
        }
    }


}
