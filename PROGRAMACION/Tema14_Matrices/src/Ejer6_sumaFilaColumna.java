import java.util.Scanner;

public class Ejer6_sumaFilaColumna {
	static int matriz[][];
	static int fila=0, columna=0;
	static int filas[];
	static int columnas[];
	
	static Scanner teclado=new Scanner(System.in);
	
	public static void determinaMatriz(){
		System.out.println("Indica la cantidad de filas");
		fila=teclado.nextInt();
		filas=new int[fila];
		System.out.println("Indica la cantidad de columnas");
		columna=teclado.nextInt();
		columnas=new int[columna];
		
		matriz=new int[fila][columna];
	}
	
	public static void cargaMatriz(){
		determinaMatriz();
		for(int i=0; i<matriz.length; i++){
			for(int k=0; k<matriz[0].length; k++){
				matriz[i][k]=(int)(Math.random()*38+2);
			}
		}
		ver();
		System.out.println();
	}
	
	public static void sumaFila(){
		for(int f=0; f<matriz.length; f++){
			int sumaFila=0;
			for(int c=0; c<matriz[0].length; c++){
				sumaFila += matriz[f][c];
				}
			filas[f]=sumaFila;
			}
		System.out.println();
		
	}
	
	public static void sumaColumna(){
		for(int c=0; c<matriz[0].length; c++){
			int sumaColumna=0;
			for(int f=0; f<matriz.length; f++){
				sumaColumna += matriz[f][c];
				}
			columnas[c]=sumaColumna;
			}
			
	}
	
	public static void verFilas(){
		for(int i=0; i<filas.length; i++){
			System.out.println("La suma de las columnas de la fila "+(i+1)+" es "+filas[i]);
		}
		System.out.println("");
	}
	
	public static void verColumnas(){
		for(int i=0; i<columnas.length; i++){
			System.out.println("La suma de las filas de la columna "+(i+1)+" es "+columnas[i]);
		}
		System.out.println("");
	}
	
	public static void ver(){
		for(int i=0; i<matriz.length; i++){
			for(int k=0; k<matriz[0].length; k++){
				System.out.print(matriz[i][k]+"   ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		cargaMatriz();
		sumaFila();
		sumaColumna();
		verColumnas();
		verFilas();

	}

}
