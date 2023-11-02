package arraylist;
import java.util.*; //ArrayList

public class Uso_Empleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Empleado [] listaEmpleados=new Empleado[3];
		
		listaEmpleados[0]=new Empleado("Ana", 45, 2500);
		listaEmpleados[1]=new Empleado("Antonio", 55, 200);
		listaEmpleados[2]=new Empleado("María", 25, 2600);*/
		
		ArrayList <Empleado> listaEmpleados=new ArrayList <Empleado>();
		
		listaEmpleados.ensureCapacity(12); //Indicar un tamaño fijo para optimizar.
		
		listaEmpleados.add(new Empleado ("Ana", 45, 2500));
		listaEmpleados.add(new Empleado ("Antonio", 55, 200));
		listaEmpleados.add(new Empleado ("María", 25, 2600));
		
		listaEmpleados.add(new Empleado ("Ana", 45, 2500));
		listaEmpleados.add(new Empleado ("Antonio", 55, 200));
		listaEmpleados.add(new Empleado ("María", 25, 2600));
		
		listaEmpleados.add(new Empleado ("Ana", 45, 2500));
		listaEmpleados.add(new Empleado ("Antonio", 55, 200));
		listaEmpleados.add(new Empleado ("María", 25, 2600));
		
		listaEmpleados.add(new Empleado ("Ana", 45, 2500));
		listaEmpleados.add(new Empleado ("Antonio", 55, 200));
		listaEmpleados.add(new Empleado ("Pedro", 25, 2600));

		listaEmpleados.add(new Empleado ("Pedro", 25, 2600));
		listaEmpleados.add(new Empleado ("Pedro", 25, 2600));
		
		//listaEmpleados.trimToSize();  //Recortar el tamaño para optimizar.
		
		//listaEmpleados.add(new Empleado ("Mari Carmen", 25, 2600));

		listaEmpleados.set(1, new Empleado ("Mari Carmen", 25, 2600));
		
		
		
		//------------------------------------------------------------
		
		//System.out.println(listaEmpleados.size()); //Tamaño del ArrayList
		
		//System.out.println(listaEmpleados.get(4).dameDatos()); //Un objeto en especifico

		//----------------------------------------Recorrer el ArrayList

		/*for(Empleado e: listaEmpleados) {
			
			System.out.println(e.dameDatos());
		}*/
		
		/*for(int i=0; i<listaEmpleados.size();i++) {
			
			Empleado e=listaEmpleados.get(i);
			
			System.out.println(e.dameDatos());
		}*/
		
		//-------------------------------------Paso de ArraList a Array
		
		/*Empleado [] arrayEmpleados=new Empleado[listaEmpleados.size()];
		
		listaEmpleados.toArray(arrayEmpleados);
		
		for(Empleado e: arrayEmpleados) {
			
			System.out.println(e.dameDatos());
		}*/
		
		//---------------------------------------------------Iterador
		
		Iterator <Empleado> miIterador=listaEmpleados.iterator();
		
		while(miIterador.hasNext()) {
			
			System.out.println(miIterador.next().dameDatos());
		}
		
		
	}

}

class Empleado{
	
	public Empleado(String nombre, int edad, double salario) {
		
		this.nombre=nombre;
		this.edad=edad;
		this.salario=salario;
		
	}
	
	public String dameDatos() {
		return "Nombre: " + nombre + ". Tiene " + edad + " años. Y cobra " + salario;
	}
	
	private String nombre;
	private int edad;
	private double salario;
}
