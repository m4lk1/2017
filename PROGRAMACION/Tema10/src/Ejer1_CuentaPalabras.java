//1.-Contar cuántas palabras tiene una frase introducida por teclado.

import java.util.Scanner;
public class Ejer1_CuentaPalabras {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner teclado=new Scanner(System.in);
		
		String fraseDelUsuario = "";
		int contadorPalabras = 1;
		String condicionComparada=" ";
		
		System.out.println("Introduce una frase y contaré sus palabras");
		fraseDelUsuario=teclado.nextLine();	
		while(fraseDelUsuario.length()==0){
			System.out.println("Error frase vacia, Introduce una frase y contaré sus palabras");
			fraseDelUsuario=teclado.nextLine();	
		}
		fraseDelUsuario=fraseDelUsuario.trim();
		

		
		for(int i=0; i<fraseDelUsuario.length()-1; i++){
			if(fraseDelUsuario.substring(i, i+1).compareToIgnoreCase(condicionComparada)==0){
				contadorPalabras++;
			}
		}
		System.out.println(contadorPalabras);
		

	}

}
