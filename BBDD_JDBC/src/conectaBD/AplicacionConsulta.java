package conectaBD;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class AplicacionConsulta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame mimarco = new Marco_Aplicacion();

		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		mimarco.setVisible(true);

	}

}

class Marco_Aplicacion extends JFrame {

	public Marco_Aplicacion() {

		setTitle("Consulta BBDD");

		setBounds(500, 300, 400, 400);

		setLayout(new BorderLayout());

		JPanel menus = new JPanel();

		menus.setLayout(new FlowLayout());

		secciones = new JComboBox();

		secciones.setEditable(false);

		secciones.addItem("Todos");

		paises = new JComboBox();

		paises.setEditable(false);

		paises.addItem("Todos");

		resultado = new JTextArea(4, 50);

		resultado.setEditable(false);

		add(resultado);

		menus.add(secciones);

		menus.add(paises);

		add(menus, BorderLayout.NORTH);

		add(resultado, BorderLayout.CENTER);

		JButton botonConsulta = new JButton("Consulta");
		
		botonConsulta.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
				ejecutaConsulta();
			}
			
		});

		add(botonConsulta, BorderLayout.SOUTH);
		
		
		
		//-----------------CONEXIÓN CON BBDD------------------------------------
		
		try {
			
			conexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/ventas", "root", "");
		
			Statement sentencia=conexion.createStatement();
			
			//--------CONTENIDO 1ª COMBO BOX-------------------------------------
			
				String consulta="SELECT DISTINCTROW CIUDAD FROM CLIENTE";
			
			ResultSet rs=sentencia.executeQuery(consulta);
			
			while(rs.next()) {
				secciones.addItem(rs.getString(1));
			}
			rs.close();
			
			//---------CONTENIDO 2º COMBO BOX------------------------------------
			
				consulta="SELECT DISTINCTROW APELLIDO1 FROM CLIENTE";
			
			 rs=sentencia.executeQuery(consulta);
			
			while(rs.next()) {
				paises.addItem(rs.getString(1));
			}
			rs.close();
			
			
			
			
		
		} catch (SQLException e) {

			e.printStackTrace();
		}


	}
	
	private void ejecutaConsulta() {
		
		ResultSet rs=null;
		
		try {
			
			resultado.setText("");
			
			String seccion=(String)secciones.getSelectedItem();
			
			String apellido=(String)paises.getSelectedItem();
			
			
				if(!seccion.equals("Todos") && apellido.equals("Todos")) {
					
				enviaConsultaSeccion=conexion.prepareStatement(consultaSeccion);
				
				enviaConsultaSeccion.setString(1, seccion);
				
				rs=enviaConsultaSeccion.executeQuery();
				
				}else if(seccion.equals("Todos") && !apellido.equals("Todos")){
					
					enviaConsultaApellido=conexion.prepareStatement(consultaApellido);
					
					enviaConsultaApellido.setString(1, apellido);
					
					rs=enviaConsultaApellido.executeQuery();
					
				}else if(!seccion.equals("Todos") && !apellido.equals("Todos")){
					
	
					enviaConsultaTodos=conexion.prepareStatement(consultaTodos);
					
					enviaConsultaTodos.setString(1, seccion);
					enviaConsultaTodos.setString(2, apellido);
					
					rs=enviaConsultaTodos.executeQuery();
					
				}
			
			while(rs.next()) {
				
				resultado.append(rs.getString(1));
				
				resultado.append(", ");
				
				resultado.append(rs.getString(2));
				
				resultado.append(", ");
				
				resultado.append(rs.getString(3));
				
				resultado.append(", ");
				
				resultado.append(rs.getString(4));
				
				resultado.append("\n");
			} 
			
		}catch(Exception e){
			
		}
		
		
		
	}

	private JComboBox secciones;

	private JComboBox paises;

	private JTextArea resultado;
	
	private PreparedStatement enviaConsultaSeccion;
	private PreparedStatement enviaConsultaApellido;
	private PreparedStatement enviaConsultaTodos;
	
	private Connection conexion;
	
	private final String consultaSeccion="SELECT NOMBRE, ID, CIUDAD, APELLIDO1 FROM CLIENTE WHERE CIUDAD=?";
	private final String consultaApellido="SELECT NOMBRE, ID, CIUDAD, APELLIDO1 FROM CLIENTE WHERE APELLIDO1=?";
	private final String consultaTodos="SELECT NOMBRE, ID, CIUDAD, APELLIDO1 FROM CLIENTE WHERE CIUDAD=? AND APELLIDO1=?";

}
