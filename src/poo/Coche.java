package poo;

public class Coche {

	private int ruedas;
	private int largo;
	private int ancho;
	private int motor;
	private int pesoPlataforma;
	private String color;
	private int peso_total;
	private boolean asientosCuero, climatizador;
	
	
	public Coche() {
		
		ruedas=4;
		
		largo=2000;
		
		ancho=300;
		
		motor=1600;
		
		pesoPlataforma=500;
		
	}
	
	//GETTER
	public int DimeRuedas() {
		return ruedas;
	}
	public String dimeDatos() {
		return "La plataforma del vehiculo tiene " + ruedas + " ruedas"
				+ " .Mide " + largo/1000 + " metros con un ancho de " + ancho + 
				" cm y un peso de plataforma de " + pesoPlataforma + " kg";
	}
	public String DimeColor() {
		return "El color del coche es " + color; 
	}
	
	public String dimeAsientos() {
		if(asientosCuero==true) {
			return "El coche tiene asientos de cuero";
		}
		else {
			return "El coche tiene asientos de serie";
		}
	}
	public String dimeClimatizador(){
		if(climatizador==true) {
			return "El coche tiene climatizador";
		}
		else {
			return "El coche tiene solo aire accondicionado";
		}
	}
	
	public int precioCoche() {
		int precioFinal=10000;
		if(asientosCuero==true) {
			precioFinal+=2000;
		}
		if(climatizador==true) {
			precioFinal+=1500;
		}
		return precioFinal;
	}
	
	//SETTER
	public void estableceColor(String colorCoche) {
		
		color=colorCoche;
	}
	public void configuraAsientos(String asientosCuero) {

		if(asientosCuero.equalsIgnoreCase("si")) {
			this.asientosCuero=true;
		}
		else{
			this.asientosCuero=false;
		}
	}
	
	public void configuraClimatizador(String climatizador) {
		
		if(climatizador.equalsIgnoreCase("si")) {
			this.climatizador=true;
		}
		else {
			this.climatizador=false;
		}
		
	}
	// SETTER & GETTER

	public String dimePesoCoche() {
		int pesoCarroceria=500;
		peso_total=pesoPlataforma+pesoCarroceria;
		if(asientosCuero==true) {
			peso_total+=50;
		}
		if(climatizador==true) {
			peso_total+=20;
		}
		return "El peso del coche es " + peso_total;

	}
	
}

