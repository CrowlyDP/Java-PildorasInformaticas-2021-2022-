package excepciones_I;
import java.io.EOFException;

import javax.swing.JOptionPane;

public class Comprueba_Mail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		String mail=JOptionPane.showInputDialog("Introduce mail");
		
		try {
			examina_mail(mail);
			} catch (Exception e) {
				
			System.out.println("La direccion de mail no es correcta");
			
			e.printStackTrace();
		}

		
		/*try {
		
		examina_mail(mail);
		
		}catch(EOFException e) {
			
			System.out.println("Error");
		}*/
		
	
	}
	
	static void examina_mail(String mail) throws LongitudMailErronea{
		
		int arroba=0;
		boolean punto=false;
	
		if(mail.length()<=3) {
			
			//ArrayIndexOutOfBoundsException excepcion= new ArrayIndexOutOfBoundsException();
			//throw new EOFException();
			
			throw new LongitudMailErronea("El mail no puede ser menor de 4 caracteres");
			
		}else {
			
		for(int i=0; i<mail.length();i++) {
			
			if(mail.charAt(i)=='@') {
				arroba++;
			}
			
			if (mail.charAt(i)=='.') {
				punto=true;
			}
		}
		
		if(arroba==1 && punto==true) {
			System.out.println("Es correcto");
		}
		else {
			System.out.println("No es correcto");
		}
	}
		
	}

}

class LongitudMailErronea extends Exception{
	
	public LongitudMailErronea() {}
	
	public LongitudMailErronea(String Merror) {
		super(Merror);
	}
}

