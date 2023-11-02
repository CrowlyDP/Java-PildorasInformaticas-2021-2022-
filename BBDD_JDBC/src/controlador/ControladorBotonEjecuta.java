package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

import modelo.EjecutaConsultas;
import vista.Marco_Aplicacion2;

public class ControladorBotonEjecuta implements ActionListener {

	public ControladorBotonEjecuta(Marco_Aplicacion2 marco) {
		
		this.marco=marco;
		
	}
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
		String seleccionSeccion=(String)marco.secciones.getSelectedItem();
		String seleccionApellido=(String)marco.paises.getSelectedItem();
		
		resultadoConsulta=obj.filtraBBDD(seleccionSeccion, seleccionApellido);
		
		try {
			
			marco.resultado.setText("");
			while(resultadoConsulta.next()) {
				marco.resultado.append(resultadoConsulta.getString(1));
				marco.resultado.append(", ");
				
				marco.resultado.append(resultadoConsulta.getString(2));
				marco.resultado.append(", ");
				
				marco.resultado.append(resultadoConsulta.getString(3));
				marco.resultado.append("\n");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	private Marco_Aplicacion2 marco;
	EjecutaConsultas obj=new EjecutaConsultas();
	private ResultSet resultadoConsulta;
}
