package poo;

import javax.swing.JOptionPane;

public class Uso_Vehiculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		Coche Renault=new Coche(); //Instanciar una clase. 
		
		Renault.estableceColor(JOptionPane.showInputDialog("Introduce color"));
		
		System.out.println(Renault.DimeColor());
		
		System.out.println(Renault.dimeDatos());
		
		Renault.configuraAsientos(JOptionPane.showInputDialog("¿Tiene asientos de cuero?"));
		System.out.println(Renault.dimeAsientos());
		
		Renault.configuraClimatizador(JOptionPane.showInputDialog("¿Tiene climatizador?"));
		
		System.out.println(Renault.dimeClimatizador());
		
		System.out.println(Renault.dimePesoCoche());
		
		System.out.println("El precio final del coche es: " + Renault.precioCoche());
		*/
	
		Coche micoche1=new Coche();
		
		micoche1.estableceColor("Rojo");
		
		Furgoneta mifurgoneta1=new Furgoneta(7,580);
	
		mifurgoneta1.estableceColor("azul");
		mifurgoneta1.configuraAsientos("si");
		mifurgoneta1.configuraClimatizador("si");
		
		System.out.println(micoche1.dimeDatos() + ". " + micoche1.DimeColor());
		
		System.out.println(mifurgoneta1.dimeDatos() + ". " + mifurgoneta1.dimeDatosFurgoneta());
	}
}
