package graficos;
import javax.swing.*;
import java.awt.*;
public class DisposicionLibre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoLibre marco=new MarcoLibre();
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		marco.setVisible(true);
	}

}

class MarcoLibre extends JFrame{
	
	public MarcoLibre() {
		setBounds(700,300,600,600);
		add(new LaminaLibre());
		
	}
}

class LaminaLibre extends JPanel{
	
	public LaminaLibre() {
		
		setLayout(new EnColumnas());
		
		JLabel nombre=new JLabel("Nombre: ");
		JLabel apellido=new JLabel("Apellido: ");
		JLabel edad=new JLabel("Edad: ");
		
		JTextField cNombre=new JTextField();
		JTextField cApellido=new JTextField();
		JTextField cEdad=new JTextField();
		
		/*nombre.setBounds(20,20,80,15);
		cNombre.setBounds(100,20,100,20);
		
		apellido.setBounds(20,60,80,15);
		cApellido.setBounds(100,58,100,20);*/
		
		add(nombre);
		add(cNombre);
		
		add(apellido);
		add(cApellido);
		
		add(edad);
		add(cEdad);
	}
	
}

///////////////////////////////////////////////

class EnColumnas implements LayoutManager{

	@Override
	public void addLayoutComponent(String arg0, Component arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void layoutContainer(Container micontenedor) {
		// TODO Auto-generated method stub
		
		int d=micontenedor.getWidth();
		x=d/2;
		
		int contador=0;
		int n=micontenedor.getComponentCount();
		
		for(int i=0; i<n;i++) {
			
			contador++;
			Component c=micontenedor.getComponent(i);
			c.setBounds(x-100, y, 100, 20);
			
			x+=100;
			
			if(contador%2==0) {
				x=d/2;
				y+=40;
			}
		}
		
	}

	@Override
	public Dimension minimumLayoutSize(Container parent) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Dimension preferredLayoutSize(Container parent) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeLayoutComponent(Component comp) {
		// TODO Auto-generated method stub
		
	}
	
	private int x;
	private int y=20;
	
}



