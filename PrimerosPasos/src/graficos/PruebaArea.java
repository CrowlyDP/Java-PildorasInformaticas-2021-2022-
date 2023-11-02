package graficos;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
public class PruebaArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoPruebaArea mimarco=new MarcoPruebaArea();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
class MarcoPruebaArea extends JFrame{
	
	public MarcoPruebaArea() {
		
		setBounds(700,300,400,400);
		setVisible(true);
		
		setLayout(new BorderLayout());
		
		laminaBotones=new JPanel();
		
		botonInsertar=new JButton("Insertar");
		botonInsertar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				areaTexto.append("En un lugar de la Mancha... ");
			}
			
		});
		
		laminaBotones.add(botonInsertar);
		
		
		botonSaltoLinea=new JButton("Salto linea");
		botonSaltoLinea.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				boolean saltar=!areaTexto.getLineWrap();
				
				areaTexto.setLineWrap(saltar);
				
				/*if(saltar) {
					botonSaltoLinea.setText("Quitar salto");
				}else {
					botonSaltoLinea.setText("Salto Linea");
				}*/
				botonSaltoLinea.setText(saltar ? "Quitar Salto" : "Salto linea");
				
			}
			
		});
		
		laminaBotones.add(botonSaltoLinea);
		
		add(laminaBotones,BorderLayout.SOUTH);
		
		areaTexto=new JTextArea(8,20);
		
		laminaConBarras=new JScrollPane(areaTexto);
		
		add(laminaConBarras,BorderLayout.CENTER);
		
		
	}
	
	private JPanel laminaBotones;
	private JButton botonInsertar, botonSaltoLinea;
	private JTextArea areaTexto;
	private JScrollPane laminaConBarras;
}
