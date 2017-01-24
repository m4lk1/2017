//3.-Programa que a partir de una palabra introducida por teclado, visualice esa palabra 
//con una rotación a la derecha de un carácter, hasta visualizar de nuevo la palabra 
//original.

import java.util.Scanner;
public class Ejer3_RotaPalabras {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner teclado=new Scanner(System.in);
		String auxiliarLetra="";
		String palabra="";

		System.out.println("Introduzca una palabra y la rotaré");
		palabra=teclado.nextLine();
		
		for(int i=0; i<palabra.length(); i++){
			auxiliarLetra=palabra.substring((palabra.length()-1), palabra.length());
			palabra=auxiliarLetra+palabra.substring(0, (palabra.length()-1));
			
			System.out.println(palabra);
		}

	}

}
