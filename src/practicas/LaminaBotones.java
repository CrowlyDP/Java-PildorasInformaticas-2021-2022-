package practicas;
import java.awt.Color;

import javax.swing.*;
public class LaminaBotones extends JPanel{
	
	public LaminaBotones(String titulo, String [] opciones) {
		setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(),titulo));
		
		setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
		
		grupo=new ButtonGroup();
		
		for(int i=0; i<opciones.length;i++) {
			
			JRadioButton boton=new JRadioButton(opciones[i]);
			
			boton.setActionCommand(opciones[i]);
			
			add(boton);
			grupo.add(boton);
			
			boton.setSelected(i==0);
		}
		
		
	}
	public String dameSeleccion() {
		
		/*ButtonModel miboton=grupo.getSelection();
		String str=miboton.getActionCommand();
		
		return str;*/
		
		return grupo.getSelection().getActionCommand();
		
	}
	private ButtonGroup grupo;
}

