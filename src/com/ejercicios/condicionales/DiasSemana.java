package com.ejercicios.condicionales;

import java.util.Scanner;

/**
 * Programa que devuelve el día de la semana correspondiente a un número del 1 al 7.
 * 
 * El usuario introduce un número, y el programa muestra el día de la semana asociado.
 * Si el número está fuera del rango, muestra un mensaje de error.
 */
public class DiasSemana {

    public static void main(String[] args) {
        // Crear un escáner para la entrada del usuario
        Scanner entrada = new Scanner(System.in);

        // Declarar la variable para el día
        int dia;

        // Mostrar el menú de días de la semana
        System.out.println("Este programa te devuelve el día de la semana seleccionado:");
        System.out.println(" 1 = Lunes");
        System.out.println(" 2 = Martes");
        System.out.println(" 3 = Miércoles");
        System.out.println(" 4 = Jueves");
        System.out.println(" 5 = Viernes");
        System.out.println(" 6 = Sábado");
        System.out.println(" 7 = Domingo");

        // Solicitar al usuario un número
        System.out.print("Introduce un número del 1 al 7: ");
        dia = entrada.nextInt();

        // Determinar el día de la semana usando switch
        switch (dia) {
            case 1:
                System.out.println("El día seleccionado es: Lunes");
                break;
            case 2:
                System.out.println("El día seleccionado es: Martes");
                break;
            case 3:
                System.out.println("El día seleccionado es: Miércoles");
                break;
            case 4:
                System.out.println("El día seleccionado es: Jueves");
                break;
            case 5:
                System.out.println("El día seleccionado es: Viernes");
                break;
            case 6:
                System.out.println("El día seleccionado es: Sábado");
                break;
            case 7:
                System.out.println("El día seleccionado es: Domingo");
                break;
            default:
                System.out.println("Error: Debes introducir un número entre 1 y 7.");
        }

        // Cerrar el escáner
        entrada.close();
    }
}

