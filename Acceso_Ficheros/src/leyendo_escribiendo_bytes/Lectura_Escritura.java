package leyendo_escribiendo_bytes;
import java.io.*;

public class Lectura_Escritura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int contador=0;
		
		int datosEntrada[]=new int[517015];
		
		try {
			
			FileInputStream archivoLectura=new FileInputStream("C:/Users/Alejandro/Desktop/wallpaper/1031836.jpg");
		
			boolean finalAr=false;
			
			while(!finalAr) {
				
				int byteEntrada=archivoLectura.read();
				
				if(byteEntrada!=-1) 
					
					datosEntrada[contador]=byteEntrada;
				
				
				else
					
					finalAr=true;
					
				System.out.println(datosEntrada[contador]);	
				
				contador++;
			}
			
			archivoLectura.close();
			
		}catch(IOException e){}
			
			System.out.println(contador);
			
			creaFichero(datosEntrada);

	}
	
	static void creaFichero(int datosNuevoFichero[]) {
		
		try {
			
			FileOutputStream ficheroNuevo=new FileOutputStream("C:/Users/Alejandro/Desktop/wallpaper/1031836_copia.jpg");
		
			for(int i=0;i<datosNuevoFichero.length;i++) {
				
				ficheroNuevo.write(datosNuevoFichero[i]);
				
			}
			
			ficheroNuevo.close();
			
		}catch(IOException e) {}
	}
	

}
