package graficos;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

public class MarcoSliders {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FrameSliders mimarco=new FrameSliders();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class FrameSliders extends JFrame{
	
	public FrameSliders() {
		setBounds(700,300,500,350);
		add(new LaminaSliders());
		setVisible(true);
	}
}

class LaminaSliders extends JPanel{
	
	public LaminaSliders() {
		
		setLayout(new BorderLayout());
		
		rotulo=new JLabel("En un lugar de la Mancha...");
		add(rotulo,BorderLayout.CENTER);
		
		control=new JSlider(8,50,12);
		
		control.setMajorTickSpacing(20);
		control.setMinorTickSpacing(5);
		
		control.setPaintTicks(true);
		control.setPaintLabels(true);
		
		control.setFont(new Font("Serif", Font.ITALIC, 10));
		
		control.addChangeListener(new EventoSlider());
		
		JPanel laminaSlider=new JPanel(); 
		
		laminaSlider.add(control);
		add(laminaSlider, BorderLayout.NORTH);
		
		
		
		
	}
	private class EventoSlider implements ChangeListener{

		@Override
		public void stateChanged(ChangeEvent e) {
			// TODO Auto-generated method stub
			
			rotulo.setFont(new Font("Serif", Font.PLAIN, control.getValue()));
			
		}
		
	}
	private JLabel rotulo;
	private JSlider control;
	
	
}
