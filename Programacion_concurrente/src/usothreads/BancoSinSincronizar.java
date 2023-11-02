package usothreads;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BancoSinSincronizar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Banco b=new Banco();
		
		for(int i=0; i<100;i++) {
			
			EjecucionTransferencias r=new EjecucionTransferencias(b,i,2000);
		
			Thread t=new Thread(r);
			
			t.start();
		}
		
		
		

	}

}

class Banco{
	
	public Banco() {
		
		cuentas=new double[100];
		
		for(int i=0; i<cuentas.length;i++) {
			
			cuentas[i]=2000;
			
		}
		
		//saldoSuficiente=cierreBanco.newCondition();
		
	}
	
	
	//Con el synchronized solo se puede poner una condicion. Una condicion por el cierre implicto propio de la clase Object.
	
	public synchronized void transferencia(int cuentaOrigen, int cuentaDestino, double cantidad) throws InterruptedException {
		
		//cierreBanco.lock(); //Cierra para el siguiente hilo hasta que no se desbloquee
		
		//try {
		
		
		/*if(cuentas[cuentaOrigen]<cantidad) { //evalua que hay suficiente saldo en la cuentaOrigen
			
			System.out.println("------------CANTIDAD INSUFICENTE: " + cuentaOrigen + " ....SALDO: " + cuentas[cuentaOrigen] + ".....CANTIDAD: " + cantidad);
			
			return;
		else {
			
			//System.out.println("---------CANTIDAD OK--------"  + cuentaOrigen);
		}*/
			
		while(cuentas[cuentaOrigen]<cantidad) {
			
			//saldoSuficiente.await(); //Al ponerse a la espera se libera el bloqueo de cierreBanco para que entre otro hilo.
			
			wait();
			
		}
		
		System.out.println(Thread.currentThread());
		
		
		cuentas[cuentaOrigen]-=cantidad; //dinero descontado de la cuenta origen
		
		
		System.out.printf("%10.2f de %d para %d", cantidad, cuentaOrigen, cuentaDestino);
	
		cuentas[cuentaDestino]+=cantidad; //dinero añadido a la cuenta destino
		
		
		System.out.printf(" Saldo total: %10.2f%n " , getSaldoTotal());
		
		//saldoSuficiente.signalAll();
		
		notifyAll();
		
		//}finally {
		//	cierreBanco.unlock();
		//}
	
	}
	
	public double getSaldoTotal() {
		
		double sumaCuentas=0;
		
		for(double a: cuentas) {
			
			sumaCuentas+=a;
			
			
		}
		return sumaCuentas;
	}
	
	
	private final double [] cuentas;
	
	//private Lock cierreBanco=new ReentrantLock();
	
	//private Condition saldoSuficiente;
	
}


class EjecucionTransferencias implements Runnable{

	public EjecucionTransferencias(Banco b, int de, double max) {
		
		banco=b;
		deLaCuenta=de;
		maximo=max;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			
		while(true) {
			
			int paraLaCuenta=(int)(Math.random()*100);
			
			double cantidad=maximo*Math.random();
			
			banco.transferencia(deLaCuenta, paraLaCuenta, cantidad);
			
			
				Thread.sleep((int)(Math.random()*10));
			
			
			}
		}catch(InterruptedException e) {
			
		}
		
		
	}
	
	private Banco banco;
	private int deLaCuenta;
	private double maximo;
	
}
