package com.clases;

public class Main {

	public static void main(String[] args) {
		
		int[] arreglo = new int[8];
		
		arreglo[0] = -2;
		arreglo[1] = 16;
		arreglo[2] = 2;
		arreglo[3] = 2;
		arreglo[4] = 2;
		arreglo[5] = 3;
		arreglo[6] = 13;
		arreglo[7] = 4;
		
		boolean esDivisible = false;
		
		for (int i = 0; i < arreglo.length; i++) {
			int sumaParte1 = 0;
			int sumaParte2 = 0;
			
			for (int j = 0; j <= i; j++) {
				sumaParte1 += arreglo[j];
			}
			
			for (int j = (i + 1); j < arreglo.length; j++) {
				sumaParte2 += arreglo[j];
			}
			
			if(sumaParte1 == sumaParte2) {
				esDivisible = true;
				break;
			}
			
		}
		
		System.out.println("El arreglo se puede dividir y su suma es igual ?  " + esDivisible);

	}

}
