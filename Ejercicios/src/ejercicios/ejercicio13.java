package ejercicios;

import java.util.Scanner;

public class ejercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		
		System.out.print("Introduce dos enteros ");
		int valor1=s.nextInt();
		int valor2=s.nextInt();
		int valor3=s.nextInt();
		
		
		System.out.println(valor1>valor2 && valor1>valor3 && valor2>valor3);
	}

}
