package com.ejercicios.condicionales;

import java.util.Scanner;

/**
 * Programa para clasificar la calificación de un alumno según su nota.
 * El usuario introduce su nombre y su nota, y el programa le indica
 * si ha suspendido, aprobado, obtenido un notable o un sobresaliente.
 */
public class Calificaciones {

    public static void main(String[] args) {
        // Variables
        float nota;
        String alumno;

        // Crear el escáner para la entrada del usuario
        Scanner entrada = new Scanner(System.in);

        // Solicitar el nombre del alumno
        System.out.print("Introduce tu nombre: ");
        alumno = entrada.nextLine();

        // Solicitar la nota del alumno
        System.out.print("Introduce tu nota (0 a 10): ");
        nota = entrada.nextFloat();

        // Validar que la nota esté en el rango correcto
        if (nota < 0 || nota > 10) {
            System.out.println("Error: La nota debe estar entre 0 y 10.");
        } else if (nota < 5) {
            System.out.println(alumno + ", has suspendido.");
        } else if (nota >= 5 && nota <= 7) {
            System.out.println(alumno + ", has aprobado.");
        } else if (nota > 7 && nota < 9) {
            System.out.println("¡Enhorabuena, " + alumno + ", tienes un notable!");
        } else if (nota >= 9 && nota < 10) {
            System.out.println("¡Lo has petado con un sobresaliente, " + alumno + "!");
        } else if (nota == 10) {
            System.out.println("¡Felicidades, " + alumno + ", has obtenido un 10 perfecto!");
        }

        // Cerrar el escáner
        entrada.close();
    }
}

		
		
		
	
			
		
			
			
		
	
		
		
		

	

