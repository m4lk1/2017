//15.- Imagina que has empezado una colección de 100 cromos, como es el primer día, 
//has comprado el álbum y 5 sobres, cada sobre trae 3 cromos, realiza un programa que permita mantener 
//la información de los cromos que tienes en todo momento, los del día de hoy y los que compres en el futuro. 
//el programa debe contemplar las siguientes opciones (se plantearan una vez creada la lista con los datos 
//de la primera compra):
//a. entrada de un cromo nuevo .
//b. consulta de un cromo (esta (cuantas veces) o no está).
//c. lista de cromos repetidos.
//d. lista de cromos pendientes.
//e. posibilidad de cambiar cromos.
//f. salir
//nota: si en algún momento se completara la colección, se indicará un mensaje en pantalla. (controlar en la opción a).
import java.util.Scanner;

public class Ejer_Cromos {
	
	static Scanner teclado=new Scanner(System.in);
	static boolean fin=false;
	
	static int[] album = new int[100];
	
	public static void sobreNuevo(int cantSobre){
		for(int i=0; i<cantSobre*3; i++){
			int random=(int)(Math.random()*100);
			album[random]++;
		}
	}
	
	public static boolean albumLleno(){
		int aux=0; boolean lleno=false;
		for(int i=0; i<album.length; i++){
			aux=(album[i]>0)?aux=aux+1:aux;
		}
		lleno=(aux>=99)?true:false;
		return lleno;
	}
	
	public static void consultaCromo(int cromoConsultado){
		int cromo = (cromoConsultado) - 1;
		String resultado="";
		
		resultado=(album[cromo]==0)?"El cromo no está":"Está "+album[cromo]+" vez/veces";
		System.out.println(resultado);
	}
	public static void listarRepetidos(){
		for(int i=0; i<album.length; i++){
			if(album[i]>1){
				System.out.println("Cromo "+(i+1)+" repetido "+(album[i]-1)+" vez/veces");
			}
		}
	}
	public static void listarPendientes(){
		for(int i=0; i<album.length; i++){
			if(album[i]<1){
				System.out.println("No tienes el cromo "+(i+1));
			}
		}
	}
	public static void cambiarCromos(int cromoACambiar, int cromoARecibir){
		if(album[(cromoACambiar)-1]<2){
			System.out.println("Ese cromo no lo tienes o no lo tienes repetido, no lo puedes cambiar");
		}else{
			album[cromoACambiar-1]--;
			album[cromoARecibir-1]++;
			System.out.println("Intercambio realizado");
		}
	}
	
	public static void rellenar(){
		for(int i=0; i< album.length; i++){
			album[i]=0;
		}
	}
	public static void ver(){
		for(int i=0; i<album.length; i++){
			System.out.println("Cromo "+(i+1)+"____"+album[i]);
		}
		System.out.println();

	}

	
	
	public static void menu(){
		int operacion=0;
		
	
		
	while(!fin){
		
		System.out.println("Indique que operacion quiere hacer");
		System.out.println("");
		System.out.println("1 .- |---Comprar sobres-----------|");
		System.out.println("2 .- |---Consultar un cromo-------|");
		System.out.println("3 .- |---Listar cromos repetidos--|");
		System.out.println("4 .- |---Listar cromos pendientes-|");
		System.out.println("5 .- |---Cambiar cromos-----------|");
		System.out.println("6 .- |---Salir--------------------|");
		operacion=teclado.nextInt();
		
		while(operacion < 1 || operacion > 6){
			System.out.println("Error indique de nuevo la operacion quiere hacer");
			operacion=teclado.nextInt();
		}
		
			switch (operacion) {
			case 1:
				int cantSobre = 0;
				System.out.println("¿Cuantos sobres quieres comprar?");
				cantSobre=teclado.nextInt();
				if(albumLleno()){
					System.out.println("Tu album ya está completo");
				}else{
				sobreNuevo(cantSobre);
				ver();
				}
				
				break;
			
			case 2:
				int cromoConsultado=0;
				System.out.println("¿Que cromo quieres consultar?");
				cromoConsultado=teclado.nextInt();
				consultaCromo(cromoConsultado);
				break;
				
			case 3: 
				listarRepetidos();
				break;
				
			case 4: 
				listarPendientes();
				break;				
			
			case 5:
				int cromoACambiar=0, cromoARecibir=0;
				System.out.println("¿Qué cromo quieres dar tú?");
				cromoACambiar=teclado.nextInt();
				System.out.println("¿Que cromo quieres obtener?");
				cromoARecibir=teclado.nextInt();
				cambiarCromos(cromoACambiar, cromoARecibir);
				break;
				
			case 6:
				fin=true;
				break;
			}
		}	
			
	}
	
	public static void main(String[] args) {
		rellenar();
		menu();

	}

}
