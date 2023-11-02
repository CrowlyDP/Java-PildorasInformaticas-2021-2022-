import java.util.*;

public class SinInterfazComparatorTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Articulo2 primero=new Articulo2("Primer articulo",1);
		Articulo2 segundo=new Articulo2("Segundo articulo",200);
		Articulo2 tercero=new Articulo2("Es el tercer articulo",3);
		
		TreeSet<Articulo2> ordenaArticulos=new TreeSet<Articulo2>();
		
		ordenaArticulos.add(tercero);
		ordenaArticulos.add(primero);
		ordenaArticulos.add(segundo);
		
		for(Articulo2 e: ordenaArticulos) {
			
			System.out.println(e.getDescripcion());
		}
				
		//Articulo2 comparador=new Articulo2();
		
		//TreeSet<Articulo2> ordenaArticulos2=new TreeSet<Articulo2>(comparador);
		
		
		
		//ComparadorArticulos compara=new ComparadorArticulos();
		
		TreeSet<Articulo2> ordenaArticulos2=new TreeSet<Articulo2>(new Comparator<Articulo2>(){

			

				@Override
				public int compare(Articulo2 o1, Articulo2 o2) {
					// TODO Auto-generated method stub
					
					String desc1=o1.getDescripcion();
					String desc2=o2.getDescripcion();
					
					return desc1.compareTo(desc2);
				}
			
			
		});
		
		ordenaArticulos2.add(primero);
		ordenaArticulos2.add(segundo);
		ordenaArticulos2.add(tercero);
		
		for(Articulo2 e: ordenaArticulos2) {
			
			System.out.println(e.getDescripcion());
		}
		
		
	}
	
	
	

}

class Articulo2 implements Comparable<Articulo2>{
	
	
	public Articulo2(String desc, int num) {
		numero=num;
		descripcion=desc;
		
		
	}
	
	public String getDescripcion() {
		return descripcion;
	}

	
	@Override
	public int compareTo(Articulo2 e) {
		// TODO Auto-generated method stub
		return numero - e.numero;
	}
	
	
	
	private int numero;
	private String descripcion;
	
}

/*class ComparadorArticulos implements Comparator<Articulo2>{

	@Override
	public int compare(Articulo2 o1, Articulo2 o2) {
		// TODO Auto-generated method stub
		
		String desc1=o1.getDescripcion();
		String desc2=o2.getDescripcion();
		
		return desc1.compareTo(desc2);
	}
	
}*/
