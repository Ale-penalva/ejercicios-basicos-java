package com.ejercicios;


import java.util.*;

public class AñoBisiesto {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int año;
		
		Scanner entrada =new Scanner (System.in);
		
		System.out.println("Introduce un año para ver si es/será/fue bisiesto: ");
		
		año=entrada.nextInt();
		
		if ((año & 400) ==0 && ((año&4)==0)) {
			
			System.out.println("El año es bisiesto");
		}
			
			else if ((año&100) ==0) {
				
				System.out.println("No es bisiesto");
				
			}
		
			else  {
				
				System.out.println("No es bisiesto");
			}
			
		}
		

	}


