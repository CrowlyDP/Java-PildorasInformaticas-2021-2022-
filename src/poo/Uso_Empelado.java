package poo;

import java.util.*;

public class Uso_Empelado {

	public static void main(String[] args) {

		/*
		Empleado empleado1=new Empleado("pepe",50000,1984,12,18);
		Empleado empleado2=new Empleado("manuel",5,2008,1,1);
		Empleado empleado3=new Empleado("joselito",0.5,2021,12,28);
		
		empleado1.subeSueldo(5);
		empleado2.subeSueldo(5);
		empleado3.subeSueldo(5);
		
		System.out.println("Nombre : " + empleado1.dameNombre() + " Sueldo : " + empleado1.dameSueldo() + " Fecha: " + empleado1.dameFechaContrato());
		System.out.println("Nombre : " + empleado2.dameNombre() + " Sueldo : " + empleado2.dameSueldo() + " Fecha: " + empleado2.dameFechaContrato());
		System.out.println("Nombre : " + empleado3.dameNombre() + " Sueldo : " + empleado3.dameSueldo() + " Fecha: " + empleado3.dameFechaContrato());
		*/
		Jefatura jefeRHH=new Jefatura("Alejandro",55000,2006,9,25);
		
		jefeRHH.estableceIncentivo(2570);
		
		Empleado[] misEmpleados=new Empleado[6];
		misEmpleados[0]=new Empleado("pepe",50000,1984,12,18);
		misEmpleados[1]=new Empleado("manuel",5,2008,1,1);
		misEmpleados[2]=new Empleado("joselito",0.5,2021,12,28);
		misEmpleados[3]=new Empleado("Hermenegildo");
		misEmpleados[4]=jefeRHH; //Polimorfismo. Principio de sustitucion.
		misEmpleados[5]=new Jefatura("Maria",95000,1999,5,26);
		Jefatura jefaFinanzas=(Jefatura) misEmpleados[5];
		jefaFinanzas.estableceIncentivo(55000);
		
		Empleado directorComercial=new Jefatura("Jefaso",85000,2000,1,10);
		
		Comparable ejemplo= new Empleado("Elisabeh",9500,1980,10,1);	
		System.out.println(jefaFinanzas.tomarDecisiones("Dar mas dias a los empleados"));
		
		System.out.println("El jefe " + jefaFinanzas.dameNombre() + " tiene un bonus de " + jefaFinanzas.estableceBonus(500));
		System.out.println(misEmpleados[3].dameNombre() + " tiene un bonus de " + misEmpleados[3].estableceBonus(200));
		/*
		for(int i=0; i<3;i++) {
			misEmpleados[i].subeSueldo(5);
		}
		*/
		for( Empleado e:misEmpleados) {
			e.subeSueldo(5);
		}
		
		
		/*
		for(int i=0; i<3;i++) {
			System.out.println("Nombre: " + misEmpleados[i].dameNombre() + " Sueldo " + misEmpleados[i].dameSueldo() + " Fecha " + misEmpleados[i].dameFechaContrato());
		}
		*/
		Arrays.sort(misEmpleados);
		
		for(Empleado e:misEmpleados) {
			System.out.println("Nombre: " + e.dameNombre() + " Sueldo " + e.dameSueldo() + " Fecha " + e.dameFechaContrato());

		}
	}

}

class Empleado implements Comparable, Trabajadores{
	public Empleado(String nom, double sue, int anho, int mes, int dia) {
		
		nombre=nom;
		sueldo=sue;
		
		GregorianCalendar calendario=new GregorianCalendar(anho, mes-1,dia);
		
		altaContrato=calendario.getTime();
		
		id=idSiguiente;
		idSiguiente++;
		
		}
	
		public Empleado(String nom) {
			
			//Llama al constructor que coincida con los parametros
			this(nom, 30000, 2000, 01,01);
		}
	
	
	//GETTER
	public String dameNombre() {
		return nombre + " " + id;
	}
	public double dameSueldo() {
		return sueldo;
	}
	public Date dameFechaContrato() {
		return altaContrato;
	}
	
	public static String dameIdSiguiente() {
		return "El idSiguiente es: " + idSiguiente;
	}
	//SETTER
	public void subeSueldo(double porcentaje) {
		double aumento=sueldo*porcentaje/100;
		sueldo+=aumento;
	}
	
	public int compareTo(Object miObjeto) {
		Empleado otroEmpleado=(Empleado) miObjeto;
		if(this.sueldo<otroEmpleado.sueldo) {
			return -1;
		}
		
		if(this.sueldo>otroEmpleado.sueldo) {
			return 1;
		}
		
		return 0;
	};
	public double estableceBonus(double gratificacion) {
		return gratificacion+Trabajadores.bonusBase;
	}
	private String nombre;
	private double sueldo;
	private Date altaContrato;
	private int id;
	private static int idSiguiente=1;
}



class Jefatura extends Empleado implements Jefes{
	
	public Jefatura(String nom, double sue, int anho, int mes, int dia) {
		
		super(nom,sue,anho,mes,dia);
	}
	//GETTER
	public double dameSueldo() {
		
		double sueldoJefe=super.dameSueldo();
		return sueldoJefe + incentivo;
	}
	//SETTER
	public void estableceIncentivo(double b) {
		incentivo=b;
	}
	
	public String tomarDecisiones(String decision) {
		return "Un miembro de la direccion ha tomado la decision de: " + decision; 
	}
	public double estableceBonus(double gratificacion) {
		double prima=2000;
		return Trabajadores.bonusBase+gratificacion+prima;
	}
	
	private double incentivo;
}
