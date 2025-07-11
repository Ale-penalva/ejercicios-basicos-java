package com.ejercicios.bucles;

public class BucleFor {

    public static void main(String[] args) {
        // Este programa imprime múltiplos de 5 (usando for) y múltiplos de 4 (usando while) hasta 100.

        // Múltiplos de 5 del número 100 con bucle for
        for (int num = 0; num <= 100; num += 5) {
            System.out.println(num);
        }

        // Múltiplos de 4 con bucle while
        int i = 0;
        while (i <= 100) {
            System.out.println(i);
            i += 4;
        }
    }
}
