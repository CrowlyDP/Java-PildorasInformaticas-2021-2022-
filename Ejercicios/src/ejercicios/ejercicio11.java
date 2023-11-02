package ejercicios;

import java.util.Scanner;

public class ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		
		System.out.println("Dime la longitud de la habitacion en m");
		double lon=s.nextDouble();
		System.out.println("Dime la anchura de la habitacion en m");
		double anch=s.nextDouble();
		
		System.out.printf("%5.4f", lon*anch);
		System.out.print(" metros cuadrados");
	}

}
