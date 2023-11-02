package graficos;
import java.awt.GraphicsEnvironment;
import javax.swing.*;

public class prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String fuente=JOptionPane.showInputDialog("Introduce fuente");
		boolean estalafuente=false;
		String [] nombresDeFuentes=GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		
		for(String e: nombresDeFuentes) {
			
			if(e.equals(fuente)) {
				estalafuente=true;
			}
			
		}
		if(estalafuente) {
			System.out.println("Instalada la fuente");
		}
		else {
			System.out.println("No esta :(");
		}
	}

}
