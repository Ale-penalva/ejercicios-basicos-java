package com.ejercicios.entrada_salida;
import java.util.*;

public class ClaseScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Introduce tu nombre, por favor");
		
		String nombre_usuario=entrada.nextLine();
		
		System.out.println("Introduce edad, por favor");
		
		int edad=entrada.nextInt();
		
		System.out.println("Hola, " + nombre_usuario + ". El año que viene tendrás " + (edad+1) + " años");
	}

}
