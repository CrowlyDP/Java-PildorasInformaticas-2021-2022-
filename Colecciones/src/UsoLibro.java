
public class UsoLibro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Libro libro1=new Libro("La Cenicienta", "Anonimo", 85);
		Libro libro2=new Libro("La Cenicienta AAAAA", "Anonimo", 85);
		//Libro libro2=new Libro("Blancanieves", "Walt Disney", 45);
		
		//libro1=libro2; //Hace que el hashcode sea el mismo ya que referencian al mismo objeto
		
		if(libro1.equals(libro2)) {
			System.out.println("Es el mismo libro");
			
			System.out.println(libro1.hashCode());
			System.out.println(libro2.hashCode());
			
		} else {
			System.out.println("No es el mismo libro");
			
			System.out.println(libro1.hashCode());
			System.out.println(libro2.hashCode());
		}
		
		
	}

}
