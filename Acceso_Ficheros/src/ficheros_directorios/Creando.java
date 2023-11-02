package ficheros_directorios;
import java.io.*;

public class Creando {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File ruta=new File("C:" + File.separator + "Users" + File.separator + "Alejandro"
				   			+ File.separator + "Desktop" + File.separator + "hola"
				   		    + File.separator + "prueba2.txt");
		//ruta.mkdir();
				
		try {
			ruta.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Escribiendo accedeEs=new Escribiendo();
		
		accedeEs.escribir(ruta.getAbsolutePath());
		
		
	}

}

class Escribiendo{
	
	public void escribir(String rutaArchivo) {
		
		String frase="Esto es un ejemplo";
		
		try {
			
			FileWriter escritura=new FileWriter(rutaArchivo);
			for(int i=0; i<frase.length();i++) {
				escritura.write(frase.charAt(i));
			}
			
			escritura.close();
			
		}catch(IOException e) {}
	}
	
}
