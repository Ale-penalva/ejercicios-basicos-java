package com.ejercicios;

import java.util.Scanner;

/**
 * Programa que compara dos números enteros ingresados por el usuario
 * y determina cuál es mayor, cuál es menor o si son iguales.
 */
public class QuéNumEsMayor {

    public static void main(String[] args) {
        // Declaración de variables
        int num1, num2;

        // Crear un objeto Scanner para leer los datos del usuario
        Scanner entrada = new Scanner(System.in);

        // Solicitar al usuario que introduzca dos números
        System.out.println("Introduce el primer número:");
        num1 = entrada.nextInt();

        System.out.println("Introduce el segundo número:");
        num2 = entrada.nextInt();

        // Comparar los números y mostrar el resultado
        if (num1 > num2) {
            System.out.println("El primer número es mayor: " + num1 + " > " + num2);
        } else if (num2 > num1) {
            System.out.println("El segundo número es mayor: " + num2 + " > " + num1);
        } else {
            System.out.println("Los números son iguales: " + num1 + " = " + num2);
        }

        // Cerrar el objeto Scanner
        entrada.close();
    }
}



