package graficos;
import javax.swing.*;
import java.awt.*;

public class Layouts_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoLayout mimarco=new MarcoLayout();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mimarco.setVisible(true);
		
		
		
	}

}

class MarcoLayout extends JFrame{
	
	public MarcoLayout() {
		
		setTitle("Prueba Layout");
		setBounds(700,300,400,400);
				
		PanelLayout lamina=new PanelLayout();
		PanelLayout2 lamina2=new PanelLayout2();
		
		
		//FlowLayout disposicion=new FlowLayout(FlowLayout.LEFT);

		
		//lamina.setLayout(new FlowLayout(FlowLayout.CENTER,75,100));
		
		add(lamina,BorderLayout.NORTH);
		
		add(lamina2,BorderLayout.SOUTH);
	}
}

class PanelLayout extends JPanel{
	
	public PanelLayout() {
		
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		add(new JButton("Amarillo"));
		add(new JButton("Rojo"));
		
		
		
	}
}

class PanelLayout2 extends JPanel{
	
	public PanelLayout2() {
		
		setLayout(new BorderLayout());
		
		add(new JButton("Azul"),BorderLayout.WEST);
		add(new JButton("Verde"),BorderLayout.EAST);
		add(new JButton("Negro"),BorderLayout.CENTER);
	}
}