import javax.swing.*;
public class Entrada_Numeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Formato para redondear un double
		double x=10000.0;
		
		System.out.printf("%1.2f",x/3);
		
		System.out.println("");
		
		/* parseDouble pertenciente a la clase Double  para 
		 * transformar a double, ya que la clase Math.sqrt devuelve
		 *  un numero double
		 */
		
		String num1=JOptionPane.showInputDialog("Introduce tu numero");
		
		double num2=Double.parseDouble(num1);
		
		System.out.print("La raiz de " + num2 + " es ");
		System.out.printf("%1.2f", Math.sqrt(num2));
	}

}
