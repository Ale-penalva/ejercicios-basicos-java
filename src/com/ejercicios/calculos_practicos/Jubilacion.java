package com.ejercicios.calculos_practicos;
import java.util.Scanner;

public class Jubilacion {

    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner entrada = new Scanner(System.in);

        // Solicitar la edad del usuario
        System.out.print("Ingresa tu edad: ");
        int edad = entrada.nextInt();

        // Definir la edad de jubilación
        int edadJubilacion = 65;

        // Validar la edad ingresada
        if (edad < 0) {
            System.out.println("La edad ingresada no es válida. Por favor, ingresa un número positivo.");
        } else if (edad >= edadJubilacion) {
            System.out.println("¡Felicidades! Ya deberías estar cobrando tu pensión de jubilación.");
        } else {
            int edadRestante = edadJubilacion - edad;
            System.out.println("Te faltan " + edadRestante + " años para jubilarte.");
        }

        // Cerrar el Scanner
        entrada.close();
    }
}

