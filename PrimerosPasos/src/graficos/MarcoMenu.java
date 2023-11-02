package graficos;
import javax.swing.*;

public class MarcoMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MenuFrame marco= new MenuFrame();
		
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MenuFrame extends JFrame{
	
	public MenuFrame() {
		setBounds(700,300,400,400);
		add(new MenuLamina());
		setVisible(true);
	}
}

class MenuLamina extends JPanel{
	
	public MenuLamina() {
		
		JMenuBar barra=new JMenuBar();
		
		JMenu archivo=new JMenu("Archivo");
		JMenu edicion=new JMenu("Edición");
		JMenu herramientas=new JMenu("Herramientas");
		
		JMenu opciones=new JMenu("Opciones");
		
		JMenuItem guardar=new JMenuItem("Guardar");
		JMenuItem guardarComo=new JMenuItem("Guardar como");

		JMenuItem cortar=new JMenuItem("Cortar",new ImageIcon("src/graficos/cortar.gif"));
		JMenuItem copiar=new JMenuItem("Copiar",new ImageIcon("src/graficos/copiar.gif"));
		copiar.setHorizontalTextPosition(SwingConstants.LEFT);
		JMenuItem pegar=new JMenuItem("Pegar",new ImageIcon("src/graficos/pegar.gif"));

		JMenuItem generales=new JMenuItem("Generales");

		JMenuItem opcion1=new JMenuItem("Opcion 1");
		JMenuItem opcion2=new JMenuItem("Opcion 2");
		
		
		archivo.add(guardar);
		archivo.add(guardarComo);
		
		edicion.add(cortar);
		edicion.add(copiar);
		edicion.add(pegar);
		
		edicion.addSeparator();
		
		edicion.add(opciones);

	
		herramientas.add(generales);
		
		opciones.add(opcion1);
		opciones.add(opcion2);
		
		
		barra.add(archivo);
		barra.add(edicion);
		barra.add(herramientas);
		
		add(barra);
	}
}