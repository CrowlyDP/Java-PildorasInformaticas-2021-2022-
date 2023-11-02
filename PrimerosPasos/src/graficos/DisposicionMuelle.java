package graficos;
import javax.swing.*;
import java.awt.*;

public class DisposicionMuelle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoMuelle marco=new MarcoMuelle();
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		marco.setVisible(true);
	}

}

class MarcoMuelle extends JFrame{
	
	public MarcoMuelle() {
		setBounds(700,300,1000,400);
		add(new LaminaMuelle());
		
	}
}

class LaminaMuelle extends JPanel{
	
	public LaminaMuelle() {
		
		JButton boton1=new JButton("boton 1");
		JButton boton2=new JButton("boton 2");
		JButton boton3=new JButton("boton 3");
		
		SpringLayout layout=new SpringLayout();
		setLayout(layout);
		
		add(boton1);
		add(boton2);
		add(boton3);
		
		Spring muelle=Spring.constant(0, 10, 100);
		Spring rigido=Spring.constant(20);
		
		layout.putConstraint(SpringLayout.WEST, boton1, muelle, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.WEST, boton2, rigido, SpringLayout.EAST, boton1);
		layout.putConstraint(SpringLayout.WEST, boton3, rigido, SpringLayout.EAST, boton2);
		layout.putConstraint(SpringLayout.EAST, this, muelle, SpringLayout.EAST, boton3);
		
		
	}
}