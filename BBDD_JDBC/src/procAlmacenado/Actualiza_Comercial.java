package procAlmacenado;

import java.sql.*;

import javax.swing.JOptionPane;

public class Actualiza_Comercial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double comision=Double.parseDouble(JOptionPane.showInputDialog("Introduce una comision"));
		
		String nombre=JOptionPane.showInputDialog("Introduce el nombre del comercial");
		
		try {
		 	Connection conexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/ventas", "root", "");
			
		 	CallableStatement sentencia=conexion.prepareCall("{call actualizacomercial(?, ?)}");
		 	
		 	sentencia.setDouble(1, comision);
		 	sentencia.setString(2, nombre);
		 	
		 	sentencia.execute();
		 	
		 	System.out.println("Actualizado");
		}catch(Exception e) {
			
		}

	}

}
