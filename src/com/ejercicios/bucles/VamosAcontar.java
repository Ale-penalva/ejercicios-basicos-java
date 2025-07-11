package com.ejercicios.bucles;
import java.util.Scanner;

/**
 * Programa que cuenta desde 1 hasta un número introducido por el usuario.
 * 
 * Si el número introducido es negativo o cero, muestra un mensaje de error.
 */
public class VamosAcontar {

    public static void main(String[] args) {
        // Crear un escáner para la entrada del usuario
        Scanner entrada = new Scanner(System.in);

        // Solicitar al usuario el límite
        System.out.print("¿Hasta qué número quieres contar? ");
        int numMax = entrada.nextInt();

        // Validar que el número sea positivo
        if (numMax <= 0) {
            System.out.println("Error: El número debe ser mayor que cero.");
        } else {
            // Contar desde 1 hasta el número ingresado
            System.out.println("Contando hasta " + numMax + ":");
            int cont = 1;
            while (cont <= numMax) {
                System.out.println(cont);
                cont++;
            }
        }

        // Cerrar el escáner
        entrada.close();
    }
}


