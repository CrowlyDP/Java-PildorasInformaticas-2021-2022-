import java.util.*;

public class PruebaMapas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		HashMap <String, Empleado> mapaEmpleados=new HashMap<String, Empleado>();
	
		mapaEmpleados.put("145", new Empleado("Pepe"));
		mapaEmpleados.put("146", new Empleado("Mari Carmen"));
		mapaEmpleados.put("147", new Empleado("Lucas"));
		mapaEmpleados.put("148", new Empleado("Antonia"));
		
		System.out.println(mapaEmpleados);
		
		mapaEmpleados.remove("148");
		
		System.out.println(mapaEmpleados);
		
		mapaEmpleados.put("147", new Empleado("Natalia")); //Sustituye al que tiene la clave 147
		
		System.out.println(mapaEmpleados);
		
		//System.out.println(mapaEmpleados.entrySet());
		
		for(Map.Entry<String, Empleado> entrada: mapaEmpleados.entrySet()) {
			
			String clave=entrada.getKey();
			Empleado valor=entrada.getValue();
			
			System.out.println("Clave: " + clave + ", Valor: " + valor);
			
		}
		
	
	
	
	}

}

class Empleado{
	
	public Empleado(String n) {
		
		nombre=n;
		sueldo=2000;
		
	}
	
	public String toString() {
		return"[Nombre=" + nombre + ", sueldo=" + sueldo + "]";
 	}
	
	private String nombre;
	private double sueldo;
	
}
