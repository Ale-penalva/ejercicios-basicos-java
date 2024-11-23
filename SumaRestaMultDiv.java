package com.ejercicios;

/**
 * Programa que realiza las operaciones básicas (suma, resta, multiplicación y división)
 * entre dos números enteros y muestra los resultados.
 */
public class SumaRestaMultDiv {

    public static void main(String[] args) {
        // Declaración de variables
        int x = 999;
        int y = 140;

        // Mostrar los valores de x e y
        System.out.println("El valor de x es: " + x);
        System.out.println("El valor de y es: " + y);

        // Operaciones básicas
        System.out.println("La suma de x e y es: " + (x + y));
        System.out.println("La resta de x e y es: " + (x - y));
        System.out.println("La multiplicación de x e y es: " + (x * y));

        // Manejo de la división
        if (y != 0) {
            System.out.println("La división de x entre y es: " + (x / y));
        } else {
            System.out.println("Error: No se puede dividir por cero.");
        }
    }
}
