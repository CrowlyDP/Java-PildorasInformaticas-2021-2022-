package graficos;

import java.awt.Color;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ActionMap;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.KeyStroke;

public class PruebaAcciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoAccion mimarco= new MarcoAccion();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mimarco.setVisible(true);

		
	}

}

class MarcoAccion extends JFrame{

	public MarcoAccion() {
		setBounds(700,300,400,400);
		setTitle("Pruba acciones");
		add(new PanelAccion());
	}
	
}

class PanelAccion extends JPanel{
	
	public PanelAccion() {
		
		/*JButton botonAmarillo=new JButton("Amarillo");
		JButton botonAzul=new JButton("Azul");
		JButton botonRojo=new JButton("Rojo");
		
		add(botonAmarillo);
		add(botonAzul);
		add(botonRojo);*/
		
		AccionColor accionAmarillo=new AccionColor("Amarillo", new ImageIcon("src/graficos/iconoAmarillo.gif"), Color.YELLOW);
		AccionColor accionAzul=new AccionColor("Azul", new ImageIcon("src/graficos/Icono2.jpg"), Color.BLUE);
		AccionColor accionRojo=new AccionColor("Rojo", new ImageIcon("src/graficos/iconoRojo.gif"), Color.RED);
		
		//JButton botonAmarillo=new JButton(accionAmarillo);
		
		add(new JButton(accionAmarillo));
		add(new JButton(accionAzul));
		add(new JButton(accionRojo));
		
	
		//InputMap mapaEntrada=getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		
		//KeyStroke teclaAmarillo=KeyStroke.getKeyStroke("ctrl A");
		
		getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke("ctrl A"), "fondoAmarillo");
		getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke("ctrl B"), "fondoAzul");
		getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke("ctrl R"), "fondoRojo");
		
		//ActionMap mapaAccion=getActionMap();
		
		getActionMap().put("fondoAmarillo", accionAmarillo);
		getActionMap().put("fondoAzul", accionAzul);
		getActionMap().put("fondoRojo", accionRojo);
		
	}
	
	
	private class AccionColor extends AbstractAction{

		public AccionColor(String nombre, Icon icono, Color colorBoton) {
			putValue(Action.NAME, nombre);
			putValue(Action.SMALL_ICON, icono);
			putValue(Action.SHORT_DESCRIPTION, "Poner la lámina de color " + nombre);
			putValue("colorFondo", colorBoton);
		
		}
		
		public void actionPerformed(ActionEvent e) {
			
			Color c=(Color) getValue("colorFondo");
			setBackground(c);
			
			System.out.println("Nombre: " + getValue(Action.NAME) + " Descripción: " + getValue(Action.SHORT_DESCRIPTION));
		}
		
		
	}
}

