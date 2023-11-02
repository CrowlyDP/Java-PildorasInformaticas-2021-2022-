package poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_Persona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Persona[] lasPersonas= new Persona[2];
		lasPersonas[0]=new Empleado2("Pepe viyuela", 50000, 2009, 02,25);
		lasPersonas[1]=new Alumno("joselitohd", "Magisterio EZ");
		
		for (Persona e: lasPersonas) {
			System.out.println(e.dameNombre() + ", " + e.dameDescripcion());
		}	
	}
	
}

abstract class Persona{
	
	public Persona(String nom) {
		nombre=nom;
	}
	//GETTER
	public String dameNombre() {
		return nombre;
	}
	
	public abstract String dameDescripcion();
	
	private String nombre;
}


class Empleado2 extends Persona{
	public Empleado2(String nom, double sue, int anho, int mes, int dia) {
		super(nom);
		sueldo=sue;
		
		GregorianCalendar calendario=new GregorianCalendar(anho, mes-1,dia);
		
		altaContrato=calendario.getTime();
		
		id=idSiguiente;
		idSiguiente++;
		
		}
	
	
	//GETTER
	public double dameSueldo() {
		return sueldo;
	}
	public Date dameFechaContrato() {
		return altaContrato;
	}
	
	public static String dameIdSiguiente() {
		return "El idSiguiente es: " + idSiguiente;
	}
	
	public String dameDescripcion() {
		return "Este empleado tiene un id= " + id + " con un sueldo igual a = " + sueldo;
	}
	
	//SETTER
	public void subeSueldo(double porcentaje) {
		double aumento=sueldo*porcentaje/100;
		sueldo+=aumento;
	}
	
	
	private double sueldo;
	private Date altaContrato;
	private int id;
	private static int idSiguiente=1;
}

class Alumno extends Persona{
	
	public Alumno(String nom, String car) {
		
		super(nom);
		
		carrera=car;
		
	}
	public String dameDescripcion() {
		return "Este alumno esta estudiando la carrera de " + carrera;
	}
	private String carrera;
}