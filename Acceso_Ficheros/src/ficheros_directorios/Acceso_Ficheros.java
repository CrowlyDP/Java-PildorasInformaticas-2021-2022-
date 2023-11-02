package ficheros_directorios;
import java.io.*;

public class Acceso_Ficheros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File ruta=new File("C:" + File.separator + "Users" + File.separator + "Alejandro"
						   + File.separator + "Desktop" + File.separator + "hola");

		System.out.println(ruta.getAbsolutePath());
		
		String [] nombresArchivos=ruta.list();
		
		for(String e: nombresArchivos) {
			System.out.println(e);
			
			File f=new File(ruta.getAbsolutePath(), e);
			
			if(f.isDirectory()) {
				String [] archivosSubcarpetas=f.list();
				
				for(String z: archivosSubcarpetas) {
					System.out.println(z);
					
				}
			}
			
			
		}
	}

}
