package com.ejercicios.strings;
import java.util.Scanner;
	public class ContadorLetras {

	    public static void main(String[] args) {
	   // Crear un objeto Scanner para leer la entrada del usuario
	     Scanner entrada = new Scanner(System.in);

		 System.out.println("Ingresa una palabra: ");
         String palabra = entrada.nextLine(); // Elimina espacios adicionales
         // Verificar si el usuario ingresó algo
	     if (palabra.isEmpty()) {
      	System.out.println("No ingresaste una palabra válida.");
      	} else {
        int contadorLetras = palabra.length(); // Cuenta los caracteres
	    System.out.println("Tu palabra es: " + palabra + ". Esta palabra tiene un total de: " + contadorLetras + " letras.");
	    }

        // Cerrar el Scanner
	     entrada.close();
		    

	}

}
