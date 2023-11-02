
public class CalculosConMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Clase Math.sqrt que realiza una raíz cuadrada con el valor recibido
		
		double raiz=Math.sqrt(9);
		
		double num1= 5.85;
		int resultado=(int)Math.round(num1);
		
		System.out.println(resultado);

		
		//Clase Math.pow que sirve para realizar potencias
		double base=5;
		
		double exponente=3;
		
		int resultado2=(int)Math.pow(base, exponente);
		
		System.out.println("El resultado de " + base + " elevado a " + exponente + " es: " +resultado2);
	}

}
