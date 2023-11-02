package escribiendo;
import java.io.*;

public class Escribir_Fichero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Escribiendo accede=new Escribiendo();
		accede.escribir();
		
	}

}
class Escribiendo{
	
	public void escribir() {
		
		String frase="Esto es una frase de ejemplo2";
		
		try {
			FileWriter escritura=new FileWriter("C:/Users/Alejandro/Desktop/nuevo.txt");
			//FileWriter escritura=new FileWriter("C:/Users/Alejandro/Desktop/nuevo.txt", true); 
			//El true señala que el archivo ya existe, es decir, que no lo cree.
			
			for(int i=0; i<frase.length();i++) {
				
				escritura.write(frase.charAt(i));
				
			}
			escritura.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
