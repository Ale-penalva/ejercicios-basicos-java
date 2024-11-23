package com.ejercicios;

import java.util.Scanner;

/**
 * Programa que muestra la tabla de multiplicar del número ingresado por el usuario.
 * El usuario debe introducir un número entero positivo.
 */
public class TablaMultiplicar {

    public static void main(String[] args) {
        // Crear un objeto Scanner para leer los datos del usuario
        Scanner entrada = new Scanner(System.in);
        int numUsuario;

        // Bucle para validar que el usuario ingrese un número positivo
        while (true) {
            System.out.println("Ingresa un número entero positivo:");
            numUsuario = entrada.nextInt();

            if (numUsuario > 0) {
                // Si el número es válido, mostrar la tabla de multiplicar
                System.out.println("Tabla de multiplicar del " + numUsuario + ":");
                for (int i = 1; i <= 10; i++) {
                    System.out.println(numUsuario + " x " + i + " = " + (numUsuario * i));
                }
                break; // Salir del bucle
            } else {
                // Mensaje de error si el número no es válido
                System.out.println("Número incorrecto. Por favor, introduce un número entero positivo.");
            }
        }

        // Cerrar el objeto Scanner
        entrada.close();
    }
}



		
