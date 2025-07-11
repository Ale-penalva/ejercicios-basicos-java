package com.ejercicios.calculos_practicos;

import java.util.Scanner;

public class CalcularSueldo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Scanner entrada=new Scanner (System.in);
		
		double Horas;
		double Sueldo;
		
		
			
		System.out.println("Horas trabajadas del mes: ");
		
		Horas=entrada.nextDouble();
		
		System.out.println("Salario por hora: ");
		
		double salario=entrada.nextDouble();
		
		Sueldo=Horas*salario;
		
		System.out.println("Tu sueldo de este mes es: " + Sueldo + " euros.");
		
		
		
		

	}

}
