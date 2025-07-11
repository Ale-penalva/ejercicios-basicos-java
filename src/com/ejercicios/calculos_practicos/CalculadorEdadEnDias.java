package com.ejercicios.calculos_practicos;
import java.util.Scanner;

public class CalculadorEdadEnDias {

    public static void main(String[] args) {
        // Escáner para entrada de datos
        Scanner entrada = new Scanner(System.in);

        // Solicitar la edad al usuario
        System.out.println("Introduce tu edad: ");
        int edad = entrada.nextInt();

        // Cálculo básico
        int diasNormales = edad * 365;

        // Calcular años bisiestos (1 cada 4 años)
        int aniosBisiestos = edad / 4;
        int diasTotales = diasNormales + aniosBisiestos;

        // Mostrar el resultado
        System.out.println("Tu edad en días (considerando años bisiestos) es de " + diasTotales + " días.");

        // Cerrar el Scanner
        entrada.close();
    }
}
