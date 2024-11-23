package com.ejercicios;

import java.util.Scanner;

/**
 * Programa que obtiene las iniciales del nombre completo de un usuario.
 * 
 * El usuario introduce su nombre, primer apellido y segundo apellido,
 * y el programa muestra las iniciales en formato "N.A.A."
 */
public class InicialesNombre {

    public static void main(String[] args) {
        // Declaración de variables
        String nombre;
        String apellido1;
        String apellido2;

        // Crear un escáner para la entrada del usuario
        Scanner entrada = new Scanner(System.in);

        // Solicitar el nombre al usuario
        System.out.print("Introduce tu nombre: ");
        nombre = entrada.next();

        System.out.print("Introduce tu primer apellido: ");
        apellido1 = entrada.next();

        System.out.print("Introduce tu segundo apellido: ");
        apellido2 = entrada.next();

        // Obtener las iniciales
        String iniciales = nombre.substring(0, 1).toUpperCase() + "." +
                           apellido1.substring(0, 1).toUpperCase() + "." +
                           apellido2.substring(0, 1).toUpperCase();

        // Mostrar las iniciales
        
        System.out.println ("Tus iniciales son: " + iniciales);

        // Cerrar el escáner
    }
}
        

