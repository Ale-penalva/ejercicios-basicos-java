package com.ejercicios;

import java.util.Scanner;

public class Actividad1 {
    public static void main(String[] args) {

        // Enunciado del programa
        System.out.println("Este programa calcula el precio final de un producto.");
        System.out.println("Si el precio es mayor a 100, se aplicará un descuento del 10%.");
        System.out.println("Si el precio es menor a 30, se añadirá una penalización de 2 euros.");
        System.out.println("En cualquier otro caso, el precio se mantendrá sin cambios.");
        System.out.println("----------------------------------------------------------");

        Scanner entrada = new Scanner(System.in);

        // Solicitar al usuario que ingrese el precio
        System.out.print("Ingrese el precio del producto: ");
        double precio;
        int bonificación = 2;
        precio = entrada.nextDouble();

        // Condición 1: Si el precio es mayor que 100, se aplica un descuento del 10%
        if (precio > 100) {
            precio -= precio * 0.10; // Aplicar un descuento del 10%
            System.out.println("Se ha aplicado un descuento del 10%. El nuevo precio es: " + precio + " euros.");
            return;
        }

        // Condición 2: Si el precio es menor que 30, se aplica una penalización de 2 euros
        if (precio < 30) {
            precio = precio + bonificación; // Penalización de 2 euros
            System.out.println("Se ha aplicado una penalización de 2 euros. El nuevo precio es: " + precio + " euros.");
        } else {
            System.out.println("Su precio final es de: " + precio + " euros.");
        }

        entrada.close(); // Cerrar el Scanner
    }
}
