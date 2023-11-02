package graficos;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Ejemplo_Radio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoRadio mimarco=new MarcoRadio();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoRadio extends JFrame{
	
	public MarcoRadio() {
		setBounds(700,300,500,350);
		setVisible(true);
		add(new LaminaRadio());
	}
}
class LaminaRadio extends JPanel{
	
	public LaminaRadio() {
		
		setLayout(new BorderLayout());
		
		texto=new JLabel("En un lugar de la Mancha...");
		texto.setFont(new Font("Serif", Font.PLAIN,12));
		
		add(texto,BorderLayout.CENTER);
		
		laminaBotones=new JPanel();
		migrupo=new ButtonGroup();
		
		colocarBotones("Pequeño",false,10);
		colocarBotones("Mediano",true,12);
		colocarBotones("Grande",false,18);
		colocarBotones("Muy Grande",false,24);
		
		add(laminaBotones, BorderLayout.SOUTH);
		
		/*ButtonGroup migrupo=new  ButtonGroup();
		
		boton1=new JRadioButton("Pequeño", false);
		boton2=new JRadioButton("Mediano", true);
		boton3=new JRadioButton("Grande", false);
		boton4=new JRadioButton("Muy Grande", false);
		
		EventoRadio evento=new EventoRadio();
		boton1.addActionListener(evento);
		boton2.addActionListener(evento);
		boton3.addActionListener(evento);
		boton4.addActionListener(evento);
		
		
		JPanel laminaRadio=new JPanel();
		
		migrupo.add(boton1);
		migrupo.add(boton2);
		migrupo.add(boton3);
		migrupo.add(boton4);
		
		laminaRadio.add(boton1);
		laminaRadio.add(boton2);
		laminaRadio.add(boton3);
		laminaRadio.add(boton4);
		
		add(laminaRadio,BorderLayout.SOUTH);
		
	}
	private class EventoRadio implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(e.getSource()==boton1) {
				
				texto.setFont(new Font("Serif", Font.PLAIN, 10));
			
			}else if(e.getSource()==boton2) {
				
				texto.setFont(new Font("Serif", Font.PLAIN, 12));

			
			}else if(e.getSource()==boton3) {
				
				texto.setFont(new Font("Serif", Font.PLAIN, 18));

				
			}else{
				
				texto.setFont(new Font("Serif", Font.PLAIN, 24));

			
			}
		}*/
		
	}
	
	public void colocarBotones(String nombre, boolean seleccionado, int tamano) {
		
		JRadioButton boton=new JRadioButton(nombre,seleccionado);
		
		migrupo.add(boton);
	
		laminaBotones.add(boton);
		
		ActionListener evento=new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				texto.setFont(new Font("Serif", Font.PLAIN, tamano));
			}
			
		};
		boton.addActionListener(evento);
	}
	
	private JLabel texto;
	private JRadioButton boton1,boton2,boton3,boton4;
	private ButtonGroup migrupo;
	private JPanel laminaBotones;
	
}