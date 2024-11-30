package com.ejercicios;

import java.util.Scanner;

/**
 * Programa que calcula cuánto falta para llegar a la medianoche
 * basándose en la hora y los minutos ingresados por el usuario.
 */
public class Medianoche {

    public static void main(String[] args) {
        // Declaración de variables
        int hora;
        int minutos;

        // Crear un objeto Scanner para la entrada de datos
        Scanner entrada = new Scanner(System.in);

        // Solicitar la hora al usuario
        System.out.println("Introduce la hora (formato 0-23): ");
        hora = entrada.nextInt();

        // Solicitar los minutos al usuario
        System.out.println("Introduce los minutos (formato 0-59): ");
        minutos = entrada.nextInt();

        // Validación de la entrada
        if (hora < 0 || hora > 23 || minutos < 0 || minutos > 59) {
            System.out.println("Error: Introduce un formato válido para hora (0-23) y minutos (0-59).");
        } else {
            // Calcular cuánto falta para medianoche
            if (hora == 0 && minutos == 0) {
                System.out.println("Ya es medianoche.");
            } else {
                int horasRestantes = 23 - hora;
                int minutosRestantes = 60 - minutos;

                // Ajustar minutos si son exactamente 60
                if (minutosRestantes == 60) {
                    horasRestantes++;
                    minutosRestantes = 0;
                }

                // Mostrar el resultado
                if (horasRestantes == 0 && minutosRestantes == 0) {
                    System.out.println("Ya es medianoche.");
                } else if (horasRestantes == 0) {
                    System.out.println("Faltan " + minutosRestantes + " minutos para medianoche.");
                } else {
                    System.out.println("Faltan " + horasRestantes + " horas y " + minutosRestantes + " minutos para medianoche.");
                }
            }
        }

        // Cerrar el objeto Scanner
        entrada.close();
    }
}
