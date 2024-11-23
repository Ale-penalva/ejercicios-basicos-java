package com.ejercicios;

import java.util.Scanner;

/**
 * Programa para determinar la cara opuesta de un dado estándar de 6 caras.
 * 
 * El usuario introduce un número del 1 al 6, y el programa muestra la cara opuesta.
 * Si el número introducido no está entre 1 y 6, se informa al usuario que la entrada es inválida.
 */
public class CaraOpuestaDado {

    public static void main(String[] args) {
        // Declaración de variables
        int dado;

        // Crear el escáner para la entrada del usuario
        Scanner entrada = new Scanner(System.in);

        // Solicitar al usuario el número del dado
        System.out.print("Introduce el número del dado (1 al 6) para conocer su cara opuesta: ");
        dado = entrada.nextInt();

        // Determinar la cara opuesta usando un switch
        switch (dado) {
            case 1:
                System.out.println("El lado opuesto al 1 es el 6.");
                break;
            case 2:
                System.out.println("El lado opuesto al 2 es el 5.");
                break;
            case 3:
                System.out.println("El lado opuesto al 3 es el 4.");
                break;
            case 4:
                System.out.println("El lado opuesto al 4 es el 3.");
                break;
            case 5:
                System.out.println("El lado opuesto al 5 es el 2.");
                break;
            case 6:
                System.out.println("El lado opuesto al 6 es el 1.");
                break;
            default:
                System.out.println("Error: Has introducido un número que no está en el dado.");
                break;
        }

        // Cerrar el escáner
        entrada.close();
    }
}
