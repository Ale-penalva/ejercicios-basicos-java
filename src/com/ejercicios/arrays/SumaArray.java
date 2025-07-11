package com.ejercicios.arrays;
public class SumaArray {

    public static void main(String[] args) {
        // Inicializar el array con números dados
        int[] array = {25, 35, 65, 5, 20};
        int suma = 0; // Variable para almacenar la suma

        // Recorrer el array usando un bucle for-each
        for (int num : array) {
            suma += num; // Añadir cada elemento a la suma
        }

        // Mostrar el resultado
        System.out.println("La suma total de los elementos del array es: " + suma);
    }
}

