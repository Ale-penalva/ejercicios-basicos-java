package com.ejercicios;

import java.util.Scanner;

public class SimuladorLoteria {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Solicitar la opción del usuario
        System.out.println("Elige CARA (0) o CRUZ (1): ");
        int opcUsu = entrada.nextInt();

        // Validar que la entrada del usuario sea válida
        if (opcUsu != 0 && opcUsu != 1) {
            System.out.println("❌ Opción inválida. Solo puedes elegir 0 (CARA) o 1 (CRUZ).");
            return;
        }

        // Generar el resultado de la moneda
        int num = (int) (Math.random() * 2); // 0 para CARA, 1 para CRUZ
        String resultado = (num == 0) ? "CARA" : "CRUZ";

        // Determinar el resultado del juego
        System.out.println("Tu elección: " + (opcUsu == 0 ? "CARA" : "CRUZ"));
        System.out.println("La moneda ha salido: " + resultado);

        if (opcUsu == num) {
            System.out.println("🎉 ¡ENHORABUENA! Has acertado.");
        } else {
            System.out.println("😢 ¡Lo siento! No has acertado.");
        }

        entrada.close();
    }
}

