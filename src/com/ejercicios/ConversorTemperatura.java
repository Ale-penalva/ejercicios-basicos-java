package com.ejercicios;

import java.util.*;

public class ConversorTemperatura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
		System.out.println("Seleccione el método de conversión: ");
		System.out.println("1. De Celsius a Fahrenheit");
		System.out.println("2. De Farhenheit a Celsius");
		int opcion=entrada.nextInt();
		double temperatura; 
		
		switch(opcion){
		
		case 1: System.out.println("Ingrese la temperatura en Celsius: ");
		temperatura=entrada.nextDouble();
		double fahrenheit=(temperatura*9/5) + 32;
		System.out.println("El resultado es de : " + fahrenheit + " grados Fahrenheit");
		break;
		
		case 2: System.out.println ("Ingrese la temperatura en Fahrenheit: ");
		temperatura=entrada.nextDouble();
		double celsius = (temperatura - 32) * 5/9;
		System.out.println("El resultado es de : " + celsius + " grados Celsius");
		break;
		default:
        System.out.println("Opción no válida. Por favor, seleccione 1 o 2.");
        break;
    }
		

		
	}

}
