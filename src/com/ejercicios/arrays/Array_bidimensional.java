package com.ejercicios.arrays;

public class Array_bidimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int [][] numeros=new int [5][3];
		
		numeros [0] [0]=23;
		numeros [0] [1]=13;
		numeros [0] [2]=43;
						
		numeros [1] [0]=11;
		numeros [1] [1]=21;
		numeros [1] [2]=61;
		
		numeros [2] [0]=38;
		numeros [2] [1]=48;
		numeros [2] [2]=8;
		
		numeros [3] [0]=24;
		numeros [3] [1]=44;
		numeros [3] [2]=54;
		
		numeros [4] [0]=16;
		numeros [4] [1]=26;
		numeros [4] [2]=36;
		
		for (int i=0;i<5;i++) {
			for (int z=0;z<3;z++) {
				
				System.out.print(numeros[i][z] + " ");
				
				
			}
		}
			
		

	}

}
