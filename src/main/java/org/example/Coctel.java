package org.example;

public class Coctel {

    private String nombre;
    private Long precio;

    //Constructor vacío


    public Coctel() {
    }

    //Constructor lleno

    public Coctel(String nombre, Long precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    //Get and setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getPrecio() {
        return precio;
    }

    public void setPrecio(Long precio) {
        this.precio = precio;
    }
}
