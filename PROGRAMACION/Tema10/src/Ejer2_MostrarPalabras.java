//Visualizar cada una de las palabras de una frase.

import java.util.Scanner;
public class Ejer2_MostrarPalabras {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner teclado=new Scanner(System.in);
		
		String fraseDelUsuario="";
		char espacio=' ';
		int auxiliar=0;
		
		System.out.println("Introduce una frase y mostraré sus palabras");
		fraseDelUsuario=teclado.nextLine();	
		while(fraseDelUsuario.length()==0){
			System.out.println("Error frase vacia, Introduce una frase y mostraré sus palabras");
			fraseDelUsuario=teclado.nextLine();	
		}
		fraseDelUsuario=fraseDelUsuario.trim();

		for(int i=0; i<fraseDelUsuario.length(); i++){
			if(fraseDelUsuario.charAt(i)==espacio){
			System.out.println(fraseDelUsuario.substring(auxiliar, (i)));
			auxiliar=i+1;
			}
		}
		
		System.out.println(fraseDelUsuario.substring(auxiliar));
	}

}
