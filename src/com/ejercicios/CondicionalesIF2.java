package com.ejercicios;
import java.util.*;

public class CondicionalesIF2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Introduce tu edad, por favor");
		
		int edad=entrada.nextInt();
		
		if (edad<18) {
			
			System.out.println("Eres menor de edad");
				
		}
		
		else if(edad<40) {
			
			System.out.println("Eres joven");
		}
		
		else if(edad<65) {
			
			System.out.println("Estás ya mayorcete");
			
		}
		
		else
			System.out.println("Cuídate");
		
	}

}
