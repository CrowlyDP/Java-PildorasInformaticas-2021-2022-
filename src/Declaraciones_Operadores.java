
public class Declaraciones_Operadores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=5;
		
		int b;
		
		b=7;
		
		int c=b+a;
		
		System.out.println(c);

		c++;
		
		System.out.println(c);
		
		c+=10;
		
		System.out.println(c);
		
		int entero=c/a;
		double p=c;
		double decimal=p/a;
		
		System.out.println(entero);
		System.out.println(decimal);
		
		//Constantes
		
		final double cons=2.54;
		
		//No se puede dar otro valor a cons. Ejemplo: cons=8;
		
		double cm=6;
		
		double resultado=cm/cons;
		System.out.println("En " + cm + " cm hay " + resultado + " pulgadas");
	}

}
