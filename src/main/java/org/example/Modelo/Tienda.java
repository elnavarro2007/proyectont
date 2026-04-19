package org.example.Modelo;

public class Tienda {

   private String nombreTienda;
   private String telefono;
   private String ubicacion;


    //Constructores


    public Tienda() {
    }

    public Tienda(String nombreTienda, String telefono, String ubicacion) {
        this.nombreTienda = nombreTienda;
        this.telefono = telefono;
        this.ubicacion = ubicacion;
    }

// Getter and setter



    public String getNombreTienda() {
        return nombreTienda;
    }

    public void setNombreTienda(String nombreTienda) {
        this.nombreTienda = nombreTienda;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }



    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }


    //Tostring


    @Override
    public String toString() {
        return "Tienda{" +
                ", nombreTienda='" + nombreTienda + '\'' +
                ", telefono=" + telefono +
                ", ubicacion='" + ubicacion + '\'' +
                '}';
    }
}
