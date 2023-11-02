package graficos;
import javax.swing.*;
import java.awt.*;
public class MarcoMEmergente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoEmergente2 marco=new MarcoEmergente2();
		
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}
class MarcoEmergente2 extends JFrame{
	
	public MarcoEmergente2() {
		setBounds(100,100,300,300);
		add(new LaminaEmergente());
		setVisible(true);
		
	}
}
class LaminaEmergente extends JPanel{
	
	public LaminaEmergente() {
		
		setLayout(new BorderLayout());
		
		JPanel lamina2=new JPanel();
		
		//--------------------------------
		
		JMenuBar barra=new JMenuBar();
		
		JMenu fuente=new JMenu("Fuente");
		JMenu estilo=new JMenu("Estilo");
		JMenu tamano=new JMenu("Tamaño");
		
		//--------------------------------
		
		barra.add(fuente);
		barra.add(estilo);
		barra.add(tamano);
		
		lamina2.add(barra);
		
		add(lamina2,BorderLayout.NORTH);
		
		//--------------------------------
		
		JTextPane area=new JTextPane();
		
		add(area,BorderLayout.CENTER);
		
		//--------------------------------
		
		JPopupMenu emergente=new JPopupMenu();
		
		JMenuItem opcion1=new JMenuItem("Opcion 1");
		JMenuItem opcion2=new JMenuItem("Opcion 2");
		JMenuItem opcion3=new JMenuItem("Opcion 3");
		
		emergente.add(opcion1);
		emergente.add(opcion2);
		emergente.add(opcion3);
	

		area.setComponentPopupMenu(emergente);
		
		
		
	}
}