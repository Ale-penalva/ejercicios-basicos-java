package com.ejercicios.arrays;
public class ValorMasGrandeArray {

    public static void main(String[] args) {
        // Declaración e inicialización del array
        int grande[] = new int[] {12, 45, 7, 89, 33};
        int mayor = grande[0]; // Suponemos que el primer valor es el mayor

        // Recorremos el array para encontrar el mayor valor
        for (int i = 0; i < grande.length; i++) {
            if (grande[i] > mayor) {
                mayor = grande[i]; // Actualizamos si encontramos un valor mayor
            }
        }

        // Imprimimos el valor más grande después del bucle
        System.out.println("El número más grande del array es: " + mayor);
    }
}

