
public class Ejer1_MatrizDiagonal {
	static String matriz[][] = new String[4][4];

		public static void cargaMatriz(){
			for(int i=0; i<matriz.length; i++){
				for(int k=0; k<matriz[0].length; k++){
					matriz[i][k]="- ";
				}
			}
		}
		
		public static void ver(){
			for(int i=0; i<matriz.length; i++){
				for(int k=0; k<matriz[0].length; k++){
					System.out.print(matriz[i][k]);
				}
				System.out.println();
			}
		}
		
		public static void diagonal(){
			int aux=0;
			for(int i=0; i<matriz.length; i++){
				for(int k=0; k<matriz[0].length; k++){
					if(k==aux){
						matriz[i][k]="X ";
					}
				}
				aux++;
			}
			ver();
		}
	public static void main(String[] args) {
		cargaMatriz();
		diagonal();

	}

}
