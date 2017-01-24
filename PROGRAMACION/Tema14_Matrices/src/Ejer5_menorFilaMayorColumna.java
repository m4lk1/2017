import java.util.Scanner;

public class Ejer5_menorFilaMayorColumna {
	static int matriz[][];
	static int fila=0, columna=0;
	static Scanner teclado=new Scanner(System.in);
	
	public static void determinaMatriz(){
		System.out.println("Indica la cantidad de filas");
		fila=teclado.nextInt();
		System.out.println("Indica la cantidad de columnas");
		columna=teclado.nextInt();
		
		matriz=new int[fila][columna];
	}
	
	public static void cargaMatriz(){
		determinaMatriz();
		for(int i=0; i<matriz.length; i++){
			for(int k=0; k<matriz[0].length; k++){
				matriz[i][k]=(int)(Math.random()*30+20);
			}
		}
		ver();
	}
	
	public static void menorFila(){
		for(int f=0; f<matriz.length; f++){
			int menor=matriz[f][0];
			for(int c=0; c<matriz[0].length; c++){
				if(matriz[f][c]<menor){
					menor=matriz[f][c];
				}
			}
			System.out.println("El menor de la fila "+(f+1)+" es "+menor);
		}
	}
	
	public static void mayorColumna(){
		for(int c=0; c<matriz[0].length; c++){
			int mayor=matriz[c][0];
			for(int f=0; f<matriz.length; f++){
				if(matriz[f][c]>mayor){
					mayor=matriz[f][c];
				}
			}
			System.out.println("El mayor de la fila "+(c+1)+" es "+mayor);
		}
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
		menorFila();
		mayorColumna();

	}

}
