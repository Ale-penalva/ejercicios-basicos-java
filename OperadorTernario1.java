package com.ejercicios;

/**
 * Programa que determina si una persona es mayor o menor de edad
 * utilizando el operador ternario. El resultado se imprime por pantalla.
 */
public class OperadorTernario1 {

    public static void main(String[] args) {
        // Declaración de la variable de edad
        int edad = 30;

        // Determinación del mensaje usando el operador ternario
        String mensaje = (edad >= 18) ? "Mayor de edad" : "Menor de edad";

        // Mostrar el mensaje por pantalla
        System.out.println("La persona es: " + mensaje);
    }
}
