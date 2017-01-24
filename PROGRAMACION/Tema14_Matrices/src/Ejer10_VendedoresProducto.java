
public class Ejer10_VendedoresProducto {
	static final int producto1=6;
	static final int producto2=9;
	static final int producto3=15;
	static int[][] matrizProdVend = new int[10][3];
	
	public static void cargarMatriz(){
		for(int f=0; f<matrizProdVend.length; f++){
			for(int c=0; c<matrizProdVend[f].length; c++){
				matrizProdVend[f][c]=(int)(Math.random()*10);
			}
		}
	}
	public static void visualizarMatriz(){
		for(int f=0; f<matrizProdVend.length; f++){
			for(int c=0; c<matrizProdVend[f].length; c++){
				System.out.print(matrizProdVend[f][c]+"   ");
			}
			System.out.println();
		}
	}
	public static void ganadoXVendedor(){}
	public static void totalXProducto(){}
	public static void productoMasVendido(){}
	public static void totalVentasVendedorX(){}
	
	public static void main(String[] args) {
		cargarMatriz();
		visualizarMatriz();

	}

}
