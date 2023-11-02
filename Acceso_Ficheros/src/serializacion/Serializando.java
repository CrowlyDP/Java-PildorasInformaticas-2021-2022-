package serializacion;

import java.util.Date;
import java.util.GregorianCalendar;
import java.io.*;

public class Serializando {

	 public static void main(String[] args) {
	  // TODO Auto-generated method stub
	  Administrador jefe = new Administrador("Juan", 800, 2017, 03, 8);
	  
	  jefe.setIncentivo(5000);
	  
	  Empleado[] personal = new Empleado[3];
	  
	  personal[0] = jefe;
	  personal[1] = new Empleado("Ana", 25000,2008,10,1);
	  personal[2] = new Empleado("Luis", 18000,2012,9,15);
	  
	  try {
		  
		  ObjectOutputStream escribiendoFichero=new ObjectOutputStream(new FileOutputStream("C:/Users/Alejandro/Desktop/empleado.txt"));
		 
		  escribiendoFichero.writeObject(personal);
		  
		  escribiendoFichero.close();
		  
		  //------------------
		  
		  ObjectInputStream recuperandoFichero=new ObjectInputStream(new FileInputStream("C:/Users/Alejandro/Desktop/empleado.txt"));
		  
		  Empleado[] personalRecuperado=(Empleado[])recuperandoFichero.readObject();
		  
		  recuperandoFichero.close();
		  
		  //------------------
		  
		  for(Empleado e: personalRecuperado) {
			  
			  System.out.println(e);
		  }
	  
	  }catch(Exception e) {
		  
	  }
	  
	 }

}

//---------------------------------------------------------------------------

class Empleado implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8804282141108207197L;
	
	public Empleado(String n, double s, int agno, int mes, int dia){
		 
	  nombre = n;
	  sueldo = s;
	  
	  GregorianCalendar calendario = new GregorianCalendar(agno, mes-1, dia);
	  fechaContrato = calendario.getTime();
	  
	 }
	 
	 public String getNombre() {
	  return nombre;
	  
	 }
	 
	 public void setNombre(String nombre) {
	  this.nombre = nombre;
	  
	 }
	 
	 public double getSueldo() {
	  return sueldo;
	  
	 }
	 
	 public void setSueldo(double sueldo) {
	  this.sueldo = sueldo;
	  
	 }
	 
	 public Date getFechaContrato() {
	  return fechaContrato;
	  
	 }
	 
	 public void setFechaContrato(Date fechaContrato) {
	  this.fechaContrato = fechaContrato;
	 }
	 
	 public void SubirSueldo(double porcentaje){
	  double aumento = sueldo*porcentaje/100;
	  sueldo+=aumento;
	  
	 }
	 
	 public String toString(){
	  return "Nombre = " + nombre + " , sueldo = " + sueldo + " , fecha de contrato: " + fechaContrato;
	 }
	 
	 private String nombre;
	 private double sueldo;
	 private Date fechaContrato;
 
}

class Administrador extends Empleado{
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1881056236380136510L;
	

	public Administrador(String n, double s, int agno, int mes, int dia){
	  
		 super(n,s,agno,mes,dia);
		 incentivo = 0;
	  
	 }
	 
	 public double getSueldo() {
		 
	  double sueldoBase = super.getSueldo();
	  return sueldoBase+incentivo;
	  
	 }
	 
	 public void setIncentivo(double incentivo) {
	  this.incentivo = incentivo;
	  
	 }
 
	 public String toString(){
	  return super.toString()+ " Incentivo = " + incentivo;
	  
	 }
 
	 private double incentivo;

 
}