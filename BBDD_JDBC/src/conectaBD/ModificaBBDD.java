package conectaBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ModificaBBDD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
	
		//1. CREAR CONEXIÓN	
			
			Connection conexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/tienda", "root", "");
			
		//2. CREAR OBJETO STATEMENT
			
			Statement miStatement=conexion.createStatement();
			
			String instruccionSql="INSERT INTO PRODUCTO(codigo,nombre,precio) VALUES ('77', 'PANTALON', 25.35)";
		
			miStatement.executeUpdate(instruccionSql);
			
			System.out.println("datos insertados correctamente");
			
		}catch(Exception e) {
			
			System.out.println("No conecta");
			e.printStackTrace();
			
		}

	}

}
