import java.util.Scanner;

/**
 * Programa que solicita un carácter al usuario y determina si es:
 * - Un número
 * - Una letra mayúscula
 * - Una letra del alfabeto
 * - Otro tipo de carácter
 */
public class IdentificaCaracter {

    public static void main(String[] args) {
        // Crear objeto Scanner para leer entrada del usuario
        Scanner entrada = new Scanner(System.in);

        // Solicitar el carácter al usuario
        System.out.print("Introduce un carácter: ");
        char caracter = entrada.next().charAt(0);

        // Determinar el tipo de carácter ingresado
        if (Character.isDigit(caracter)) {
            System.out.println(caracter + " es un número.");
        } else if (Character.isUpperCase(caracter)) {
            System.out.println(caracter + " es una letra mayúscula.");
        } else if (Character.isLowerCase(caracter)) {
            System.out.println(caracter + " es una letra minúscula.");
        } else if (Character.isLetter(caracter)) {
            System.out.println(caracter + " es una letra del alfabeto.");
        } else {
            System.out.println(caracter + " no es ni una letra ni un número.");
        }

        // Cerrar el Scanner
        entrada.close();
    }
}



