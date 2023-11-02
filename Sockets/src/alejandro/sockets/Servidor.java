package alejandro.sockets;

import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.net.*;
import java.util.ArrayList;

public class Servidor  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoServidor mimarco=new MarcoServidor();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
	}	
}

class MarcoServidor extends JFrame implements Runnable{
	
	public MarcoServidor(){
		
		setBounds(1200,300,280,350);				
			
		JPanel milamina= new JPanel();
		
		milamina.setLayout(new BorderLayout());
		
		areatexto=new JTextArea();
		
		milamina.add(areatexto,BorderLayout.CENTER);
		
		add(milamina);
		
		setVisible(true);
		
		Thread mihilo=new Thread(this);
		
		mihilo.start();
		
		}
	
	private	JTextArea areatexto;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		try {
			
			ServerSocket servidor=new ServerSocket(9999);
			
			String nick, ip, mensaje;
			PaqueteEnvio paqueteRecibido;
			
			ArrayList <String> listaIp=new ArrayList<String>();
			
			
			while(true) {
				
			
			Socket misocket=servidor.accept();
			
			
			ObjectInputStream paqueteDatos=new ObjectInputStream(misocket.getInputStream());
			
			paqueteRecibido=(PaqueteEnvio) paqueteDatos.readObject();
			
			nick=paqueteRecibido.getNick();
			ip=paqueteRecibido.getIp();
			mensaje=paqueteRecibido.getMensaje();
			
		
			/*DataInputStream flujoEntrada=new DataInputStream(misocket.getInputStream());
			
			String mensajeTexto=flujoEntrada.readUTF();
			
			areatexto.append("\n " + mensajeTexto);*/
			
			if(!mensaje.equals("Online")) {
				
			
			areatexto.append("\n" + nick + ": " + mensaje + " para " + ip);
			
			Socket enviaDestinatario=new Socket(ip,9090);
			
			ObjectOutputStream paqueteReenvio=new ObjectOutputStream(enviaDestinatario.getOutputStream());
			
			paqueteReenvio.writeObject(paqueteRecibido);
			
			paqueteReenvio.close();
			
			enviaDestinatario.close();
			
			misocket.close(); }else {
				
			//--------------------DETECTA ONLINE-------------------------------
				
					InetAddress localizacion=misocket.getInetAddress();
					
					String ipRemota=localizacion.getHostAddress();
					
					listaIp.add(ipRemota);
					
					paqueteRecibido.setListaIp(listaIp);
					
					for(String z: listaIp) {
						
						Socket enviaDestinatario=new Socket(z,9090);
						
						ObjectOutputStream paqueteReenvio=new ObjectOutputStream(enviaDestinatario.getOutputStream());
						
						paqueteReenvio.writeObject(paqueteRecibido);
						
						paqueteReenvio.close();
						
						enviaDestinatario.close();
						
						misocket.close();
					}
					
					
			
			//------------------------------------------------------------------
				
					}
			
				}
			
			} catch (IOException | ClassNotFoundException  e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
 }


