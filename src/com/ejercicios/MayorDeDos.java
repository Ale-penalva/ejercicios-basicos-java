package com.ejercicios;
import java.util.*;

public class MayorDeDos {

    public static void main(String[] args) {
        // Declaración de variables
        int num1, num2; 
        
        // Crear el objeto Scanner
        Scanner entrada = new Scanner(System.in);

        // Solicitar al usuario los números
        System.out.println("Introduce un número: ");
        num1 = entrada.nextInt();
        
        System.out.println("Introduce un segundo número: ");
        num2 = entrada.nextInt();

        // Comparación de los números
        if (num1 < num2) {
            System.out.println("El mayor es " + num2);
        } else if (num1 == num2) {
            System.out.println("Los números son iguales.");
        } else {
            System.out.println("El mayor es " + num1);
        }
        
        // Cerrar el Scanner
        entrada.close();
    }
}

