import java.util.Scanner;

public class Ejer4_valorVertices {
	
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
	
	public static void valorVertices(){
		System.out.println("Esquina superior izquierda = "+matriz[0][0]);
		System.out.println("Esquina superior derecha = "+ matriz[0][matriz[0].length-1]);
		System.out.println("Equina inferior izquierda = "+matriz[matriz.length-1][0]);
		System.out.println("Esquina inferior de derecha = "+matriz[matriz.length-1][matriz[0].length-1]);
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
		valorVertices();
		

	}

}
