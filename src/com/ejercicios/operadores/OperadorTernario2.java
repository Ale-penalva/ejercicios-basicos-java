package com.ejercicios.operadores;
import java.util.Scanner;

public class OperadorTernario2 {

    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner entrada = new Scanner(System.in);
        
        // Solicitar la edad al usuario
        System.out.println("Introduce tu edad: ");
        int edad = entrada.nextInt();

        // Clasificar la edad utilizando operadores ternarios
        String mensaje = (edad <= 12) ? "Niño" :
                         (edad <= 17) ? "Adolescente" :
                         (edad <= 64) ? "Adulto" : "Mayor";
        
        // Imprimir el resultado
        System.out.println("Clasificación: " + mensaje);
        
        // Cerrar el Scanner
        entrada.close();
    }
}

