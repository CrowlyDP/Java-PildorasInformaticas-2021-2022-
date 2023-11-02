package ficheros_directorios;

import java.io.File;

public class Eliminar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File ruta=new File("C:" + File.separator + "Users" + File.separator + "Alejandro"
	   			+ File.separator + "Desktop" + File.separator + "hola"
	   		    + File.separator + "prueba2.txt");
		
		ruta.delete();
	}

}
