import java.util.Scanner;
public class Ejer2_Asteriscos {
	
		private static void pintaAsteriscos(int nAsteriscos){
			for(int i=0; i<nAsteriscos; i++){
				System.out.print("*");
			}
		}

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner teclado=new Scanner(System.in);
		int asteriscos=0;
		
		System.out.println("Indique el numero de asteriscos que quieres dibujar");
		asteriscos=teclado.nextInt();
		pintaAsteriscos(asteriscos);
	}

}
