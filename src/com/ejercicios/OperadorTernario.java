package com.ejercicios;
import java.util.Scanner;

public class OperadorTernario {

    public static void main(String[] args) {
        // Declaración de variables
        double temperatura; 
        
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce la temperatura actual: ");
        temperatura = entrada.nextDouble();
        
        // Usar el operador ternario para clasificar la temperatura
        String mensaje = (temperatura > 25) ? "Cálido" : 
                         (temperatura <= 15) ? "Frío" : "Templado";
                         
        // Imprimir el resultado
        System.out.println("La temperatura se clasifica como: " + mensaje);
        
        // Cerrar el Scanner
        entrada.close();
    }
}
