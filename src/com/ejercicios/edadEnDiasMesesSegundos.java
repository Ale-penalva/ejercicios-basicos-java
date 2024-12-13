package com.ejercicios;

import java.util.Scanner;

public class edadEnDiasMesesSegundos {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Solicitar la edad al usuario
        System.out.print("🎂 Introduce tu edad en años: ");
        int edad = entrada.nextInt();

        // Cálculos
        int edadDias = edad * 365; // Aproximación sin años bisiestos
        int edadMeses = edad * 12; // 12 meses por año
        long edadSegundos = (long) edadDias * 24 * 60 * 60; // Días a segundos

        // Mostrar resultados con mensajes graciosos
        System.out.println("\n🗓️ ¡Tu edad en diferentes unidades!");
        System.out.println("📅 En días: " + edadDias + " días (¡qué montón de amaneceres has vivido!)");
        System.out.println("📆 En meses: " + edadMeses + " meses (casi como pagar una hipoteca 😜)");
        System.out.println("⏳ En segundos: " + edadSegundos + " segundos (¡más tiempo que lo que tarda en cargar tu ordenador!)");

        // Cerrar el Scanner
        entrada.close();
    }
}

