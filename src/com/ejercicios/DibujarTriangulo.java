package com.ejercicios;


import java.util.Scanner;

public class DibujarTriangulo {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Pedir al usuario el tamaño del triángulo
        System.out.print("Introduce el número de filas para el triángulo: ");
        int filas = entrada.nextInt();

        // Dibujar el triángulo
        for (int i = 1; i <= filas; i++) {
            // Imprimir espacios para centrar
            for (int j = 1; j <= filas - i; j++) {
                System.out.print(" ");
            }
            // Imprimir asteriscos
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            // Nueva línea
            System.out.println();
        }

        entrada.close();
    }
}
