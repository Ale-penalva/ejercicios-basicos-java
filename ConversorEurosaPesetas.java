package com.ejercicios;

import java.util.Scanner;

/**
 * Programa para convertir una cantidad de euros a pesetas.
 * 
 * El usuario introduce una cantidad de euros, y el programa realiza la conversión
 * a pesetas utilizando la tasa oficial de 1 euro = 166.386 pesetas.
 */
public class ConversorEurosaPesetas {

    public static void main(String[] args) {
        // Declaración de variables
        double euros;
        double pesetas;

        // Crear un escáner para la entrada del usuario
        Scanner entrada = new Scanner(System.in);

        // Solicitar al usuario la cantidad de euros
        System.out.print("Introduce la cantidad de euros que deseas convertir a pesetas: ");
        euros = entrada.nextDouble();

        // Conversión de euros a pesetas
        pesetas = euros * 166.386;

        // Mostrar el resultado formateado
        System.out.printf("%.2f€ equivalen a %.2f pesetas.%n", euros, pesetas);

        // Cerrar el escáner
        entrada.close();
    }
}
