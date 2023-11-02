package alejandro.sockets;

import java.awt.event.*;
import java.io.*;

import javax.swing.*;
import java.net.*;
import java.util.ArrayList;


public class Cliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoCliente mimarco=new MarcoCliente();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}


class MarcoCliente extends JFrame{
	
	public MarcoCliente(){
		
		setBounds(600,300,280,350);
				
		LaminaMarcoCliente milamina=new LaminaMarcoCliente();
		
		add(milamina);
		
		setVisible(true);
		
		addWindowListener(new EnvioOnline());
		
		}	
	
}


//-----------------------ENVIO SEÑAL ONLINE--------------------------------

class EnvioOnline extends WindowAdapter{
	
	public void windowOpened(WindowEvent e) {
		
		try {
			
			Socket misocket=new Socket("192.168.1.3",9999);
			
			PaqueteEnvio datos=new PaqueteEnvio();
			
			datos.setMensaje("Online"); 
			
			ObjectOutputStream paqueteDatos=new ObjectOutputStream(misocket.getOutputStream());
			
			paqueteDatos.writeObject(datos);
			
			misocket.close();
			
		}catch(Exception x) {}
		
	}
	
}

class LaminaMarcoCliente extends JPanel implements Runnable{
	
	public LaminaMarcoCliente(){
		
		String nickUsuario=JOptionPane.showInputDialog("Nick: ");
		
		JLabel nNick=new JLabel("Nick: ");
		add(nNick);
		
		nick=new JLabel(nickUsuario);
		add(nick);
	
		JLabel texto=new JLabel("Online:");
		
		add(texto);
		
		ip=new JComboBox();
		
		add(ip);
		
		campochat=new JTextArea(12,20);
		
		add(campochat);
	
		campo1=new JTextField(20);
	
		add(campo1);		
	
		miboton=new JButton("Enviar");
		
		
		
		miboton.addActionListener(new EnviaTexto());
		
		add(miboton);	
		
		Thread mihilo=new Thread(this);
		
		mihilo.start();
		
	}
	
	private class EnviaTexto implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			
			campochat.append("\n" + campo1.getText());
			
			try {
				
				Socket misocket=new Socket("192.168.1.3",9999);
				
				PaqueteEnvio datos=new PaqueteEnvio();
				
				datos.setNick(nick.getText());
				
				datos.setIp(ip.getSelectedItem().toString());
				
				datos.setMensaje(campo1.getText());
				
				/*DataOutputStream flujoSalida=new DataOutputStream(misocket.getOutputStream());
				
				flujoSalida.writeUTF(campo1.getText());
				
				flujoSalida.close();*/
				
				ObjectOutputStream paqueteDatos=new ObjectOutputStream(misocket.getOutputStream());
				
				paqueteDatos.writeObject(datos);
				
				misocket.close();
				
				
			} catch (UnknownHostException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
			
		}
		
		
	}	
		


	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			
			ServerSocket servidorCliente=new ServerSocket(9090);
			
			Socket cliente;
			
			PaqueteEnvio paqueteRecibido;
			
			while(true) {
				
				cliente=servidorCliente.accept();
				
				ObjectInputStream flujoEntrada=new ObjectInputStream(cliente.getInputStream());
				
				paqueteRecibido=(PaqueteEnvio) flujoEntrada.readObject();
				
				if(!paqueteRecibido.getMensaje().equals("Online:")) {
					
					campochat.append("\n" + paqueteRecibido.getNick() + ": " + paqueteRecibido.getMensaje());

				}else {
					
					//Añade el contenido del arraylist al ComboBox
					
					ArrayList <String> IpsMenu=new ArrayList<String>();
					
					IpsMenu=paqueteRecibido.getListaIp();
					
					ip.removeAllItems(); //Borra cada vez que se vuelque el ArrayList en el ComboBox
					
					for(String e: IpsMenu) {
						
						ip.addItem(e);
					}
					
					
					
				}
			
			}
			
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	private JTextField campo1;
	
	private JComboBox ip;
	
	private JLabel nick;
	
	private JTextArea campochat;
	
	private JButton miboton;
	
}

class PaqueteEnvio implements Serializable{
	
	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getIp() {
		return ip;
	}
	
	
	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public ArrayList<String> getListaIp() {
		return listaIp;
	}

	public void setListaIp(ArrayList<String> listaIp) {
		this.listaIp = listaIp;
	}
	
	private String nick, ip, mensaje;
	private ArrayList <String> listaIp;
}