package com.ejercicios;
import java.util.Scanner;

public class UT1_P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada=new Scanner(System.in);
		System.out.print("Dime el valor del radio de un círculo:");
		double radio=entrada.nextDouble();
		double areaCirculo= Math.PI* Math.pow(radio, 2);
		double perimetroCirculo=Math.PI*2*radio;
		System.out.print("Ahora dime el valor de la base de un rectángulo: ");
		double base=entrada.nextDouble();
		System.out.print("No olvides decirme el valor de la altura del rectángulo: ");
		double altura=entrada.nextDouble();
		double areaRectangulo= base*altura;
		System.out.printf("De momento tenemos un círculo de perímetro %.2f y área %.2f y un rectángulo con área %.2f.%n", perimetroCirculo, areaCirculo, areaRectangulo);
		System.out.print("Me gusta el teorema de pitágoras, dime el valor del cateto 1: ");
		double cateto1=entrada.nextDouble();
		System.out.print("Y ahora del cateto 2:");
		double cateto2=entrada.nextDouble();
		double hipotenusaCuadrado = Math.pow(cateto1, 2) + Math.pow(cateto2, 2); 
	    double hipotenusa = Math.sqrt(hipotenusaCuadrado);                      
	    System.out.printf("El valor de la hipotenusa al cuadrado es %.2f, por lo tanto, la hipotenusa es %.2f.%n",
	            hipotenusaCuadrado, hipotenusa);
		

	}

}
