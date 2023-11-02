package graficos;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Procesador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MenuProcesador marco=new MenuProcesador();
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MenuProcesador extends JFrame{
	
	public MenuProcesador() {
		setBounds(700,300,500,350);
		add(new LaminaProcesador());
		setVisible(true);
	}
}

class LaminaProcesador extends JPanel{
	
	public LaminaProcesador() {
		
		setLayout(new BorderLayout());
		
		JPanel laminaMenu= new JPanel();
		
		JMenuBar barra=new JMenuBar();
		
		//---------------------------------------
		
		fuente=new JMenu("Fuente");
		estilo=new JMenu("Estilo");
		tamano=new JMenu("Tamaño");
		
		configura_menu("Arial", "fuente","Arial",9,10);
		configura_menu("Courier", "fuente","Courier",9,10);
		configura_menu("Verdana", "fuente","Verdana",9,10);
		
		configura_menu("Negrita", "estilo","",Font.BOLD,1);
		configura_menu("Cursiva", "estilo","",Font.ITALIC,1);
		
		configura_menu("12", "tamano","",9,12);
		configura_menu("16", "tamano","",9,16);
		configura_menu("20", "tamano","",9,20);
		configura_menu("24", "tamano","",9,24);
		
		
		
		//---------------------------------------
		
		/*
		JMenuItem arial=new JMenuItem("Arial");
		 
		JMenuItem courier=new JMenuItem("Courier");
		
		courier.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			area.setFont(new Font("Courier", Font.PLAIN,12));	
				
			}
			
		});
		
		
		JMenuItem verdana=new JMenuItem("Verdana");
		
		
		fuente.add(arial);
		fuente.add(courier);
		fuente.add(verdana);
		
		//---------------------------------------
		
		JMenuItem negrita=new JMenuItem("Negrita");
		JMenuItem cursiva=new JMenuItem("Cursiva");
				
				
		estilo.add(negrita);
		estilo.add(cursiva);
		
		//---------------------------------------
		
		
		JMenuItem tam12=new JMenuItem("12");
		JMenuItem tam16=new JMenuItem("16");
		JMenuItem tam20=new JMenuItem("20");
		JMenuItem tam24=new JMenuItem("24");
	
		
				
				
		tamano.add(tam12);
		tamano.add(tam16);
		tamano.add(tam20);
		tamano.add(tam24);
		*/
		
		//---------------------------------------
		
		barra.add(fuente);
		barra.add(estilo);
		barra.add(tamano);
		
		laminaMenu.add(barra);
		
		add(laminaMenu, BorderLayout.NORTH);
		
		area=new JTextPane();
		add(area, BorderLayout.CENTER);
	
		
	}
	
	public void configura_menu(String rotulo, String menu, String tipoLetra, int estilos, int tam) {
		
		JMenuItem elemMenu=new JMenuItem(rotulo);
		
		if(menu=="fuente") {
			fuente.add(elemMenu);
		}
		else if(menu=="estilo") {
			estilo.add(elemMenu);
		}
		else if(menu=="tamano") {
			tamano.add(elemMenu);
		}
		
		elemMenu.addActionListener(new GestionaEventos(rotulo, tipoLetra,estilos,tam));

		
	}
	
	private class GestionaEventos implements ActionListener{

		String tipoTexto, menu;
		int estiloLetra, tamanoLetra;
		
		GestionaEventos(String elemento, String texto2, int estilo2, int tamano2){
		
			tipoTexto=texto2;
			estiloLetra=estilo2;
			tamanoLetra=tamano2;
			menu=elemento;
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			letras=area.getFont();
			
			if(menu=="Arial" || menu=="Courier" || menu=="Verdana") {
				
				estiloLetra=letras.getStyle();
				tamanoLetra=letras.getSize();
			}
			else if(menu=="Cursiva" || menu=="Negrita") {
				
				if(letras.getStyle()==1 || letras.getStyle()==2) {
					estiloLetra=3;
				}
				
				tipoTexto=letras.getFontName();
				tamanoLetra=letras.getSize();
			}
			else if(menu=="12" || menu=="16" || menu=="20" || menu=="24" ) {
				
				estiloLetra=letras.getStyle();
				tipoTexto=letras.getFontName();
			}
			
			area.setFont(new Font(tipoTexto, estiloLetra, tamanoLetra));
			
			System.out.println("Tipo: " + tipoTexto + " Estilo: " + estiloLetra + " Tamaño: " + tamanoLetra);
			
		}
		
	}
	
	private JTextPane area;
	private JMenu fuente, estilo, tamano;
	private Font letras;
}