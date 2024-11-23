package com.ejercicios;

import java.util.Scanner;

/**
 * Programa para convertir una cantidad de minutos a horas y minutos.
 * 
 * El usuario introduce un número de minutos, y el programa calcula cuántas horas
 * completas y minutos restantes corresponden a esa cantidad.
 */
public class ConversiónMinsAHoras {

    public static void main(String[] args) {
        // Declaración de variables
        int minutos, horas, minRestantes;

        // Crear un escáner para la entrada del usuario
        Scanner entrada = new Scanner(System.in);

        // Solicitar la cantidad de minutos
        System.out.print("Introduce la cantidad de minutos que quieres convertir a horas: ");
        minutos = entrada.nextInt();

        // Validar entrada
        if (minutos < 0) {
            System.out.println("Error: La cantidad de minutos no puede ser negativa.");
        } else {
            // Cálculos
            horas = minutos / 60;         // Obtener horas completas
            minRestantes = minutos % 60; // Obtener minutos restantes

            // Mostrar el resultado
            System.out.println(minutos + " minutos es igual a " + horas + " horas y " + minRestantes + " minutos.");
        }

        // Cerrar el escáner
        entrada.close();
    }
}
