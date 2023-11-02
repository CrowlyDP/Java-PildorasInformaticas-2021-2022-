
public class Array_Tridimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][][] array=new int [8][5][2];
		
		for(int i=0; i<8;i++) {
			for(int j=0; j<5; j++) {
				for(int z=0; z<2;z++) {
					array[i][j][z]=(int)Math.round(Math.random()*100);
				}
			}
			
		}
		
		
		for (int i=0; i<8; i++) {
			for(int j=0; j<5; j++) {
				for(int z=0; z<2; z++) {
					System.out.println("En la posicion " + i + " de la segunda dimension " + j + " y la tercera que es " + z + " es: " + array[i][j][z] );
				}
			}
		}
		
		for(int[][] i: array) {
			for(int[] j:i) {
				for(int z:j) {
					System.out.println(z); 
				}
				
			}
			
		}
		
			
		}

	}


