import javax.swing.*;
public class Acceso_Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String clave="Alejandro";
		
		String pass="";
		
		while (clave.equals(pass)==false) {
			
			pass=JOptionPane.showInputDialog("Introduce la contraseņa");
			
			if (clave.contentEquals(pass)==false) {
				System.out.println("Contraseņa incorrecta");
			}
			
		}
		
		System.out.println("Contraseņa correcta");

	}

}
