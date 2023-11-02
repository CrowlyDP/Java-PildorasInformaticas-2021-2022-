package graficos;

import javax.swing.*;
public class CreandoMarcos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		miMarco marco1= new miMarco();
		miMarco marco2= new miMarco();
				 
		
		
	}

}

class miMarco extends JFrame{
	
	public miMarco() {
		
		setVisible(true);
		
		//setSize(500,300);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//setLocation(500,300);
		
		setBounds(550,300,250,250);
		
		//setResizable(false);
		
		//setExtendedState(Frame.MAXIMIZED_BOTH);
		
		setTitle("Mi ventana");
	}
	
}
