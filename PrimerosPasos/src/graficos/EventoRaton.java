package graficos;
import javax.swing.*;
import java.awt.event.*;

public class EventoRaton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoRaton mimarco=new MarcoRaton();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}

}

class MarcoRaton extends JFrame{
	public MarcoRaton() {
		
		setBounds(700,300,400,400);
		setVisible(true);
		
		EventoDeRaton Evento=new EventoDeRaton();
		addMouseListener(Evento);
		
		addMouseMotionListener(new EventoDeRaton());
	}
}

class EventoDeRaton extends MouseAdapter implements MouseMotionListener{

	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("Estas arrastrando");
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("Estas moviendo");
	}

	/*public void mouseClicked(MouseEvent e) {
		
		//System.out.println("Coordenada X: " + e.getX() + " Cordenada Y: " + e.getY());
	
		System.out.println(e.getClickCount());
	}

	  public void mousePressed(MouseEvent e) {
		
		if (e.getModifiersEx()==MouseEvent.BUTTON1_DOWN_MASK){
			System.out.println("Has pulsado el boton izquierdo");
		}
		else if(e.getModifiersEx()==MouseEvent.BUTTON2_DOWN_MASK) {
			System.out.println("Has pulsado la rueda eh pillin");
		}
		else if(e.getModifiersEx()==MouseEvent.BUTTON3_DOWN_MASK) {
			System.out.println("Has pulsado el boton derecho");
		}
	}*/
	
}