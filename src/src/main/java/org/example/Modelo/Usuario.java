package org.example.Modelo;

public class Usuario {
    private int id;

    private String email;
    private String nombre;
    private String password;


    public Usuario() {
    }

    public Usuario(String nombre, String email, String password) {
        this.nombre = nombre;
        this.email = email;
        this.password = password;
    }

    public Usuario(String nombre, String password) {
        this.nombre = nombre;
        this.password = password;
    }

    public Usuario(int id, String email, String nombre, String password) {
        this.id = id;
        this.email = email;
        this.nombre = nombre;
        this.password = password;
    }

    public Usuario(int id) {
        this.id = id;
    }

    public Usuario(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    @Override
    public String toString() {
        return "Usuario: " + nombre + " - " + " Correo : " + email;
    }

}
