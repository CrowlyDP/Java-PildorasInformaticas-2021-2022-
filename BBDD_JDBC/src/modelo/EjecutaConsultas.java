package modelo;
import java.sql.*;

public class EjecutaConsultas {

	
	public EjecutaConsultas() {
		conexion=new Conexion();
		
		
	}
	public ResultSet filtraBBDD(String seccion, String apellido) {
		
		//pruebas="";
		
		
		Connection conecta=conexion.dameConnection();
		
		rs=null;
		
		try {
			
		
		
		if(!seccion.equals("Todos") && apellido.equals("Todos")) {
			//pruebas="Has escogido seccion";
			
			enviaConsultaSeccion=conecta.prepareStatement(consultaSeccion);
			
			enviaConsultaSeccion.setString(1, seccion);
			
			rs=enviaConsultaSeccion.executeQuery();
			
		}else if(seccion.equals("Todos") && !apellido.equals("Todos")) {
			//pruebas="Has escogido un apellido";
			
			enviaConsultaApellido=conecta.prepareStatement(consultaApellido);
			
			enviaConsultaApellido.setString(1, apellido);
			
			rs=enviaConsultaApellido.executeQuery();
			
		}else {
			//pruebas="Has escogido ambos";
			
			enviaConsultaTodos=conecta.prepareStatement(consultaTodos);
			
			enviaConsultaTodos.setString(1, seccion);
			enviaConsultaTodos.setString(2, apellido);
			
			rs=enviaConsultaTodos.executeQuery();
			
		}
		
		}catch(Exception e) {
			System.out.println("ERROR");
		}
		//return pruebas;
		
		return rs;
	}
	
	//private String pruebas;
	
	private Conexion conexion;
	private ResultSet rs;
	
	private PreparedStatement enviaConsultaSeccion; // Se puede usar el mismo PreparedStatement para todos.
	private final String consultaSeccion="SELECT NOMBRE, CIUDAD, APELLIDO1 FROM CLIENTE WHERE CIUDAD=?";
	
	private PreparedStatement enviaConsultaApellido;
	private final String consultaApellido="SELECT NOMBRE, CIUDAD, APELLIDO1 FROM CLIENTE WHERE APELLIDO1=?";
	
	private PreparedStatement enviaConsultaTodos;
	private final String consultaTodos="SELECT NOMBRE, CIUDAD, APELLIDO1 FROM CLIENTE WHERE CIUDAD=? AND APELLIDO1=?";
	
}
