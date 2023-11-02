package graficos;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.SystemColor;
import java.awt.geom.*;
import javax.swing.*;
public class TrabajandoConFuentes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoConFuentes mimarco= new MarcoConFuentes();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mimarco.setVisible(true);
		
		
	}

}

class MarcoConFuentes extends JFrame{
	
	public MarcoConFuentes() {
		
		setTitle("Prueba con colorines");
		setSize(400,400);
		
		LaminaConFuentes milamina=new LaminaConFuentes();
		add(milamina);
		
		milamina.setBackground(SystemColor.window);
		
		milamina.setForeground(Color.BLUE);
		
	}
}

class LaminaConFuentes extends JPanel{
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		Graphics2D g2=(Graphics2D) g;

		Font mifuente=new Font("Times New Roman", Font.BOLD, 26);
		
		g2.setFont(mifuente);
		
		g2.drawString("Alejandro", 100, 100);
		
		g2.setFont(new Font("Verdana", Font.ITALIC, 14));

		g2.drawString("Curso de Java", 100, 200);
	}
}
