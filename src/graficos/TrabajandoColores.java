package graficos;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.SystemColor;
import java.awt.geom.*;
import javax.swing.*;
public class TrabajandoColores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoConColor mimarco= new MarcoConColor();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mimarco.setVisible(true);
		
		
	}

}

class MarcoConColor extends JFrame{
	
	public MarcoConColor() {
		
		setTitle("Prueba con colorines");
		setSize(400,400);
		
		LaminaConColor milamina=new LaminaConColor();
		add(milamina);
		
		milamina.setBackground(SystemColor.window);
		
		
	}
}

class LaminaConColor extends JPanel{
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		Graphics2D g2=(Graphics2D) g;
		
		Rectangle2D rectangulo=new Rectangle2D.Double(100,100,200,150);
		
		g2.setPaint(Color.WHITE);
		g2.draw(rectangulo);
		
		g2.setPaint(Color.RED);
		
		g2.addRenderingHints(new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON)); //Antialiasing
		g2.fill(rectangulo);
		
		Ellipse2D elipse=new Ellipse2D.Double();
		
		elipse.setFrame(rectangulo);
		
		Color micolor=new Color(125,189,200);
		
		g2.setPaint(micolor);
		
		g2.fill(elipse);
	}
}
