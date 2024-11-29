package com.ejercicios;

import java.util.Scanner;

/**
 * Programa que permite al usuario intentar adivinar una contraseña numérica
 * con un máximo de 4 intentos. Si acierta, muestra un mensaje de éxito; 
 * si no, indica que ha agotado los intentos.
 */
public class ContraseñaBucles {

    public static void main(String[] args) {
        // Declaración de variables
        final int CONTRASEÑA_CORRECTA = 1993;
        final int MAX_INTENTOS = 4;
        int intentosRestantes = MAX_INTENTOS;
        boolean acertado = false;
        int numUsuario;

        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner entrada = new Scanner(System.in);

        // Bucle para validar la contraseña
        do {
            System.out.println("Introduce el código correcto para entrar:");
            numUsuario = entrada.nextInt();

            if (numUsuario == CONTRASEÑA_CORRECTA) {
                acertado = true;
            } else {
                intentosRestantes--;
                System.out.println("Clave incorrecta. Te quedan " + intentosRestantes + " intentos.");
            }
        } while (intentosRestantes > 0 && !acertado);

        // Mostrar el resultado final
        if (acertado) {
            System.out.println("Correcto, has ingresado con éxito.");
        } else {
            System.out.println("Lo siento, has agotado los intentos.");
        }

        // Cerrar el objeto Scanner
        entrada.close();
    }
}

