import javax.swing.*;
public class Uso_Arrays2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] paises=new String[8];
		/*
		paises[0]="España";
		paises[1]="Mexico";
		paises[2]="Colombia";
		paises[3]="Peru";
		paises[4]="Chile";
		paises[5]="Argentina";
		paises[6]="Ecuador";
		paises[7]="Corea del Norte";
		
		for (int i=0;i<paises.length; i++) {
			
			System.out.println("Pais " + (i+1) + " " +paises[i]);
		}
		*/
		
		//String[] paises= {"España", "Mexico", "Ecuador"};
		
		for (int i=0; i<8; i++) {
			paises[i]=JOptionPane.showInputDialog("Introduce pais " + (i+1));
		}
		
		for(String i:paises) {
			
			System.out.println("Pais " + i);
		}
		
		
		int [] matriz_random=new int [150];
		
		for (int i=0; i<matriz_random.length;i++) {
			matriz_random[i]=(int)Math.round(Math.random()*100);
		}
		
		for (int i:matriz_random) {
			System.out.print(i + " ");
		}
	}

}
