package graficos;
import java.awt.Color;
import java.awt.*;
import javax.imageio.*;
import java.io.*;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.SystemColor;
import java.awt.geom.*;
import javax.swing.*;
public class PruebaImagenes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoImagen mimarco= new MarcoImagen();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mimarco.setVisible(true);
		
		
	}

}

class MarcoImagen extends JFrame{
	
	public MarcoImagen() {
		
		setTitle("Marco con Imagen");
		setBounds(800,400, 300, 200);
		
		LaminaImagen milamina=new LaminaImagen();
		add(milamina);
		
		milamina.setBackground(SystemColor.window);
		
		milamina.setForeground(Color.BLUE);
		
	}
}

class LaminaImagen extends JPanel{
	
	public LaminaImagen() {
		
		try {
			imagen=ImageIO.read(new File("src/graficos/Icono2.jpg"));
			}
			catch(IOException e) {
				System.out.println("La imagen no esta, mari carmen");
				}
	}
	
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		//File miimagen=new File("src/graficos/españa.jpg");
		
		
		
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
		
		
	}
	
	private Image imagen;
}
