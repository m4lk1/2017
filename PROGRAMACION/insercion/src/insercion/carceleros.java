package insercion;

public class carceleros {
	static int[] carceleros = new int[50];
	static boolean[] celdas = new boolean[50];
	
		public static boolean multiplo(int carcelero, int celda){
			boolean esta=false;
			esta=((celda+1)%(carcelero+1)==0)?true:false;
			return esta;
		}
	
		public static void CACeldas(){
			String estado;
			for(int i=0; i<carceleros.length; i++){
				System.out.println("El carcelero "+(i+1)+" pasa por la celda ");
				for(int j=0; j<celdas.length; j++){
					if(multiplo(i, j)){
						celdas[j]=(celdas[j])?false:true;
						estado=(celdas[j])?"cierra":"abre";
						System.out.println((j+1)+" y la "+estado);
					}
				}
				System.out.println();
			}
		}

	public static void main(String[] args) {
		CACeldas();

	}

}
