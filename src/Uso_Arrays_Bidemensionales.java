
public class Uso_Arrays_Bidemensionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][] matrix= {
						 {15,24,36,21,28},
						 {5,25,37,41,15},
						 {7,19,32,14,90},
						 {85,2,7,40,27}
		};
		
		for (int[]fila:matrix) {
			System.out.println();
			for(int z:fila) {
				System.out.print(z + " ");
			}
		}
		/*
		matrix[0][0]=15;
		matrix[0][1]=24;
		matrix[0][2]=36;
		matrix[0][3]=21;
		matrix[0][4]=28;
		
		matrix[1][0]=9;
		matrix[1][1]=19;
		matrix[1][2]=81;
		matrix[1][3]=94;
		matrix[1][4]=56;
		
		matrix[2][0]=33;
		matrix[2][1]=36;
		matrix[2][2]=41;
		matrix[2][3]=43;
		matrix[2][4]=40;
		
		matrix[3][0]=25;
		matrix[3][1]=22;
		matrix[3][2]=88;
		matrix[3][3]=12;
		matrix[3][4]=0;
		*/
		//System.out.println("valor almacenado en: " + matrix[2][3]);
		
		/*
		for(int i=0;i<4; i++) {
		 
			System.out.println();
			for (int j=0; j<5;j++) {
				System.out.print(matrix[i][j] + " ");
			}
		}
		*/

	
	}

}
