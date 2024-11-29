package com.ejercicios;

import java.util.Scanner;

/**
 * Programa que permite al usuario llenar un vector de 15 números
 * y calcula cuántas veces aparece el número 3 en él.
 */
public class Vectores {

    public static void main(String[] args) {
        // Declaración del vector y el escáner
        int[] vector = new int[15];
        Scanner entrada = new Scanner(System.in);

        // Llenar el vector con los números proporcionados por el usuario
        System.out.println("Por favor, ingresa 15 números para llenar el vector:");
        for (int i = 0; i < 15; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vector[i] = entrada.nextInt();
        }

        // Contar cuántas veces aparece el número 3
        int contador = 0;
        for (int i = 0; i < 15; i++) {
            if (vector[i] == 3) {
                contador++;
            }
        }

        // Mostrar el resultado
        System.out.println("El número 3 aparece " + contador + " veces en el vector.");

        // Cerrar el escáner
        entrada.close();
    }
}
