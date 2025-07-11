package com.ejercicios.juegos;
public class SimuladorDado {

    public static void main(String[] args) {
        // Simular el lanzamiento de un dado de 6 caras
        int dado = (int)(Math.random() * 6) + 1; // Genera números entre 1 y 6
        
        // Mostrar el resultado
        if (dado == 6) {
            System.out.println("¡Enhorabuena, ha salido un 6!");
        } else {
            System.out.println("El dado ha sacado un: " + dado);
        }
    }
}
