package com.ejercicios;

import java.util.Scanner;


public class ConversionMillas {
	
	/**
	 * Programa para convertir una distancia en millas náuticas a metros.
	 * 
	 * El usuario debe ingresar un número (puede incluir decimales) que represente
	 * las millas náuticas, y el programa mostrará el resultado convertido a metros.
	 */

    public static void main(String[] args) {
        // Longitud de una milla náutica en metros
        final double MILLA_NAUTICA_METROS = 1852;

        // Crear un escáner para la entrada del usuario
        Scanner entrada = new Scanner(System.in);

        // Solicitar al usuario la cantidad de millas
        System.out.print("Escribe el número de millas náuticas para convertirlas a metros: ");
        
        // Leer la entrada del usuario como un número decimal
        double numMillas = entrada.nextDouble();

        // Calcular la conversión
        double resultado = numMillas * MILLA_NAUTICA_METROS;

        // Mostrar el resultado con formato
        System.out.printf("El resultado es: %.2f metros%n", resultado);

        // Cerrar el escáner
        entrada.close();
    }
}
