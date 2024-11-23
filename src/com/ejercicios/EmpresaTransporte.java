package com.ejercicios;

import java.util.Scanner;

/**
 * Programa para calcular el costo de envío de un paquete según la zona y el peso.
 * 
 * El usuario selecciona una zona de envío y proporciona el peso del paquete en gramos.
 * El programa calcula el costo basado en la tarifa por gramo para la zona seleccionada.
 * Si el peso excede los 5000 gramos o es inválido, se muestra un mensaje de error.
 */
public class EmpresaTransporte {

    public static void main(String[] args) {
        // Declaración de variables
        int zona;
        int peso;

        // Crear un escáner para la entrada del usuario
        Scanner entrada = new Scanner(System.in);

        // Mostrar las opciones de zona
        System.out.println("Elige la zona del envío: ");
        System.out.println("1. América del Norte");
        System.out.println("2. América del Sur");
        System.out.println("3. América Central");
        System.out.println("4. Europa");
        System.out.println("5. Asia");

        // Leer la zona
        System.out.print("Introduce el número de la zona: ");
        zona = entrada.nextInt();

        // Leer el peso del paquete
        System.out.print("Introduce el peso del paquete en gramos: ");
        peso = entrada.nextInt();

        // Validar el peso
        if (peso <= 0) {
            System.out.println("Error: El peso debe ser positivo.");
        } else if (peso > 5000) {
            System.out.println("Error: El peso es demasiado elevado para realizar el transporte.");
        } else {
            // Validar la zona y calcular el costo
            double costo = 0;
            switch (zona) {
                case 1:
                    costo = peso * 0.024;
                    System.out.printf("El coste total del envío a América del Norte es de %.2f euros.%n", costo);
                    break;
                case 2:
                    costo = peso * 0.020;
                    System.out.printf("El coste total del envío a América del Sur es de %.2f euros.%n", costo);
                    break;
                case 3:
                    costo = peso * 0.021;
                    System.out.printf("El coste total del envío a América Central es de %.2f euros.%n", costo);
                    break;
                case 4:
                    costo = peso * 0.010;
                    System.out.printf("El coste total del envío a Europa es de %.2f euros.%n", costo);
                    break;
                case 5:
                    costo = peso * 0.018;
                    System.out.printf("El coste total del envío a Asia es de %.2f euros.%n", costo);
                    break;
                default:
                    System.out.println("Error: La zona seleccionada no es válida.");
                    break;
            }
        }

        // Cerrar el escáner
        entrada.close();
    }
}

