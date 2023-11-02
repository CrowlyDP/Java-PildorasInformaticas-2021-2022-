package practicas;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.Rectangle2D;
import java.util.Date;

import javax.swing.*;

public class MarcoDialogos extends JFrame{
	
	public MarcoDialogos() {
		
		setTitle("Prueba de diálogos");
		setBounds(700,300,600,450);
		
		JPanel laminaCuadricula=new JPanel(); 
		laminaCuadricula.setLayout(new GridLayout(2,3));
		
		String primero[]= {"Mensaje","Confirmar","Opcion","Entrada"};
		
		laminaTipo=new LaminaBotones("Tipo",primero);
		
		laminaTipoMensajes=new LaminaBotones("Tipo de Mensajes",new String[] {
				
				"ERROR_MESSAGE",
				"INFORMATION_MESSAGE",
				"WARNING_MESSAGE",
				"QUESTION_MESSAGE",
				"PLAIN_MESSAGE"
			});
		
		laminaMensaje=new LaminaBotones("Mensaje",new String[] {
				
				"Cadena", 
				"Icono", 
				"Componente", 
				"Otros", 
				"Object[]"
			});
		laminaTipoOpcion=new LaminaBotones("Confirmar", new String[] {
				
				"DEFAULT_OPTION",
				"YES_NO_OPTION", 
				"YES_NO_CANCEL_OPTION", 
				"OK_CANCEL_OPTION"
			});
		
		laminaOpciones=new LaminaBotones("Opción", new String[] {
				
				"String[]",
				"Icon[]", 
				"Object[]"
			});
		
		laminaEntrada=new LaminaBotones("Entrada", new String[] {
				
			"Campo de texto",
			"Combo"
			});
		
		setLayout(new BorderLayout());
			
			
		
		
		laminaCuadricula.add(laminaTipo);
		laminaCuadricula.add(laminaTipoMensajes);
		laminaCuadricula.add(laminaMensaje);
		laminaCuadricula.add(laminaTipoOpcion);
		laminaCuadricula.add(laminaOpciones);
		laminaCuadricula.add(laminaEntrada);
		
		//Construimos la lamina inferior
		
		JPanel laminaMostrar=new JPanel();
		JButton botonMostrar=new JButton("Mostrar");
		
		botonMostrar.addActionListener(new AccionMostrar());
		
		laminaMostrar.add(botonMostrar);
		
		add(laminaMostrar,BorderLayout.SOUTH);
		add(laminaCuadricula, BorderLayout.CENTER);
		
		
		
		
	}
	
	//-----------------------------------------------------PROPORCIONA EL MENSAJE
	
	public Object dameMensaje() {
		
		String s=laminaMensaje.dameSeleccion();
		
		if(s.equals("Cadena")) {
			return cadenaMensaje;
		}else if(s.equals("Icono")) {
			return iconoMensaje;
		}else if (s.contentEquals("Componente")) {
			return componenteMensaje;
		}else if(s.contentEquals("Otros")) {
			return objetoMensaje;
		}else if(s.equals("Object[]")) {
			return new Object[] {cadenaMensaje, iconoMensaje, componenteMensaje,objetoMensaje};
		}else {
			return null;
		}
		
	}
	//-----------------------DEVUELVE TIPO ICONO Y NUMERO DE BOTONES EN CONFIRMAR
	
	public int dameTipo(LaminaBotones lamina) {
		
		String s=lamina.dameSeleccion();
		
		if(s.equals("ERROR_MESSAGE") || s.equals("YES_NO_OPTION")) {
			return 0;
		}else if(s.equals("INFORMATION_MESSAGE") || s.equals("YES_NO_CANCEL_OPTION")) {
			return 1;
		}else if(s.equals("WARNING_MESSAGE") || s.equals("OK_CANCEL_OPTION")) {
			return 2;
		}else if(s.equals("QUESTION_MESSAGE")) {
			return 3;
		}else if(s.equals("PLAIN_MESSAGE") || s.equals("DEFAULT_OPTION")) {
			return -1;
		}else {
			return 0;
		}
	}
	
	//------------------------------------------DA OPCIONES A LA LAMINA OPCION
	
	public Object[] dameOpciones() {
		
		String s=laminaOpciones.dameSeleccion();
		if(s.equals("String[]")) {
			
			return new String[] {"Amarillo", "Azul", "Rojo"};
			
		}else if(s.equals("Icon[]")) {
			
			return new Object[] {new ImageIcon("src/graficos/iconoAmarillo.gif"),
								 new ImageIcon("src/graficos/iconoRojo.gif")};
			
		}else if (s.equals("Object[]")){
			
			return new Object[] {cadenaMensaje, iconoMensaje, componenteMensaje,objetoMensaje};
		}
		
		else {
			return null;
		}
		
	}
	
	//-------------------------------------------SELECCIONA EL TIPO DE VENTANA	

	private class AccionMostrar implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			//System.out.println(laminaTipo.dameSeleccion());
			
			if(laminaTipo.dameSeleccion().equals("Mensaje")) {
				
				JOptionPane.showMessageDialog(MarcoDialogos.this, dameMensaje(), "Titulo", dameTipo(laminaTipoMensajes));
			
			}else if(laminaTipo.dameSeleccion().equals("Confirmar")) {
				
				JOptionPane.showConfirmDialog(MarcoDialogos.this, dameMensaje(), "Titulo",dameTipo(laminaTipoOpcion),dameTipo(laminaTipoMensajes));
			
			}else if(laminaTipo.dameSeleccion().equals("Entrada")) {
				
				if(laminaEntrada.dameSeleccion().equals("Campo de texto")) {
				
					JOptionPane.showInputDialog(MarcoDialogos.this,dameMensaje(), "Titulo",dameTipo(laminaTipoMensajes));
				
				}else {
					
					JOptionPane.showInputDialog(MarcoDialogos.this,dameMensaje(),"Titulo",dameTipo(laminaTipoMensajes),null,new String[] {"Amarillo","Azul","Rojo"},"Azul");
				}
				
			}else if(laminaTipo.dameSeleccion().equals("Opcion")){
				
				JOptionPane.showOptionDialog(MarcoDialogos.this, dameMensaje(), "Titulo", 1, dameTipo(laminaTipoMensajes), null, dameOpciones(), null);
			}
		}
		
	}
	
	//----------------------------------------------------------------------------
	
	private LaminaBotones laminaTipo, 
						  laminaTipoMensajes, 
						  laminaMensaje, 
						  laminaTipoOpcion,
						  laminaOpciones,
						  laminaEntrada;
	
	private String cadenaMensaje="Mensaje";
	private Icon iconoMensaje=new ImageIcon("src/graficos/iconoRojo.gif");
	private Object objetoMensaje=new Date();
	private Component componenteMensaje=new LaminaEjemplo();
	
}

	//-------------------------------------------------CLASE PARA EL TERCER CUADRO


class LaminaEjemplo extends JPanel{
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		Graphics2D g2=(Graphics2D) g;
		
		Rectangle2D rectangulo=new Rectangle2D.Double(0, 0, getWidth(), getHeight());
		
		g2.setPaint(Color.YELLOW);
		g2.fill(rectangulo);
		
	}
}
