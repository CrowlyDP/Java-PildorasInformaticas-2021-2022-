package excepciones_I;
import java.util.*;
public class Entrada_datos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("�Qu� deseas hacer?");
		System.out.println("1. Introducir datos");
		System.out.println("2. Salir del programa");
		
		Scanner entrada=new Scanner (System.in);
		
		int decision=entrada.nextInt();
		
		if (decision==1){
			
			try {
			pedirDatos();
			}catch(InputMismatchException e) {
				
				System.out.println("La edad no es un numero :S");

			}
			
		}else{
			
			System.out.println("Adios");
			
			System.exit(0);
		}
		
		entrada.close();
		
	}
	
		static void pedirDatos() throws InputMismatchException {			
		
			//try {	
				
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Introduce tu nombre, por favor");
		
		String nombre_usuario=entrada.nextLine();
		
		System.out.println("Introduce edad, por favor");
		
		int edad=entrada.nextInt();	//si introducimos texto sucede una excepcion no comprobada
			
		System.out.println("Hola " + nombre_usuario + ". El a�o que viene tendr�s " + (edad+1) + " a�os");
		
		entrada.close();
		
			//}catch(Exception e) {
				
				//System.out.println("La edad no es un numero :S");
			//}
		
		System.out.println("Hemos terminado");
		
	}
		
		
}