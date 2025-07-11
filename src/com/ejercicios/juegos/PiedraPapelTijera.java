package com.ejercicios.juegos;
import java.util.Scanner;

public class PiedraPapelTijera {

    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner entrada = new Scanner(System.in);

        // Mostrar las opciones al usuario
        System.out.println("Elige entre: ");
        System.out.println("1. Piedra");
        System.out.println("2. Papel");
        System.out.println("3. Tijera");
        
        // Leer la elección del usuario
        int opcion = entrada.nextInt();

        // Validar la elección del usuario
        if (opcion < 1 || opcion > 3) {
            System.out.println("Opción no válida. Debes elegir 1, 2 o 3.");
        } else {
            // Mostrar la elección del usuario
            switch (opcion) {
                case 1:
                    System.out.println("Has elegido: Piedra");
                    break;
                case 2:
                    System.out.println("Has elegido: Papel");
                    break;
                case 3:
                    System.out.println("Has elegido: Tijera");
                    break;
            }

            // Generar la elección del ordenador (0 = Piedra, 1 = Papel, 2 = Tijera)
            int opcionOrdenador = (int) (Math.random() * 3) + 1;

            // Mostrar la elección del ordenador
            switch (opcionOrdenador) {
                case 1:
                    System.out.println("El ordenador eligió: Piedra");
                    break;
                case 2:
                    System.out.println("El ordenador eligió: Papel");
                    break;
                case 3:
                    System.out.println("El ordenador eligió: Tijera");
                    break;
            }

            // Determinar el resultado
            if (opcion == opcionOrdenador) {
                System.out.println("Empate.");
            } else if ((opcion == 1 && opcionOrdenador == 3) || 
                       (opcion == 2 && opcionOrdenador == 1) || 
                       (opcion == 3 && opcionOrdenador == 2)) {
                System.out.println("¡Has ganado!");
            } else {
                System.out.println("El ordenador gana.");
            }
        }

        // Cerrar el Scanner
        entrada.close();
    }
}
		
	
	
	
	
	
	

