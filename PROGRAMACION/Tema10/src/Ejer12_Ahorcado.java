import java.util.Scanner;
public class Ejer12_Ahorcado {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner teclado=new Scanner(System.in);
		String palabraSecreta="";
		String palabraUsuario="";
		String intento="";
		int fallos=1;
		int contador=0;
		boolean fin=false;
		
		System.out.println("Introduce la palabra secreta");
		palabraSecreta=teclado.nextLine();
		
		System.out.println("Ten cuidado de no acabar ahorcado");
		System.out.println();
		System.out.println("_________ ");
		System.out.println("| | ");
		System.out.println("| 0 ");
		System.out.println("|/|\\ ");
		System.out.println("|/ \\");
		System.out.println("| ");
		System.out.println("| ");
		System.out.println();
		
		System.out.println("Comienza el juego, tienes 6 intentos");
		
		for(int i=0; i<palabraSecreta.length(); i++){
			palabraUsuario=palabraUsuario+"_";
		}
		System.out.println();
		System.out.println();
		System.out.println(palabraUsuario);
		
		
		while(!fin){
			System.out.println("Introduce un caracter");
			intento=teclado.nextLine();
			while(intento.length()>1 || intento.length()<1){
				System.out.println("Error, eso no es un caracter");
				System.out.println("Introduce un caracter");
				intento=teclado.nextLine();
			}
			
				if(intento.charAt(0)==palabraSecreta.charAt(contador)){
					palabraUsuario=palabraUsuario.replaceFirst("_", palabraSecreta.substring(contador, (contador+1)));
					contador++;
					System.out.println("Has acertado el "+contador+"º caracter");
					System.out.println(palabraUsuario);
						if(palabraSecreta.compareToIgnoreCase(palabraUsuario)==0){
							System.out.println("Felicidades has ganado!");
							fin=true;
						}
				}else{
				System.out.println("Error");
				
				switch(fallos){
				case 1:
					System.out.println(" O ");
					System.out.println(palabraUsuario);
					break; 
				
				case 2:
					System.out.println(" O ");
					System.out.println(" | "); 
					System.out.println(palabraUsuario);
					break;
					
				case 3: 
					System.out.println("_O");
					System.out.println(" | ");
					System.out.println(palabraUsuario);
					break; 
				
				case 4:
					System.out.println("_O_");
					System.out.println(" | "); 
					System.out.println(palabraUsuario);
					break;
					
				case 5: 
					System.out.println("_O_"); 
					System.out.println(" | "); 
					System.out.println("/ ");
					System.out.println(palabraUsuario);
					break; 
				
				case 6:
				System.out.println("_O_"); 
				System.out.println(" | "); 
				System.out.println("/ \\");
				System.out.println();
				System.out.println("Has perdido");
				fin=true;
				break; 
				}
				
				fallos++;
			}
		   
			
		}
	}

}
