package graficos;
import javax.swing.*;

import java.awt.event.*;

public class EventosVentana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoVentana mimarco=new MarcoVentana();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		MarcoVentana mimarco2=new MarcoVentana();
		
		mimarco2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		mimarco.setTitle("Ventana1");
		mimarco2.setTitle("Ventana2");
		mimarco.setBounds(400,200,400,400);
		mimarco2.setBounds(900,200,400,400);

	}

}

class MarcoVentana extends JFrame{
	
	public MarcoVentana() {
			
			
			setVisible(true);
			
			//M_Ventana oyente_ventana=new M_Ventana();
			
			//addWindowListener(oyente_ventana);
			
			addWindowListener(new M_Ventana());
	}
	
}

class M_Ventana extends WindowAdapter{
	
	public void windowIconified(WindowEvent e) {
		
		System.out.println("Ventana minimizada");
	}
}
	