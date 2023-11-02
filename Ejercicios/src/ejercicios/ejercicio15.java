package ejercicios;

import java.util.Scanner;

public class ejercicio15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
		System.out.println("Introduce un carácter: ");
		String a=s.next();
		
		char c=a.charAt(0);
		
		int abc=c;
		
		System.out.println("Codigo ASCII de " + c + " es "  + abc);
		
		System.out.println("Los tres siguientes son: " + (char)(abc+1) + " - " + (char)(abc+2) + " - " + (char)(abc+3));

	}

}
