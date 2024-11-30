package com.ejercicios;

import java.util.*;

public class EntradaScanner2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Introduce tu nombre");
		
		String nombre=entrada.nextLine();
		
		System.out.println("Introduce un número");
		
		int numero=entrada.nextInt();
		
		
		System.out.println("Introduce un segundo número:");
		
		int numero2=entrada.nextInt();
		
		System.out.println("Introduce un tercer número:");
		
		int numero3=entrada.nextInt();
		
		System.out.println("Hola, " + nombre + ", la suma de todo es: " + (numero+numero2+numero3) );
		
		entrada.close();
}
	
	}