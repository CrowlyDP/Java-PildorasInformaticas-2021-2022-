package transacciones;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class Transaccion_Productos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection miConexion=null;
		try{					
				
			miConexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/pruebas", "root", "");				
			
			miConexion.setAutoCommit(false);
			
			Statement miStatement =miConexion.createStatement();
			
		    String instruccionSql_1="DELETE FROM PRODUCTOS PAíSDEORIGEN='ITALIA'";
		  
		    String instruccionSql_2="DELETE FROM PRODUCTOS WHERE PRECIO>300";
		
		    String instruccionSql_3="UPDATE PRODUCTOS SET PRECIO=PRECIO*1.15";
		    
		    boolean ejecutar=ejecutarTransaccion();
		    if(ejecutar) {
		  
		    miStatement.executeUpdate(instruccionSql_1);
		    miStatement.executeUpdate(instruccionSql_2);
		    miStatement.executeUpdate(instruccionSql_3);
		    miConexion.commit(); 
		    
		    System.out.println("OK");
		    
		    }else {
		    	System.out.println("No se realizó cambio alguno en la BD");
		    }
		    
		}catch(Exception e) {
			
			try {
				miConexion.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			System.out.println("Algo salió mal :(");
			
		}

	}
	
	static boolean ejecutarTransaccion() {
		
		String ejecucion=JOptionPane.showInputDialog("Desea ejecutar la transaccion");
	
	if(ejecucion.equalsIgnoreCase("si")) 
		return true;
	else return false;
	
	}

}
