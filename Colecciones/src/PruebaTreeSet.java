import java.util.*;

public class PruebaTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*TreeSet<String> ordenaPersonas=new TreeSet<String>();
		
		ordenaPersonas.add("Pepe");
		ordenaPersonas.add("Mari Carmen");
		ordenaPersonas.add("Susana");
		
		for(String e: ordenaPersonas) {
			
			System.out.println(e);
		}*/
		
		Articulo primero=new Articulo("Primer articulo",1);
		Articulo segundo=new Articulo("Segundo articulo",200);
		Articulo tercero=new Articulo("Es el tercer articulo",3);
		
		TreeSet<Articulo> ordenaArticulos=new TreeSet<Articulo>();
		
		ordenaArticulos.add(tercero);
		ordenaArticulos.add(primero);
		ordenaArticulos.add(segundo);
		
		for(Articulo e: ordenaArticulos) {
			
			System.out.println(e.getDescripcion());
		}
		
		//TreeSet ordenado segun el comparador ------------ (Metodo compare --> Interfaz Comparator)
		
		Articulo comparador=new Articulo();
		
		TreeSet<Articulo> ordenaArticulos2=new TreeSet<Articulo>(comparador);
		
		ordenaArticulos2.add(primero);
		ordenaArticulos2.add(segundo);
		ordenaArticulos2.add(tercero);
		
		for(Articulo e: ordenaArticulos2) {
			
			System.out.println(e.getDescripcion());
		}
		
		
	}
	
	
	

}

class Articulo implements Comparable<Articulo>, Comparator<Articulo>{
	
	public Articulo(){};
	
	public Articulo(String desc, int num) {
		numero=num;
		descripcion=desc;
		
		
	}
	
	public String getDescripcion() {
		return descripcion;
	}

	
	@Override
	public int compareTo(Articulo e) {
		// TODO Auto-generated method stub
		return numero - e.numero;
	}
	
	
	
	
	@Override
	public int compare(Articulo e, Articulo z) {
		// TODO Auto-generated method stub

		String descripcionA=e.getDescripcion();
		String descripcionB=z.getDescripcion();
		
		return descripcionA.compareTo(descripcionB);
		
	}
	
	private int numero;
	private String descripcion;
	
}
