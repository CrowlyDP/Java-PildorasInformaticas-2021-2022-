package graficos;

import javax.swing.*;
import javax.swing.text.*;
import java.awt.event.*;
import java.awt.*;

public class Procesador2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MenuProcesador2 marco=new MenuProcesador2();
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MenuProcesador2 extends JFrame{
	
	public MenuProcesador2() {
		setBounds(700,300,600,600);
		add(new LaminaProcesador2());
		setVisible(true);
	}
}

class LaminaProcesador2 extends JPanel{
	
	public LaminaProcesador2() {
		
		setLayout(new BorderLayout());
		
		JPanel laminaMenu= new JPanel();
		
		JMenuBar barra=new JMenuBar();
		
		//---------------------------------------
		
		fuente=new JMenu("Fuente");
		estilo=new JMenu("Estilo");
		tamano=new JMenu("Tamaño");
		
		configura_menu("Arial", "fuente","Arial",9,10,"");
		configura_menu("Courier", "fuente","Courier",9,10,"");
		configura_menu("Verdana", "fuente","Verdana",9,10,"");
		
		configura_menu("Negrita", "estilo","",Font.BOLD,1,"src/graficos/iconoRojo.gif");
		configura_menu("Cursiva", "estilo","",Font.ITALIC,1,"src/graficos/iconoAmarillo.gif");
		
		/*
		JCheckBoxMenuItem negrita=new JCheckBoxMenuItem("Negrita", new ImageIcon("src/graficos/iconoRojo.gif"));
		JCheckBoxMenuItem cursiva=new JCheckBoxMenuItem("Cursiva", new ImageIcon("src/graficos/iconoAmarillo.gif"));
		
		negrita.addActionListener(new StyledEditorKit.BoldAction());
		cursiva.addActionListener(new StyledEditorKit.ItalicAction());
		
		estilo.add(negrita);
		estilo.add(cursiva);
		*/
		
		//configura_menu("12", "tamano","",9,12,"");
		//configura_menu("16", "tamano","",9,16,"");
		//configura_menu("20", "tamano","",9,20,"");
		//configura_menu("24", "tamano","",9,24,"");
		
		ButtonGroup grupo=new ButtonGroup();
		
		JRadioButtonMenuItem tam12=new JRadioButtonMenuItem("12");
		JRadioButtonMenuItem tam16=new JRadioButtonMenuItem("16");
		JRadioButtonMenuItem tam20=new JRadioButtonMenuItem("20");
		JRadioButtonMenuItem tam24=new JRadioButtonMenuItem("24");
		
		tam24.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D,InputEvent.CTRL_DOWN_MASK));
		grupo.add(tam12);
		grupo.add(tam16);
		grupo.add(tam20);
		grupo.add(tam24);
		
		tam12.addActionListener(new StyledEditorKit.FontSizeAction("", 12));
		tam16.addActionListener(new StyledEditorKit.FontSizeAction("", 16));
		tam20.addActionListener(new StyledEditorKit.FontSizeAction("", 20));
		tam24.addActionListener(new StyledEditorKit.FontSizeAction("", 24));
		
		tamano.add(tam12);
		tamano.add(tam16);
		tamano.add(tam20);
		tamano.add(tam24);
			
		//---------------------------------------
		
		barra.add(fuente);
		barra.add(estilo);
		barra.add(tamano);
		
		laminaMenu.add(barra);
		
		add(laminaMenu, BorderLayout.NORTH);
		
		//-----------------------------------------
		
		area=new JTextPane();
		add(area, BorderLayout.CENTER);
		
		//-----------------------------------------
		
		JPopupMenu emergente=new JPopupMenu();
		
		JMenuItem negritae=new JMenuItem("Negrita");
		JMenuItem cursivae=new JMenuItem("Cusriva");
		
		negritae.addActionListener(new StyledEditorKit.BoldAction());
		cursivae.addActionListener(new StyledEditorKit.ItalicAction());
		
		emergente.add(negritae);
		emergente.add(cursivae);
		
	

		area.setComponentPopupMenu(emergente);
		
		//------------------------------------------
		
	
		/*
		JToolBar barra2= new JToolBar();
		
		JButton negritaBarra=new JButton(new ImageIcon("src/graficos/n.gif"));
		JButton cursivaBarra=new JButton(new ImageIcon("src/graficos/k.gif"));
		JButton subBarra=new JButton(new ImageIcon("src/graficos/u.gif"));
		
		JButton azulBarra=new JButton(new ImageIcon("src/graficos/Icono2.jpg"));
		JButton rojoBarra=new JButton(new ImageIcon("src/graficos/iconoRojo.gif"));
		JButton amarilloBarra=new JButton(new ImageIcon("src/graficos/iconoAmarillo.gif"));

		JButton izquierda=new JButton(new ImageIcon("src/graficos/izquierda.gif"));
		JButton centrado=new JButton(new ImageIcon("src/graficos/centrado.gif"));
		JButton derecha=new JButton(new ImageIcon("src/graficos/derecha.gif"));
		JButton justificado=new JButton(new ImageIcon("src/graficos/justificado.gif"));
		
		
		
		negritaBarra.addActionListener(new StyledEditorKit.BoldAction());
		cursivaBarra.addActionListener(new StyledEditorKit.ItalicAction());
		subBarra.addActionListener(new StyledEditorKit.UnderlineAction());
		
		azulBarra.addActionListener(new StyledEditorKit.ForegroundAction("Pon azul", Color.BLUE));
		amarilloBarra.addActionListener(new StyledEditorKit.ForegroundAction("Pon amarillo", Color.YELLOW));
		rojoBarra.addActionListener(new StyledEditorKit.ForegroundAction("Pon rojo", Color.RED));
		
		izquierda.addActionListener(new StyledEditorKit.AlignmentAction("Izquierda", 0));
		centrado.addActionListener(new StyledEditorKit.AlignmentAction("Centrado", 1));
		derecha.addActionListener(new StyledEditorKit.AlignmentAction("Derecha", 2));
		justificado.addActionListener(new StyledEditorKit.AlignmentAction("Justificado", 3));
		
		
		barra2.add(negritaBarra);
		barra2.add(cursivaBarra);
		barra2.add(subBarra);
		
		barra2.add(azulBarra);
		barra2.add(amarilloBarra);
		barra2.add(rojoBarra);

		barra2.add(izquierda);
		barra2.add(centrado);
		barra2.add(derecha);
		barra2.add(justificado);
		*/
		
		barra2=new JToolBar();
		
		configura_barra("src/graficos/n.gif").addActionListener(new StyledEditorKit.BoldAction());
		configura_barra("src/graficos/k.gif").addActionListener(new StyledEditorKit.ItalicAction());
		configura_barra("src/graficos/u.gif").addActionListener(new StyledEditorKit.UnderlineAction());
		
		barra2.addSeparator();
		
		configura_barra("src/graficos/Icono2.jpg").addActionListener(new StyledEditorKit.ForegroundAction("Pon azul", Color.BLUE));
		configura_barra("src/graficos/iconoAmarillo.gif").addActionListener(new StyledEditorKit.ForegroundAction("Pon amarillo", Color.YELLOW));
		configura_barra("src/graficos/iconoRojo.gif").addActionListener(new StyledEditorKit.ForegroundAction("Pon rojo", Color.RED));

		barra2.addSeparator();
		
		configura_barra("src/graficos/izquierda.gif").addActionListener(new StyledEditorKit.AlignmentAction("Izquierda", 0));
		configura_barra("src/graficos/centrado.gif").addActionListener(new StyledEditorKit.AlignmentAction("Centrado", 1));
		configura_barra("src/graficos/derecha.gif").addActionListener(new StyledEditorKit.AlignmentAction("Derecha", 2));
		configura_barra("src/graficos/justificado.gif").addActionListener(new StyledEditorKit.AlignmentAction("Justificado", 3));

		
		barra2.setOrientation(1);
		add(barra2,BorderLayout.WEST);
		
		
	}
	public JButton configura_barra(String ruta) {
		JButton boton=new JButton(new ImageIcon(ruta));
		barra2.add(boton);
		
		return boton;
	}
	
	
	
	public void configura_menu(String rotulo, String menu, String tipoLetra, int estilos, int tam, String rutaIcono) {
		
		JMenuItem elemMenu=new JMenuItem(rotulo,new ImageIcon(rutaIcono));
		
		if(menu=="fuente") {
			fuente.add(elemMenu);
			elemMenu.addActionListener(new StyledEditorKit.FontFamilyAction("",tipoLetra));

	/*		
	if(tipoLetra=="Arial") {
				
				elemMenu.addActionListener(new StyledEditorKit.FontFamilyAction("","Arial"));
			}
			else if(tipoLetra=="Courier") {
				elemMenu.addActionListener(new StyledEditorKit.FontFamilyAction("","Courier"));

			}
			else if(tipoLetra=="Verdana") {
				elemMenu.addActionListener(new StyledEditorKit.FontFamilyAction("","Verdana"));

			}
		*/
			
		}
		else if(menu=="estilo") {
			estilo.add(elemMenu);
			
			if(estilos==Font.BOLD) {
				
				elemMenu.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_DOWN_MASK));
				
				elemMenu.addActionListener(new StyledEditorKit.BoldAction());

			}
			else if(estilos==Font.ITALIC) {
				elemMenu.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_K, InputEvent.CTRL_DOWN_MASK));
				elemMenu.addActionListener(new StyledEditorKit.ItalicAction());

			}

		
		}
		
			
		else if(menu=="tamano") {
			tamano.add(elemMenu);
			
			elemMenu.addActionListener(new StyledEditorKit.FontSizeAction("", tam));
		}
		
		
		
	}
	
	
	
	
	private JTextPane area;
	private JMenu fuente, estilo, tamano;
	private Font letras;
	private JButton negritaBarra, cursivaBarra,subBarra,azulBarra,rojoBarra,amarilloBarra,izquierda,centrado,derecha,justificado;
	private JToolBar barra2;

}