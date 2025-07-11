package com.ejercicios.condicionales;

import java.util.Scanner;

/**
 * Programa que calcula la media de tres evaluaciones para un estudiante.
 * El programa solicita el nombre del estudiante y las tres notas,
 * calcula la media y muestra un mensaje según si ha aprobado o suspendido.
 */
public class MediaEvaluaciones {

    public static void main(String[] args) {
        // Declaración de variables
        String nombre; 
        double evaluacion1, evaluacion2, evaluacion3, resultado;

        // Crear un objeto Scanner para leer datos del usuario
        Scanner entrada = new Scanner(System.in);

        // Solicitar el nombre del estudiante
        System.out.println("Introduce tu nombre:");
        nombre = entrada.next();

        // Solicitar las tres notas, validando que sean números
        System.out.println("Introduce la nota de tu primera evaluación (entre 0 y 10):");
        evaluacion1 = entrada.nextDouble();

        System.out.println("Introduce la nota de la segunda evaluación (entre 0 y 10):");
        evaluacion2 = entrada.nextDouble();

        System.out.println("Introduce la nota de la tercera evaluación (entre 0 y 10):");
        evaluacion3 = entrada.nextDouble();

        // Validar que las notas estén en el rango de 0 a 10
        if ((evaluacion1 < 0 || evaluacion1 > 10) || 
            (evaluacion2 < 0 || evaluacion2 > 10) || 
            (evaluacion3 < 0 || evaluacion3 > 10)) {
            System.out.println("Error: Todas las notas deben estar entre 0 y 10.");
        } else {
            // Calcular la media de las evaluaciones
            resultado = (evaluacion1 + evaluacion2 + evaluacion3) / 3;

            // Mostrar el resultado
            System.out.println(nombre + ", el resultado de tu evaluación final es " + String.format("%.2f", resultado));

            // Mostrar un mensaje dependiendo del resultado
            if (resultado >= 5) {
                System.out.println("¡Enhorabuena, has superado el curso!");
            } else {
                System.out.println("Tienes que estudiar más...");
            }
        }

        // Cerrar el objeto Scanner
        entrada.close();
    }
}
