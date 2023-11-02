package graficos;
import java.awt.event.*;
import javax.swing.*;

public class EventoOyentes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoPrincipal mimarco=new MarcoPrincipal();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mimarco.setVisible(true);
		
		
	}

}

class MarcoPrincipal extends JFrame{
	
	public MarcoPrincipal() {
		
		setTitle("Varios oyentes");
		setBounds(700,300,400,400);
		
		add(new LaminaPrincipal());
	}
}

class LaminaPrincipal extends JPanel{
	
	public LaminaPrincipal() {
		
		JButton botonNuevo= new JButton("Nuevo");
		add(botonNuevo);
		
		botonCerrar=new JButton("Cerrar todo");
		add(botonCerrar);
		
		OyenteNuevo miOyente= new OyenteNuevo();
		
		botonNuevo.addActionListener(miOyente);
		
	}
	
	private class OyenteNuevo implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			MarcoEmergente marco=new MarcoEmergente(botonCerrar);
			marco.setVisible(true);
			
		}
		
	}
	
	JButton botonCerrar;
}

class MarcoEmergente extends JFrame{
	
	public MarcoEmergente(JButton botonPrincipal){
		
		contador++;
		
		setTitle("Ventana " + contador);
		
		setBounds(40*contador,40*contador,300,150);
		
		cierraTodos oyenteCerrar=new cierraTodos();
		
		botonPrincipal.addActionListener(oyenteCerrar);
	}
	
	private class cierraTodos implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			dispose();
			contador=0;
		}
		
	}
	private static int contador=0;
}