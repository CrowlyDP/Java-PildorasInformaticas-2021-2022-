package metadatos;

import java.sql.*;

public class Info_Metadatos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//mostrarInfoBBDD();
		mostrarInfoTablas();
		
	}
	
 static void mostrarInfoBBDD() {
		
		Connection miConexion=null;
		
		 try {
			 
			miConexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/pruebas", "root", "");
		
			//Obtencion de metadatos
			
			DatabaseMetaData datos=miConexion.getMetaData();
			
			//Mostramos información de la BBDD
			
			System.out.println(datos.getDatabaseProductName());
			System.out.println(datos.getDatabaseProductVersion());
			System.out.println(datos.getDriverName());
			System.out.println(datos.getDriverVersion());
			
		 } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				miConexion.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		 

	}
	
 static void mostrarInfoTablas() {
		
		Connection miConexion=null;
		ResultSet miResultset=null;
		
		 try {
			 
			miConexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/pruebas", "root", "");
		
			//Obtencion de metadatos
			
			DatabaseMetaData datos=miConexion.getMetaData();
			
			//Lista de tablas
			System.out.println("Lista de tablas");
			
			miResultset=datos.getTables(null, null, "p%", null);
			
			while(miResultset.next()) {
				System.out.println(miResultset.getString("TABLE_NAME"));
			}
			
			//Lista de columnas de Productos
			System.out.println("");
			System.out.println("Campos de Producto");
			
			miResultset=datos.getColumns(null, null, "producto", null);
			
			while(miResultset.next()) {
				System.out.println(miResultset.getString("COLUMN_NAME"));
			}
			
		 }catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				try {
					miConexion.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
	}

}
