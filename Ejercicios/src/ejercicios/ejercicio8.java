package ejercicios;

import java.util.Scanner;

public class ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int valorC=0;
		
		Scanner s= new Scanner(System.in);
		
		System.out.println("Introduzca el valor de A:");
		int valorA=s.nextInt();
		
		System.out.println("Introduzca el valor de B:");
		int valorB=s.nextInt();
		
		System.out.println("El valor de A es " + valorA  + " y el valor de B es " + valorB);

		
		valorC=valorA;
		valorA=valorB;
		valorB=valorC;
		
		System.out.println("El valor de A es " + valorA  + " y el valor de B es " + valorB);
	}

}
