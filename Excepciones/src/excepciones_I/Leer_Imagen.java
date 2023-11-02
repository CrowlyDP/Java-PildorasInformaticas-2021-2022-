package excepciones_I;

import java.awt.*;
import java.io.*;

import javax.imageio.*;
import javax.swing.*;

public class Leer_Imagen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoImagen marco=new MarcoImagen();
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco.setVisible(true);

	}

}

class MarcoImagen extends JFrame{
	
	public MarcoImagen() {
		
		setTitle("Marco con Imagen");
		setBounds(700,300,500,400);
		add(new LaminaConImagen());
	}
}

class LaminaConImagen extends JPanel{
	
	public LaminaConImagen() {
		
	//Error comprobado por lo tanto, usamos try/cacth
		
		try {
			
		imagen=ImageIO.read(new File(""));
		
		}catch(IOException e) {
			
			System.out.println("La imagen no se encuentra");
		}
		
	}
	
	public void paintComponent(Graphics g) throws NullPointerException {
		
		super.paintComponent(g);
		
		//Error no comprobado.
		
		
		try {
		int anchuraImagen=imagen.getWidth(this);
		int alturaImagen=imagen.getHeight(this);
		
		g.drawImage(imagen, 0, 0, null);
		
		for(int i=0; i<300;i++) {
			
			for(int j=0; j<200;j++) {
				
				if(i+j>0) {
					g.copyArea(0, 0, anchuraImagen, alturaImagen,anchuraImagen* i, alturaImagen*j);

						  }			
			}
		
		}
		}catch(NullPointerException e) {
			g.drawString("No se cargo la imagen", 10,10);
		}
	}
	private Image imagen;
	
}
