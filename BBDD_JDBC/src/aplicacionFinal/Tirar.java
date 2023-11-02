package aplicacionFinal;

import javax.swing.*;
import javax.swing.filechooser.*;

public class Tirar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Marco mimarco=new Marco();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JFileChooser chooser= new JFileChooser();
		
		FileNameExtensionFilter filter=new FileNameExtensionFilter("Archivos de texto", "txt");
		
		chooser.setFileFilter(filter);
		
		int valor=chooser.showOpenDialog(mimarco);
		
		if(valor == JFileChooser.APPROVE_OPTION) {
			
			System.out.println("Tu eliges abrir este archivo: " + chooser.getSelectedFile().getAbsolutePath());
		
		}else {
			
		}

	}

}

class Marco extends JFrame{
	
	public Marco() {
		setBounds(400,400,600,300);
		setVisible(true);
	}
}