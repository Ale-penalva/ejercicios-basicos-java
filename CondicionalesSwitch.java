package com.ejercicios;
import java.util.*; 


public class CondicionalesSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Elige una opción: \n1: Cuadrado \n2: Rectángulo \n3: Triángulo \n4: Círculo");
	
		int figura=entrada.nextInt();
		
		switch(figura) {
		
		case 1:
			
			System.out.println("Introduce el lado: ");
			
			double lado=entrada.nextDouble();
			
			System.out.println("El área del cuadrado es: " + Math.pow(lado, 2));
		
		break;
		
		case 2:
			
			System.out.println("Introduce la base: ");
			
			int base=entrada.nextInt();
			
			System.out.println("Introduce la altura: ");
			
			int altura=entrada.nextInt();
				
			System.out.println("El área del rectángulo es: " + base*altura);
		break;
		
		case 3:
			System.out.println("Introduce la base: ");
			
			int baseTr=entrada.nextInt();
			
			System.out.println("Introduce la altura: ");
			
			int alturaTr=entrada.nextInt();
			
			System.out.println("El área del triángulo es " + (baseTr*alturaTr)/2);
		break;
		
		case 4:
			
			System.out.println("Introduce la base: ");
			
			int radio=entrada.nextInt();
			
			System.out.print("El área del círculo es ");
			
			System.out.printf("%1.2f", Math.PI*(Math.pow(radio, 2)));
			
			break;
			
		default:
			System.out.println("La opción no es correcta");
			
	}
		
	}

}
