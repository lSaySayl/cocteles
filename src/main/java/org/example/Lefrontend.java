package org.example;

import javax.swing.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Lefrontend {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int prueba = Integer.parseInt(JOptionPane.showInputDialog("Por favor, ingrese un número."));
        JOptionPane.showMessageDialog(null, prueba);
        float pruebaDos = Float.parseFloat(JOptionPane.showInputDialog("Por favor, ingrese un número."));
        JOptionPane.showMessageDialog(null, pruebaDos);
        Integer pruebaTres = Integer.valueOf(JOptionPane.showInputDialog("Por favor, ingrese un número."));
        JOptionPane.showMessageDialog(null, pruebaTres);





        //Este objeto creado no es de nosotros. Es de java
        //Como obtener una fecha del sistema.

        LocalDate objetoFecha = LocalDate.now(); //Acá el metodo no lo llama el objeto, lo llama directamente la clase. metodo estatito. No paso por el construcotr

        JOptionPane.showMessageDialog(null,objetoFecha);

        //Debo tener la fecha de fabricación y la fecha de vencimiento. Con el punto.now se crea la fecha inicial.
        //La fecha de vencimiento la pone el usuario.

        //Como asignar una fecha en específico.
        //Estoy llamando un metodo.

        LocalDate objetoFecha2 = LocalDate.of(2023,03,18);

        JOptionPane.showMessageDialog(null,objetoFecha2);

        //Encontrar la diferencia entre dos fechas.

        Long diferenciaEntreFechas = ChronoUnit.DAYS.between(objetoFecha,objetoFecha2);

        //De qué tipo deben ser los ingredientes que tiene la clase ChronoUnit.DAYS.between?
        //Respuesta: LOCALDATE.

        JOptionPane.showMessageDialog(null,diferenciaEntreFechas);








    }
}