package graficos;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.text.*;

public class Prueba_Eventos_Texto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoPrueba mimarco=new MarcoPrueba();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
	}

}

class MarcoPrueba extends JFrame{
	public MarcoPrueba() {
		setBounds(700,300,400,400);
		LaminaPrueba milamina=new LaminaPrueba();
		add(milamina);
		setVisible(true);
		
	}
}

class LaminaPrueba extends JPanel{
	
	public LaminaPrueba() {
		JTextField micampo=new JTextField(20);
		
		escuchaTexto elEvento=new escuchaTexto();
		
		Document midoc=micampo.getDocument();
		
		midoc.addDocumentListener(elEvento);
		
		add(micampo);
		
		
	}
	
	private class escuchaTexto implements DocumentListener{

		@Override
		public void changedUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void insertUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
			System.out.println("Has insertado texto");
			
		}

		@Override
		public void removeUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
			System.out.println("Has borrado todo");
			
		}
		
	}
}