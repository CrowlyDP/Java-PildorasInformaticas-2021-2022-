import javax.swing.JOptionPane;

public class Entrada_ejemplo2 {

	public static void main(String[] args) {

		String nombre_usuario=JOptionPane.showInputDialog("Introduce tu nombre por favor");

		String edad=JOptionPane.showInputDialog("Introduce la edad pls");
		
		int edad_usuario=Integer.parseInt(edad);
				
		edad_usuario++;
		
		System.out.println("Hola " + nombre_usuario + ". Tendras el año que viene " + edad_usuario + " años");
		
	}

}
