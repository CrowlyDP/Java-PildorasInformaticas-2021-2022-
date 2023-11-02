package graficos;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;


public class CampoPassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoPassword mimarco=new MarcoPassword();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
class MarcoPassword extends JFrame{
	
	public MarcoPassword() {
		setBounds(700,300,550,500);
		LaminaPassword milamina=new LaminaPassword();
		
		add(milamina);
		setVisible(true);

	}
}
class LaminaPassword extends JPanel{
	
	public LaminaPassword() {
		
		setLayout(new BorderLayout());
		
		JPanel laminaSuperior=new JPanel();
		
		laminaSuperior.setLayout(new GridLayout(2,2));
		
		add(laminaSuperior,BorderLayout.NORTH);
		
		JLabel etiqueta1=new JLabel("Usuario");
		JLabel etiqueta2=new JLabel("Contraseña");
		
		JTextField cUsuario=new JTextField(15);
		
		cContra=new JPasswordField(15);
		
		cContra.getDocument().addDocumentListener(new CompruebaPass());
		
		laminaSuperior.add(etiqueta1);
		laminaSuperior.add(cUsuario);
		laminaSuperior.add(etiqueta2);
		laminaSuperior.add(cContra);
		
		JButton enviar=new JButton("Enviar");
		add(enviar,BorderLayout.SOUTH);
		
		
		
		
	}
	private class CompruebaPass implements DocumentListener{

		@Override
		public void changedUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void insertUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
			
			char [] contrasena;
			contrasena=cContra.getPassword();
			
			if(contrasena.length<8 || contrasena.length>12) {
				
				cContra.setBackground(Color.RED);
				
			}else {
				cContra.setBackground(Color.WHITE);
			}
			
		}

		@Override
		public void removeUpdate(DocumentEvent e) {
			
			// TODO Auto-generated method stub
			char [] contrasena;
			contrasena=cContra.getPassword();
			
			if(contrasena.length<8 || contrasena.length>12) {
				
				cContra.setBackground(Color.RED);
				
			}else {
				cContra.setBackground(Color.WHITE);
			}
		}
		
	}
	private JPasswordField cContra;
}
