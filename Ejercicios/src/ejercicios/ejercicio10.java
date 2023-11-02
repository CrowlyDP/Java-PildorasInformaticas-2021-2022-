package ejercicios;

import java.util.Scanner;

public class ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
		System.out.println("Escribe un tiempo en segundos:");
		double segundos=s.nextDouble();
		
		if(segundos>3600) {
			double horas=segundos/3600;
			double resto=(segundos/3600)-Math.round(segundos/3600);
			
			//System.out.println(Math.round(segundos/3600));
			//System.out.println(resto + " Resto");
			if(resto>0) {
				
			double minutos=resto*60;
			
			System.out.println(minutos + " minutos");
			
	
			double resto2=(minutos)-Math.round(minutos);
			if(resto2>0) {
				
			
			double seg=resto2*60;
			
			System.out.println(segundos + " segundos son: " + (int)horas + "horas y " + (int)minutos + " minutos y " + seg + " segundos");

			}
		}
			
	}
		
		
		
		
	}

}
