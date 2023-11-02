package clases_propias;

class Jefe extends Empleado{

	public Jefe(String nombre, int edad, double salario) {
		
		super(nombre, edad, salario);
		
	}
	
	double inecntivo(double inc) {
		
		return inc;
	}
	

}
