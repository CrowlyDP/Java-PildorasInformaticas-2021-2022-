package clases_propias;

import java.util.GregorianCalendar;

public class MetodosGenericos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nombres[]= {"Jose", "Maria", "Pepe"};
		
		System.out.println(MisMatrices.getMenor(nombres));
		
		//---------------------------------------------------------------
		
		GregorianCalendar fechas[]= {new GregorianCalendar(2015,07,12),
				new GregorianCalendar(2015,07,12),
				new GregorianCalendar(2015,07,12),
				new GregorianCalendar(2015,07,12)
		};
		
		System.out.println(MisMatrices.getMenor(fechas));
		
		}
		
	

}

class MisMatrices{
	
	public static <T extends Comparable> T getMenor(T []array) {
		
		if(array==null || array.length==0) {
			
			return null;
		}
		
		T elementoMenor=array[0];
		
		for(int i=1; i<array.length;i++) {
			
			if(elementoMenor.compareTo(array[i])>0) {
				
				elementoMenor=array[i];
			}
		}
		return elementoMenor;
	
	}
	
}
