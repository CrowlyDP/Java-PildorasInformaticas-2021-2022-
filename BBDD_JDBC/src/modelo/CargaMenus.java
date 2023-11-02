package modelo;

import java.sql.*;



public class CargaMenus {
	
	public CargaMenus() {
		
		miConexion=new Conexion();
		
	}
	
	public String ejecutaConsultas() {
		
		Productos miProducto=null;
		
		Connection accesoBBDD=miConexion.dameConnection();

		try {
			
			Statement secciones=accesoBBDD.createStatement();
			Statement apellidos=accesoBBDD.createStatement();
			
			rs=secciones.executeQuery("SELECT DISTINCTROW CIUDAD FROM CLIENTE");
			
			rs2=apellidos.executeQuery("SELECT DISTINCTROW APELLIDO1 FROM CLIENTE");
			
			//while(rs.next()) {
				
				
				
				miProducto=new Productos();
				
				miProducto.setCiudad(rs.getString(1));
				
				miProducto.setApellido1(rs2.getString(1));
				
				//return miProducto.getCiudad();
			//}
			
			rs.close();
			rs2.close();
			
			accesoBBDD.close();
			
		}catch(Exception e) {
			
			System.out.println("ERROR");
		}
		
		return miProducto.getCiudad();
	}
	
	
	Conexion miConexion;
	public ResultSet rs;
	public ResultSet rs2;

}
