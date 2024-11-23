package com.ejercicios;

import java.util.Scanner;

public class Prác_arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		int positivo=0;
		
		int negativo=0;
		
		int cero=0;
		
		System.out.println("Introduce 10 números enteros:");
		
		Scanner entrada=new Scanner(System.in);
		
		int numeros[]=new int [10];
		
		for(int i=0;i<10;i++) {
			numeros[i]=entrada.nextInt();
			
			
		}
		for(int valores:numeros) {
			
			if(valores<0) negativo++;
			
			else if(valores>0) positivo++;
			
			else cero++;	
			
			
		}
	
System.out.println("En el array hay: \n " + positivo + " valores positivos \n " + negativo + " valores negativos y \n " + cero + " valores de cero");
	}

}
