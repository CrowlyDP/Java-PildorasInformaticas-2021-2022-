package excepciones_I;

import javax.swing.*;

public class Varias_Excepciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
		division();
		}catch(ArithmeticException e) {
			
			System.out.println("No se puede dividir por 0");
			
		}catch(NumberFormatException e) {
			
			System.out.println("No has introducido un numero entero");
			//System.out.println(e.getMessage());
			System.out.println("Se ha generado un error de tipo: " + e.getClass().getName());
			
			
		}
	}

	static void division() {
		// TODO Auto-generated method stub
		int num1=Integer.parseInt(JOptionPane.showInputDialog("Introudce el dividendo"));
		int num2=Integer.parseInt(JOptionPane.showInputDialog("Introudce el divisor"));
		
		System.out.println("El resultado es: " + num1/num2);
		
		
	}

}

