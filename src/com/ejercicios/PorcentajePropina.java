package com.ejercicios;

import java.util.Scanner;

public class PorcentajePropina {

    public static void main(String[] args) {
        // Crear el objeto Scanner
        Scanner entrada = new Scanner(System.in);

        // Solicitar el importe de la cuenta
        System.out.print("Ingrese el importe de su cuenta (en euros): ");
        double cuenta = entrada.nextDouble();

        // Validar que la cuenta no sea negativa
        if (cuenta < 0) {
            System.out.println("❌ El importe de la cuenta no puede ser negativo.");
            return;
        }

        // Solicitar el porcentaje de propina
        System.out.print("¿Qué porcentaje de propina desea dejar? ");
        double porcentaje = entrada.nextDouble();

        // Validar que el porcentaje no sea negativo
        if (porcentaje < 0) {
            System.out.println("❌ El porcentaje de propina no puede ser negativo.");
            return;
        }

        // Calcular la cantidad de la propina y el total
        double cantPorce = (cuenta * porcentaje) / 100;
        double total = cuenta + cantPorce;

        // Mostrar los resultados con diseño
        System.out.println("\n━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.println("               💳 RESUMEN DE SU CUENTA               ");
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.printf("💵 Importe: %.2f euros%n", cuenta);
        System.out.printf("💸 Porcentaje de propina: %.2f%%%n", porcentaje);
        System.out.printf("🤑 Propina: %.2f euros%n", cantPorce);
        System.out.printf("💳 Total a pagar: %.2f euros%n", total);
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");

        // Cerrar el Scanner
        entrada.close();
    }
}



