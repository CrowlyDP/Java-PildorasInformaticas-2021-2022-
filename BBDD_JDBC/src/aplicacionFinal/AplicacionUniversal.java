package aplicacionFinal;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

import java.io.*;




public class AplicacionUniversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoBBDD mimarco=new MarcoBBDD();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mimarco.setVisible(true);
		
		

	}

}

class MarcoBBDD extends JFrame{

	public MarcoBBDD(){
		
		setBounds(300,300,700,700);
		
		LaminaBBDD milamina=new LaminaBBDD();
		add(milamina);
		
	}	
	
}

class LaminaBBDD extends JPanel{
	
	public LaminaBBDD(){
		
		setLayout(new BorderLayout());
		
		comboTablas=new JComboBox();
		areaInformacion=new JTextArea();
		
		add(areaInformacion,BorderLayout.CENTER);	
		
		conectaBBDD();
		obtenerTablas();
		
		comboTablas.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				String nombreTabla=(String)comboTablas.getSelectedItem();
				
				mostrarInfoTabla(nombreTabla);
			}
			
		});
		add(comboTablas, BorderLayout.NORTH);
		
		
		
		
		}
	
	
	public void conectaBBDD() {
		
		miConexion=null;
		
		String datos[]=new String[3];
		
		try {
			
			entrada=new FileReader("C:/Users/Alejandro/Desktop/datos_config.txt");
			
		}catch(IOException e) {
			
		
			JFileChooser chooser= new JFileChooser();
			
			FileNameExtensionFilter filter=new FileNameExtensionFilter("Archivos de texto", "txt");
			
			chooser.setFileFilter(filter);
			
			int valor=chooser.showOpenDialog(this);
			
			if(valor == JFileChooser.APPROVE_OPTION) {
				
				try {
					entrada=new FileReader(chooser.getSelectedFile().getAbsolutePath());
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}else {
				
			}
			
		}
		
		try {
	
			BufferedReader miBuffer=new BufferedReader(entrada);
			
			for(int i=0; i<3; i++) {
				
				datos[i]=miBuffer.readLine();
			}
			
			miConexion=DriverManager.getConnection(datos[0], datos[1], datos[2]);
		
			entrada.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
			
		
	}
	
	
	public void obtenerTablas() {
		
		ResultSet rs=null;
		
		try {
			
			DatabaseMetaData datosBBDD=miConexion.getMetaData();
			
			rs=datosBBDD.getTables(null, null, null, null);
			
			while(rs.next()) {
				
				comboTablas.addItem(rs.getString("TABLE_NAME"));
			}
			
			
		}catch(Exception e) {
			
			e.printStackTrace();
		}
		
	}
	public void mostrarInfoTabla(String tabla) {
		
		ArrayList<String> campos=new ArrayList<String>();
		
		String consulta="SELECT * FROM " + tabla;
		try {
			
			areaInformacion.setText("");
			
			Statement miStatement=miConexion.createStatement();
			
			ResultSet rs=miStatement.executeQuery(consulta);
			
			ResultSetMetaData rsBBDD=rs.getMetaData();
			
			for(int i=1; i<=rsBBDD.getColumnCount(); i++) {
				
				campos.add(rsBBDD.getColumnLabel(i));
			}
			
			while(rs.next()) {
				
				for(String e: campos) {
					
					areaInformacion.append(rs.getString(e) + "");
					
				}
				areaInformacion.append("\n");
			}
			
		}catch(Exception e) {
			
		}
	}

	
	private JComboBox comboTablas;
	private JTextArea areaInformacion;
	private Connection miConexion;
	private FileReader entrada;
	
	
}
