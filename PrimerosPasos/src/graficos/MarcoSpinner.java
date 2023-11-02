package graficos;
import java.awt.Dimension;
import java.awt.GraphicsEnvironment;

import javax.swing.*;

public class MarcoSpinner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FrameSpinner marco=new FrameSpinner();
		
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco.setVisible(true);

	}

}

class FrameSpinner extends JFrame{
	
	public FrameSpinner() {
		setBounds(700,300,500,350);
		add(new LaminaSpinner());
		
	}
}

class LaminaSpinner extends JPanel{
	
	public LaminaSpinner() {
		
		//String lista[]=GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		JSpinner control=new JSpinner(new SpinnerNumberModel(5,0,10,1) {
			
			public Object getNextValue() {
				return super.getPreviousValue();
			}
			public Object getPreviousValue() {
				return super.getNextValue();
			}
				
		});
		
		
		JSpinner.DefaultEditor sEditor = (JSpinner.DefaultEditor)control.getEditor();
		JFormattedTextField text = (JFormattedTextField)sEditor.getComponent(0);
		text.setHorizontalAlignment(JFormattedTextField.CENTER);
		
		Dimension d=new Dimension(140,20);
		control.setPreferredSize(d);
		
		add(control);
		
	}
	
	/*private class MiModeloJSpinner extends SpinnerNumberModel{
		
		public MiModeloJSpinner() {
			
			super(5,0,10,1);
		}
		public Object getNextValue() {
			return super.getPreviousValue();
		}
		public Object getPreviousValue() {
			return super.getNextValue();
		}
	}*/
}
