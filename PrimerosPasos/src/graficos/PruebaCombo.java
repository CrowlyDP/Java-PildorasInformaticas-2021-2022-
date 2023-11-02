package graficos;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class PruebaCombo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoCombo mimarco=new MarcoCombo();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}

class MarcoCombo extends JFrame{
	
	public MarcoCombo() {
		setBounds(700,300,500,350);
		add(new LaminaCombo());
		setVisible(true);

	}
}

class LaminaCombo extends JPanel{
	
	public LaminaCombo() {
		setLayout(new BorderLayout());
		
		texto=new JLabel("En un lugar de la Mancha....");
		texto.setFont(new Font("Serif",Font.PLAIN, 18));
		
		add(texto,BorderLayout.CENTER);
		
		JPanel LaminaNorte=new JPanel();
		
		micombo=new JComboBox();
		micombo.setEditable(true);
		
		micombo.addActionListener(new EventoCombo());
		
		micombo.addItem("Serif");
		micombo.addItem("SansSerif");
		micombo.addItem("Monospaced");
		micombo.addItem("Dialog");
		
		LaminaNorte.add(micombo);
		add(LaminaNorte,BorderLayout.NORTH);
		
		
		
	}
	
	private class EventoCombo implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			texto.setFont(new Font((String)micombo.getSelectedItem(), Font.PLAIN,18));
			
		}
		
	}
	
	private JLabel texto;
	private JComboBox micombo;
	
	
}