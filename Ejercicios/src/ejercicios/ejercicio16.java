package ejercicios;

import java.util.Scanner;

public class ejercicio16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		
		System.out.print("Introudce la cantidad: ");
		int cantidad=s.nextInt();
		
		int cantidad2=cantidad-500*(cantidad/500); //Cantidad restante para Billetes 200
		
		int cantidad3=cantidad2-200*(cantidad2/200); //Cantidad restante para Billetes 100
		
		int cantidad4=cantidad3-100*(cantidad3/100); //Cantidad restante para Billetes 50
		
		int cantidad5=cantidad4-50*(cantidad4/50); //Cantidad restante para Billetes 20
		
		int cantidad6=cantidad5-20*(cantidad5/20); //Cantidad restante para Billetes 10
		
		int cantidad7=cantidad6-10*(cantidad6/10); //Cantidad restante para Billetes 5
		
		int cantidad8=cantidad7-5*(cantidad7/5); //Cantidad restante para Monedas
		
		
		System.out.println("Billetes de 500: " + cantidad/500);
		System.out.println("Billetes de 200: " + cantidad2/200);
		System.out.println("Billetes de 100: " + cantidad3/100);
		System.out.println("Billetes de 50: " + cantidad4/50);
		System.out.println("Billetes de 20: " + cantidad5/20);
		System.out.println("Billetes de 10: " + cantidad6/10);
		System.out.println("Billetes de 5: " + cantidad7/5);
		System.out.println("Monedas " + cantidad8 + " €");

	}

}
