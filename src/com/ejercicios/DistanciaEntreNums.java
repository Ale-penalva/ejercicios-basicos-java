package com.ejercicios;

import java.util.Scanner;

/**
 * Programa para calcular la distancia entre dos números.
 * 
 * El usuario introduce dos números enteros, y el programa muestra la distancia absoluta
 * entre ellos (la diferencia en valor absoluto).
 */
public class DistanciaEntreNums {

    public static void main(String[] args) {
        // Declaración de variables
        int num1, num2, distancia;

        // Crear un escáner para la entrada del usuario
        Scanner entrada = new Scanner(System.in);

        // Solicitar al usuario dos números
        System.out.println("Introduce el primer número:");
        num1 = entrada.nextInt();

        System.out.println("Introduce el segundo número:");
        num2 = entrada.nextInt();

        // Calcular la distancia
        distancia = Math.abs(num1 - num2);

        // Mostrar el resultado
        System.out.println("La distancia absoluta entre " + num1 + " y " + num2 + " es: " + distancia + ".");

        // Cerrar el escáner
        entrada.close();
    }
}

