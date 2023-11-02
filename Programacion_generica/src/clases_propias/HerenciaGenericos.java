package clases_propias;

public class HerenciaGenericos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Empleado Adminsitrativa=new Empleado("Elena", 45, 1500);
		Jefe DirectoraComercial=new Jefe("Ana",27,3500);
		
		Empleado nuevoEmpleado=DirectoraComercial; */
		
		//Guardar tipo Jefe en tipo Empleado gracias a la herencia.
	
		
		Pareja<Empleado> Adminsitrativa=new Pareja<Empleado>();
	
		Pareja<Jefe> DirectoraComercial=new Pareja<Jefe>();
		
		//Pareja<Empleado> nuevoEmpleado=DirectoraComercial;
		
		Pareja.imprimirTrabajador(Adminsitrativa);
		
		Pareja.imprimirTrabajador(DirectoraComercial);
		
		
	}

}
