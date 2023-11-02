package modelo;

import java.sql.*;
public class Conexion {
	
	Connection conexion=null;
	
	public Conexion() {
		
	}

	public Connection dameConnection() {
		
		try {
		 	conexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/ventas", "root", "");

		}catch(Exception e) {
			
		}
		
		return conexion;

	}
}
