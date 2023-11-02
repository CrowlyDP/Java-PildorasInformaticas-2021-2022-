package poo;

public class Pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empleados trabajador1=new Empleados("Paquito");
		Empleados trabajador2=new Empleados("Mari carmen");
		Empleados trabajador3=new Empleados("Toño");
		
		trabajador1.cambiaSeccion("RRHH");
		
	
		
		System.out.println(trabajador1.devuelveDatos() + 
				"\n" + trabajador2.devuelveDatos() + 
				"\n" + trabajador3.devuelveDatos());
		
		System.out.println(Empleados.dameIdSiguiente());
		

	}

}

class Empleados{
	
	public Empleados(String nom) {
		
		nombre=nom;
		seccion="Administracion";
		id=idSiguiente;
		idSiguiente++;
		
	}
	//GETTER
	public String devuelveDatos() {
		
		return "El nombre es: " + nombre + " y la seccion es: " + seccion + " y el id es " + id;
	}
	public static String dameIdSiguiente() {
		return "El idSiguiente es: " + idSiguiente;
	}
	
	//SETTER
	public void cambiaSeccion(String seccion) {
		
		this.seccion=seccion;
		
	}
	
	private final String nombre;
	private String seccion;
	private int id;
	private static int idSiguiente=1;

	
}
