import java.util.Scanner;

public class principal {
	
	public static void main(String[] args) {
		int repetir=0;
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Indique el nombre del primer jugador");
		String jugador1=teclado.nextLine();
		System.out.println("Indique el nombre del segundo jugador");
		String jugador2=teclado.nextLine();
		
		jugador jugadoruno = new jugador(jugador1);
		
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("------------------------- TURNO DEL JUGADOR UNO --------------------------");
		System.out.println("--------------------------------------------------------------------------");
		
		do{
			jugadoruno.jugada();
			if(jugadoruno.pasado()){
				System.out.println("Se ha pasado de Siete y medio");
			}else{
				System.out.println("¿Quiere otra carta? 1 para si 2 para no");
				repetir=teclado.nextInt();
				while(repetir != 1 && repetir !=2){
					System.out.println("No ha introducido un numero correcto vuelva a intentarlo");
					repetir=teclado.nextInt();
				}
		 }
		}while(!jugadoruno.pasado() && repetir != 2);
		
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("------------------------- TURNO DEL JUGADOR DOS --------------------------");
		System.out.println("--------------------------------------------------------------------------");
		
		jugador jugadordos = new jugador(jugador2);
		
		repetir=0;
		
		do{
			jugadordos.jugada();
			if(jugadordos.pasado()){
				System.out.println("Se ha pasado de Siete y medio");
				
			}else{
				System.out.println("¿Quiere otra carta? 1 para si 2 para no");
				repetir=teclado.nextInt();
				while(repetir != 1 && repetir !=2){
					System.out.println("No ha introducido un numero correcto vuelva a intentarlo");
					repetir=teclado.nextInt();
				}
		 }
		}while(!jugadordos.pasado() && repetir != 2);
		
		if((jugadoruno.getPuntuacion() > jugadordos.getPuntuacion() && !jugadoruno.pasado()) || (!jugadoruno.pasado() && jugadordos.pasado())){
			System.out.println("Ha ganado el jugador 1");
			jugadoruno.toString();
			jugadordos.toString();
		}
		
		if((jugadordos.getPuntuacion() > jugadoruno.getPuntuacion() && !jugadordos.pasado()) || (!jugadordos.pasado() && jugadoruno.pasado())){
			System.out.println("Ha ganado el jugador 2");
			jugadoruno.toString();
			jugadordos.toString();
		}
		
		if((jugadordos.pasado() && jugadoruno.pasado()) || jugadoruno.getPuntuacion() == jugadordos.getPuntuacion()){
			System.out.println("Han quedado en tablas");
			jugadoruno.toString();
			jugadordos.toString();
		}
	}

}
