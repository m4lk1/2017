
public class Ejer2_cargaXColumnas {
	static int matriz[][] = new int[2][5];
	
	public static void cargaColumnas(){
		for(int c=0; c<matriz[0].length; c++){
			for(int f=0; f<matriz.length; f++){
				matriz[f][c] = c;
			}
		}
		ver();
	}
	
	public static void ver(){
		for(int i=0; i<matriz.length; i++){
			for(int k=0; k<matriz[0].length; k++){
				System.out.print(matriz[i][k]);
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		cargaColumnas();

	}

}
