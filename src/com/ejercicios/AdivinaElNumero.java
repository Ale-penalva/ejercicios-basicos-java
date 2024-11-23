package com.ejercicios;

import java.util.Scanner;

public class AdivinaElNumero {

    public static void main(String[] args) {
        // Generar un número aleatorio entre 1 y 100
        int aleatorio = (int)(Math.random() * 100) + 1;

        Scanner entrada = new Scanner(System.in);

        int numero = 0;
        int intentos = 0;

        System.out.println("¡Adivina el número! Está entre 1 y 100.");

        // Mostrar el mensaje inicial fuera del bucle
        System.out.print("Introduce un número: ");

        // Bucle hasta que el usuario adivine el número
        while (numero != aleatorio) {
            intentos++;

            // Validar que la entrada sea un número válido
            if (!entrada.hasNextInt()) {
                System.out.println("Por favor, introduce un número válido.");
                entrada.next(); // Limpiar la entrada no válida
                continue;
            }

            numero = entrada.nextInt();

            // Verificar si el número está fuera de rango
            if (numero < 1 || numero > 100) {
                System.out.println("El número debe estar entre 1 y 100. Inténtalo de nuevo.");
                continue;
            }

            // Dar pistas al usuario
            if (aleatorio > numero) {
                System.out.print("Más alto. Intenta de nuevo: ");
            } else if (aleatorio < numero) {
                System.out.print("Más bajo. Intenta de nuevo: ");
            }
        }

        // Mensaje de éxito
        System.out.println("¡Perfecto! Has adivinado el número en " + intentos + " intentos.");

        entrada.close(); // Cerrar el Scanner
    }
}


