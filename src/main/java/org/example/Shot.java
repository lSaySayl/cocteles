package org.example;

public class Shot extends Coctel {

    private String tipoLicor;
    //Normalmente, un tipo no es un string. Se puede dar una codificación interna.

    //Constructor vacio.

    public Shot() {
    }

    //Constructor de padre y atributo hijo.

    public Shot(String nombre, Long precio, String tipoLicor) {
        super(nombre, precio);
        this.tipoLicor = tipoLicor;
    }
}
