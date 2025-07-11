package com.ejercicios.calculos_practicos;
import java.util.Scanner;

/**
 * Programa que calcula el sueldo de un empleado según su categoría.
 * Además, asocia cada categoría con un puesto de empleo específico.
 */
public class SueldoporCategoria {

    public static void main(String[] args) {
        // Declaración de variables
        double sueldo = 0;
        int categoria;

        // Crear un objeto Scanner para leer datos del usuario
        Scanner entrada = new Scanner(System.in);

        // Solicitar la categoría al usuario
        System.out.println("Introduce tu categoría de trabajo (1, 2 o 3):");
        categoria = entrada.nextInt();

        // Asignar sueldo según la categoría
        switch (categoria) {
            case 1:
                sueldo = 10000;
                System.out.println("La categoría 1 pertenece al puesto de empleo: Reponedor.");
                break;
            case 2:
                sueldo = 15000;
                System.out.println("La categoría 2 pertenece al puesto de empleo: Supervisor.");
                break;
            case 3:
                sueldo = 20000;
                System.out.println("La categoría 3 pertenece al puesto de empleo: Directivo.");
                break;
            default:
                System.out.println("Introduce una categoría válida (1, 2 o 3).");
                return; // Finaliza el programa si la categoría no es válida
        }

        // Mostrar el sueldo y la categoría si esta es válida
        System.out.println("Tu categoría es: " + categoria + " y tu sueldo es de: " + sueldo + " al año.");

        // Cerrar el objeto Scanner
        entrada.close();
    }
}

