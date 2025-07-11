package com.ejercicios.condicionales;


import java.util.Scanner;

/**
 * Programa para determinar la cantidad de días de un mes.
 * 
 * El usuario introduce un número del 1 al 12, correspondiente a un mes, y el programa
 * muestra la cantidad de días que tiene ese mes.
 */
public class DiasDelMes {

    public static void main(String[] args) {
        // Declaración de variables
        int mes;

        // Crear el escáner para la entrada del usuario
        Scanner entrada = new Scanner(System.in);

        // Mostrar el menú de meses
        System.out.println("Selecciona un mes para saber cuántos días tiene:");
        System.out.println("1. Enero");
        System.out.println("2. Febrero");
        System.out.println("3. Marzo");
        System.out.println("4. Abril");
        System.out.println("5. Mayo");
        System.out.println("6. Junio");
        System.out.println("7. Julio");
        System.out.println("8. Agosto");
        System.out.println("9. Septiembre");
        System.out.println("10. Octubre");
        System.out.println("11. Noviembre");
        System.out.println("12. Diciembre");

        // Solicitar al usuario un número de mes
        System.out.print("\nIntroduce un número del 1 al 12: ");
        mes = entrada.nextInt();

        // Determinar los días del mes usando switch
        switch (mes) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                System.out.println("El mes seleccionado tiene 31 días.");
                break;
            case 4: case 6: case 9: case 11:
                System.out.println("El mes seleccionado tiene 30 días.");
                break;
            case 2:
                System.out.println("El mes seleccionado tiene 28 días.");
                break;
            default:
                System.out.println("Error: Debes introducir un número entre 1 y 12.");
        }

        // Cerrar el escáner
        entrada.close();
    }
}



