import java.util.*;

public class CuentasUsuarios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cliente cl1=new Cliente("Antonio Banderas", "00001", 200000);
		Cliente cl1bis=new Cliente("Antonio Banderas", "00001", 200000);
		Cliente cl2=new Cliente("Penelope Cruz", "00002", 250000);
		Cliente cl3=new Cliente("Andres Iniesta", "00003", 800000);
		Cliente cl4=new Cliente("Quentin Tarantino", "00004", 900000);
		
		Set <Cliente> clientesBanco=new HashSet<Cliente>();
		
		clientesBanco.add(cl1);
		clientesBanco.add(cl1bis);
		clientesBanco.add(cl2);
		clientesBanco.add(cl3);
		clientesBanco.add(cl4);

		
		
		/*for(Cliente e: clientesBanco) {
			
		if(e.getNombre().equals("Penelope Cruz")) {
			clientesBanco.remove(e);
		}
		
		}*/
		
		Iterator<Cliente> it=clientesBanco.iterator();
		
		while(it.hasNext()){
			
			if(it.next().getNombre().equals("Penelope Cruz")) {
				
				it.remove();
			}
		}
		
		for(Cliente e: clientesBanco) {
			
			System.out.println(e.getNombre() + " " + e.getN_cuenta() + " " + e.getSaldo());

		}
		
		
		
		/*Iterator <Cliente> it=clientesBanco.iterator();
		
		while(it.hasNext()) {
			
			Cliente c=it.next();
			
			//String nombreCliente=it.next().getNombre();
			
			System.out.println(c.getNombre() + " " + c.getSaldo() + " " + c.getN_cuenta());
			
			//System.out.println(nombreCliente);
		}*/
		
		
	}

}
