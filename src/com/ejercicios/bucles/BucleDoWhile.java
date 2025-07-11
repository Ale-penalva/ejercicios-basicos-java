package com.ejercicios.bucles;

public class BucleDoWhile {

    public static void main(String[] args) {
        /*Este programa utiliza bucles 'do-while' para contar de 350 a 100 en pasos de -50, y de 0 a 100 en
    	pasos de +5.*/

        // Primer bucle: decrementa desde 350 hasta 100 en pasos de 50
        int i = 350;
        do {
            System.out.println(i);
            i -= 50;
        } while (i > 100);

        // Segundo bucle: incrementa desde 0 hasta 100 en pasos de 5
        int b = 0;
        do {
            System.out.println(b);
            b += 5;
        } while (b <= 100);
    }
}

