package leyendo;
import java.io.*;
public class Acceso_Fichero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LeerFichero fichero=new LeerFichero();
		
		fichero.lee();

	}

}

class LeerFichero{
	
	public void lee() {
		
		try {
			FileReader entrada=new FileReader("C:/Users/Alejandro/Desktop/nuevo.txt");
			
			BufferedReader buffer=new BufferedReader(entrada); //Para leer linea por linea y no caracter a caracter.
			
			
			String linea="";
			
			while(linea!=null) {
				
				linea=buffer.readLine();
				
				if(linea!=null) //Para que no salga null en la ultima linea.
				System.out.println(linea);
				
			}
			//int x=0;
			
			
			/*while(x!=-1) {
				
				x=entrada.read();
				
				char letra=(char)x;
				
				System.out.print(letra);
			}*/
			
			entrada.close();
			
		} catch (IOException e) {
			System.out.println("No se encontró el archivo");
			
		}
	}
	
}
