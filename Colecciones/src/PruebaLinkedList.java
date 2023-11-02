import java.util.*;

public class PruebaLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList <String> personas=new LinkedList<String>();
		
		personas.add("Pepe");
		personas.add("Juan Carlos");
		personas.add("Mari Carmen");
		personas.add("Adolfo");

		System.out.println(personas.size());
		
		personas.add("Juan");
		
		ListIterator <String> it=personas.listIterator();
		
		it.next();
		
		it.add("Segundo");
		
		for(String e: personas) {
			System.out.println(e);
		}
	}

}
