package com.ejercicios.calculos_basicos;
/**
 * Programa que intercambia los valores de dos variables enteras
 * usando una variable auxiliar. Muestra por pantalla los valores
 * antes y después del intercambio.
 */
public class IntercambioVariables {

    public static void main(String[] args) {
        // Declaración e inicialización de las variables
        int num1 = 10; // Primer número
        int num2 = 13; // Segundo número
        int aux; // Variable auxiliar para realizar el intercambio

        // Mostrar los valores iniciales de las variables
        System.out.println("Antes del intercambio:");
        System.out.println("num1 vale: " + num1);
        System.out.println("num2 vale: " + num2);

        // Intercambio de los valores utilizando una variable auxiliar
        aux = num2; // Guardar el valor de num2 en la variable auxiliar
        num2 = num1; // Asignar el valor de num1 a num2
        num1 = aux;  // Recuperar el valor de num2 desde la variable auxiliar

        // Mostrar los valores después del intercambio
        System.out.println("\nDespués del intercambio:");
        System.out.println("num1 vale: " + num1);
        System.out.println("num2 vale: " + num2);
    }
}
