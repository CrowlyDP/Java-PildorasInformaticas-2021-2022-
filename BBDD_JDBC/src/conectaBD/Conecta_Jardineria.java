package conectaBD;

import java.sql.*;

public class Conecta_Jardineria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
	
		//1. CREAR CONEXIÓN	
			
			Connection conexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/tienda", "root", "");
			
		//2. CREAR OBJETO STATEMENT
			
			Statement miStatement=conexion.createStatement();
			
		//3. EJECUTAR SQL
			
			ResultSet miResultset=miStatement.executeQuery("SELECT * FROM PRODUCTO");
		
		//4. RECORRER EL RESULTSET
			
			while(miResultset.next()) {
				
				System.out.println(miResultset.getString("codigo") + " " + miResultset.getNString("nombre") + " " + miResultset.getDouble("precio"));
				
			}
		
		}catch(Exception e) {
			
			System.out.println("No conecta");
			e.printStackTrace();
			
		}

	}

}
