package com.ejercicios;

import java.util.Random;

/**
 * Programa que genera un número aleatorio par dentro de un rango específico.
 * Muestra el número generado y un mensaje indicando que es par.
 */
public class NumeroParAleatorio {

    public static void main(String[] args) {
        // Crear objeto Random para generar números aleatorios
        Random aleatorio = new Random();

        // Generar un número aleatorio par entre 0 y 100 (inclusive)
        int num = aleatorio.nextInt(51) * 2; // Multiplicar por 2 asegura que el número sea par

        // Mostrar el número generado y confirmar que es par
        System.out.println("El número aleatorio generado es: " + num);
        System.out.println("El número " + num + " es par.");
    }
}
