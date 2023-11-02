package excepciones_I;
import javax.swing.*;

public class Fallos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] matriz=new int[5];
		matriz[0]=5;
		matriz[1]=38;
		matriz[2]=-15;
		matriz[3]=92;
		matriz[4]=71;
		matriz[5]=1;
		
		for(int i=0; i<5; i++) {
			System.out.println("Posición " + i + " = " + matriz[i]);
		}
		
		//Peticion de datos personales
		
		String nombre=JOptionPane.showInputDialog("Introduce tu nombre");
		
		int edad=Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad"));
		
		System.out.println("Hola " + nombre + " Tienes " + edad + " años." + " El programa finalizó su ejeccución");
		
	}
	
	

}
