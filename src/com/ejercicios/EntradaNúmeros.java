package com.ejercicios;
import java.util.*;
public class EntradaNúmeros {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ejemplo
		//double x=10000.0;
		//System.out.printf("%1.2f", x/3); //Para reducir los decimales a 2. 
		//1.2 hace referencia a los decimales
		
		Scanner entrada = new Scanner (System.in); 
		
		System.out.println("Introduce un número: ");
				
		double num1=entrada.nextDouble();
		
		System.out.print("La raíz de " + num1 + " es "); //no usamos println porque no queremos 
		//un salto de línea
		
		System.out.printf("%1.2f", Math.sqrt(num1));
	
		
	}

}
