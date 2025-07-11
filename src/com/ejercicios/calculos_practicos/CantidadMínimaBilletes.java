package com.ejercicios.calculos_practicos;
import java.util.Scanner;

/**
 * Programa para calcular la cantidad mínima de billetes y monedas necesarios
 * para una cantidad dada en euros. 
 * 
 * El usuario debe introducir una cantidad entera en euros, y el programa
 * desglosará dicha cantidad en billetes de 100€, 50€, 20€, 10€, 5€, 
 * y monedas de 2€ y 1€.
 */
public class CantidadMínimaBilletes {

    public static void main(String[] args) {
        // Escáner para entrada de datos
        Scanner entrada = new Scanner(System.in);

        // Pedir cantidad
        System.out.print("Introduce una cantidad en euros: ");
        int cantidad = entrada.nextInt();

        // Declaración de valores de billetes y monedas
        final int[] valores = {100, 50, 20, 10, 5, 2, 1};
        int[] cantidades = new int[valores.length];

        // Cálculo de la cantidad mínima de billetes y monedas
        for (int i = 0; i < valores.length; i++) {
            cantidades[i] = cantidad / valores[i];
            cantidad = cantidad % valores[i];
        }

        // Mostrar resultados
        System.out.println("\nDesglose en billetes y monedas:");
        System.out.println("Billetes de 100€: " + cantidades[0]);
        System.out.println("Billetes de 50€: " + cantidades[1]);
        System.out.println("Billetes de 20€: " + cantidades[2]);
        System.out.println("Billetes de 10€: " + cantidades[3]);
        System.out.println("Billetes de 5€: " + cantidades[4]);
        System.out.println("Monedas de 2€: " + cantidades[5]);
        System.out.println("Monedas de 1€: " + cantidades[6]);

        entrada.close(); // Cerrar el escáner
    }
}
