package org.example;

import java.time.LocalDate;

public class JuiceCoctel extends Coctel {

    //Primer escenario: Tiene una fecha de vencimiento.
    //Manejar fechas en programación es completo de mantener. Esto, por el apartado binario.
    //Parqueadero. Prueba que hacen muchas empresas.

    private LocalDate fechaVencimiento; //Maven me ayuda a exportar. Es un tipo de dato como String.

    //Constructor vacío
    public JuiceCoctel() {
    }

    //Constructor del padre y atributo del hijo.

    public JuiceCoctel(String nombre, Long precio, LocalDate fechaVencimiento) {
        super(nombre, precio);
        this.fechaVencimiento = fechaVencimiento;
    }

    //La super clase es coctel

    //Get and setters


    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }
}
