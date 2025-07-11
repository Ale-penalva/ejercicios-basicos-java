package com.ejercicios.arrays;

public class SumaArrays {

    public static void main(String[] args) {
        // Declaramos un array con los valores
        int[] numeros = new int[] {2, 4, 6, 8};

        // Variable para acumular la suma
        int suma = 0;

        // Recorremos el array y sumamos los valores
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i]; // Acumulamos cada valor del array
        }

        // Mostramos el resultado final de la suma
        System.out.println("La suma de los arrays es: " + suma);
    }
}
