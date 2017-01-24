import java.util.Scanner;

public class Ejer3_IntercambiaFilas {
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
				matriz[i][k]=(int)(Math.random()*10);
			}
		}
		ver();
	}
	
	public static void intercambiarFila(int fila1, int fila2){
		int aux=0;
		for(int f=0; f<matriz[fila1].length; f++){
			aux=matriz[fila1][f];
			matriz[fila1][f]=matriz[fila2][f];
			matriz[fila2][f]=aux;
		}
		ver();
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
		
		int fila1=0, fila2=0;
		System.out.println("Indica la fila que quieres intercambiar");
		fila1=teclado.nextInt();
		System.out.println("Indica la fila por la que la quieres intercambiar");
		fila2=teclado.nextInt();
		intercambiarFila(fila1, fila2);
	}

}
