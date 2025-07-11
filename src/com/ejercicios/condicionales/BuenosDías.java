package com.ejercicios.condicionales;
import java.util.Scanner;

public class BuenosDías {

    public static void main(String[] args) {
        // Este programa saluda según la hora del día introducida por el usuario (00:00 a 23:59).

        int hora;
        String mañana = "¡Buenos días!";
        String tarde = "¡Buenas tardes!";
        String noche = "¡Buenas noches!";
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce una hora válida entre 0 y 23 (horas enteras):");
        hora = entrada.nextInt();

        if (hora >= 6 && hora <= 12) {
            System.out.println(mañana);
        } else if (hora >= 13 && hora <= 20) {
            System.out.println(tarde);
        } else if ((hora >= 21 && hora <= 23) || (hora >= 0 && hora <= 5)) {
            System.out.println(noche);
        } else {
            System.out.println("La hora introducida no es válida. Por favor, ingresa un número entre 0 y 23.");
        }

        entrada.close(); // Cerrar el Scanner
    }
}
