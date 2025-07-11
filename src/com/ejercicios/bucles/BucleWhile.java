package com.ejercicios.bucles;
import java.util.Scanner;

public class BucleWhile {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Contraseña establecida
        String clave = "Ale";
        String pass = ""; // Variable para la contraseña ingresada por el usuario

        // Bucle que se repite hasta que se introduzca la contraseña correcta
        while (!clave.equals(pass)) {
            System.out.println("Introduce la contraseña, por favor:");
            
            // Leer la entrada como texto
            pass = entrada.nextLine();

            if (!clave.equals(pass)) {
                System.out.println("La contraseña es incorrecta");
            }
        }
        
        // Contraseña correcta
        System.out.println("Contraseña correcta. Acceso permitido");

        entrada.close(); // Cerrar el scanner
    }
}
