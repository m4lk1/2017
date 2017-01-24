import matematicas.matematicas;
public class Ejer8_Irregulares1 {
	static int[][] matriz=new int[5][];
	
		public static void generaMatriz(){
			for(int f=0 ; f<matriz.length; f++){
				matriz[f] = new int[f+1];
			}
		}
		
		public static void cargarMatriz(){
			for(int f=0; f<matriz.length; f++){
				for(int c=0; c<matriz[f].length; c++){
					matriz[f][c]=(c+1);
				}
			}
		}
		
		public static void verMatriz(){
			for(int f=0; f<matriz.length; f++){
				for(int c=0; c<matriz[f].length; c++){
					System.out.print(matriz[f][c]);
				}
				System.out.println();
			}
		}
	
	public static void main(String[] args) {
			generaMatriz();
			cargarMatriz();
			verMatriz();

	}

}
